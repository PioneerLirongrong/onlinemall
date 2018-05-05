var onlinemallLogin = function () {

};
onlinemallLogin.prototype={
    config: {
        loingUrl:'/onlinemall/loginUser.do',
        returnUrl:"/home/home3.jsp",
        able:false
    },
    init:function(){
        var parmValue = MD5_UTILS.getParmValue();
        if(typeof(parmValue["username"]) == "undefined"){
            return;
        }
        //设置登录框的值
        $("#user").attr("value",parmValue["username"]);
        $("#password").attr("value","")
    },
    error:function(message){
        alert(message);
    },
    login:function () {
        var logins = this;
        var thatloging = this;
        $("#imgCode_img").click(function() {
            logins.initImgCode();
        });
        $("#imgCode").blur(function() {
            if (this.value == "") {
                $("#loginMessage").html("请输入验证码");
            } else {
                $("#loginMessage").html("");
            }
        });
        $("#loginSubmit").click(function () {
            thatloging.submint();
        })
    },
    initImgCode : function() {
        $("#imgCode_img").attr("src", "/account/rondamImage.do?d" + (new Date().getTime()));
    },
    submint:function () {
        var loginObj = this;
        var data={}
        var userName = $("#user").val();
        var password = $("#password").val();
        if (userName == '' || userName == null) {
            loginObj.error("请输入邮箱/手机/用户名");
            return;
        }
        var reg = new RegExp("[a-zA-Z0-9]{1,10}@[a-zA-Z0-9]{1,5}\\.[a-zA-Z0-9]{1,5}");
        if((reg.test(userName))){
            data['params["mail"]']=$.trim(userName);
        }
        var reg = new RegExp("^[1][3,4,5,7,8][0-9]{9}$");
        if((reg.test(userName))){
            data['params["phonenumber"]']=$.trim(userName);
        }
        if(data['params["mail"]'] == '' || data['params["phonenumber"]'] == ''){
            data['params["account"]']=$.trim(userName);
        }
        if (password == '' || password == null ) {
            loginObj.error("请输入密码");
            return;
        }else {
            data['params["password"]']=$.trim(password);
        }
        loginObj.rememberLoginName($.trim(userName),$.trim(password));// 用户信息写入cookie
        $.ajax({
            type : "POST",
            url :this.config.loingUrl,
            data :data,
            dataType : "JSON",
            success : function(result) {
                if (result.code == '1') {
                    //在cookie中缓存userId
                    $.cookie("onlinemall_zc_userId",result.dataObj.userid,{
                        path:'/',
                        expires : 30
                    });
                    console.log($.cookie("onlinemall_zc_userId"))
                    window.location.href=loginObj.config.returnUrl;
                } else {
                    loginObj.error(result.message);
                }
            },
            error : function() {
                loginObj.error("系统异常");
            }
        });

    },
    rememberLoginName : function(userName,password) {
        var rememberLoginName = $("#remember-me").is(":checked");
        if (rememberLoginName) {
            $.cookie("onlinemall_zc_userName", userName, {
                path : '/',
                expires : 30
            });
            $.cookie("onlinemall_zc_password",password,{
                path: '/',
                expires : 30
            });
            $.cookie("onlinemall_zc_rememberLoginFlag", "1", {
                path : '/',
                expires : 30
            });
        } else {
            $.cookie("onlinemall_zc_rememberLoginFlag", null, {
                path : '/'
            });
            $.cookie("onlinemall_zc_userName", null, {
                path : '/'
            });
            $.cookie("onlinemall_zc_password",null,{
                path: '/',
                expires : 30
            });
        }
    },
    fetchCookieLoginName : function() {
        var parmValue = MD5_UTILS.getParmValue();
        if(typeof(parmValue["username"]) != "undefined"){
            return;
        }
        var ctfo_userName = $.cookie("onlinemall_zc_userName");
        var ctfo_password = $.cookie("onlinemall_zc_password");
        var ctfo_rememberLoginFlag = $.cookie("onlinemall_zc_rememberLoginFlag");
        if (ctfo_userName != null) {
            $("#user").val(ctfo_userName);
        }
        if(ctfo_password != null){
            $("#password").val(ctfo_password);
        }
        if (ctfo_rememberLoginFlag == 1) {
            $("#remember-me").attr("checked", true);
        }
    }
};
$(document).ready(function () {
    var log = new onlinemallLogin();
    log.init();
    log.fetchCookieLoginName();
    log.login();
});