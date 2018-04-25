var register = function () {

};
register.prototype={
    config: {
        registerUrl:'/onlinemall/registerUser.do',
        returnUrl:'/home/login.jsp'

    },
    error:function(message){
        alert(message);
    },
    login:function () {
        var thatloging = this;
        $("#imgCode_img").click(function() {
            thatloging.initImgCode();
        });
        $("#imgCode").blur(function() {
            if (this.value == "") {
                $("#loginMessage").html("请输入验证码");
            } else {
                $("#loginMessage").html("");
            }
        });
        $("#regisTerSubmitMail").click(function () {
            thatloging.submint();
        })
    },
    initImgCode : function() {
        $("#imgCode_img").attr("src", "/account/rondamImage.do?d" + (new Date().getTime()));
    },
    submint:function () {
        var loginObj = this;
        var email = $("#email").val();
        var password1 = $("#passwordMail").val();
        var password2 = $("#passwordRepeatMail").val();
        if (!($('#readerMe').is(':checked'))) {
            loginObj.error("请勾选同意商城协议")
            return;
        }
        var reg = new RegExp("[a-zA-Z0-9]{1,10}@[a-zA-Z0-9]{1,5}\\.[a-zA-Z0-9]{1,5}");
        if(!(reg.test(email))){
            loginObj.error("邮箱格式不正确!!!请确认后填写")
            return;
        }
        if (email == '' || email == null ) {
            loginObj.error("请输入邮箱")
            return;
        }
        if (password1 == '' || password1 == null || password2 == '' || password2 == null) {
            ligerDialog.error("请输入密码");
            return;
        }
        if(password1 != password2){
            loginObj.error("两次密码不一样,请重新确认密码")
            return;
        }
        // loginObj.rememberLoginName(email);// 用户信息写入cookie
        var mail = $.trim(email); // 去掉首尾空格
        var password1 = $.trim(password1);
        var password2 = $.trim(password2);
        var data = {};
        data['params["mail"]']=mail;
        data['params["password1"]']=password1;
        data['params["password2"]']=password2;
        $.ajax({
            type : "POST",
            url :this.config.registerUrl,
            data :data,
            dataType : "JSON",
            success:function (result) {
                console.log(result);
                if(result.code == '1') {
                    window.location.href = loginObj.config.returnUrl;
                }
            },
            error : function() {
                console.log("aaaaaa")
                loginObj.error('系统异常，请重试！');
            }
        });

    },
    rememberLoginName : function(userName) {
        var rememberLoginName = $('input[name=rememberLoginName]').attr("checked");
        if (rememberLoginName) {
            $.cookie("ctfo_zc_userName", userName, {
                path : '/',
                expires : 30
            });
            $.cookie("ctfo_zc_rememberLoginFlag", "1", {
                path : '/',
                expires : 30
            });
        } else {
            $.cookie("ctfo_zc_rememberLoginFlag", null, {
                path : '/'
            });
            $.cookie("ctfo_zc_userName", null, {
                path : '/'
            });
        }
    }
}
$(document).ready(function () {
    var reg = new register();
    reg.initImgCode();
    // reg.fetchCookieLoginName();
    reg.login();
});