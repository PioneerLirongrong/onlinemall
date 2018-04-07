var register = function () {

};
register.prototype={
    config: {
        registerUrl:'/account/registerAccount.do',
        returnUrl:'/view/account/login.jsp'

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
        $("#loginSubmit").click(function () {
            thatloging.submint();
        })
    },
    initImgCode : function() {
        $("#imgCode_img").attr("src", "/account/rondamImage.do?d" + (new Date().getTime()));
    },
    submint:function () {

        var loginObj = this;
        var userName = $("#userName").val();
        var password = $("#password").val();
        if (userName == '' || userName == null || userName == "请输入手机号/账号") {
            $.ligerDialog.error("请输入手机号");
            return;
        }
        if (password == '' || password == null || password == "") {
            $.ligerDialog.error("请输入短信验证码");
            return;
        }
        $("#loginMessage").html("&nbsp;");
        loginObj.rememberLoginName(userName);// 用户信息写入cookie
        var phonenumber = $.trim(userName); // 去掉首尾空格
        var password = $.trim(password);
        var params = {};
        params['phonenumber']=phonenumber;
        params['password']=password;
        $.ajax({
            type : "POST",
            url :this.config.registerUrl,
            data :params,
            dataType : "JSON",
            success:function (result) {
                console.log(result);
                if(result.code == '1') {
                    window.location.href = loginObj.config.returnUrl;
                }
            },
            error : function() {
                $.ligerDialog.error('系统异常，请重试！');
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