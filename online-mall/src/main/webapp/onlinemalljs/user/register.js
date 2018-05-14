var register = function () {

};
register.prototype = {
    config: {
        registerUrl: '/onlinemall/registerUser.do',
        returnUrl: '/home/login.jsp',
        param:'username'
    },
    error: function (message) {
        alert(message);
    },
    login: function () {
        var thatloging = this;
        $("#regisTerSubmitMail").click(function () {
            thatloging.submintMail();
        });
        $("#regisTerSubmitPhone").click(function () {
            thatloging.submintPhone();
        });
    },
    submintMail: function () {
        var loginObj = this;
        var email = $("#email").val();
        var password1 = $("#passwordMail").val();
        var password2 = $("#passwordRepeatMail").val();
        if (!($('#readerMe').is(':checked'))) {
            loginObj.error("请勾选同意商城协议")
            return;
        }
        var reg = new RegExp("[a-zA-Z0-9]{1,10}@[a-zA-Z0-9]{1,5}\\.[a-zA-Z0-9]{1,5}");
        if (!(reg.test(email))) {
            loginObj.error("邮箱格式不正确!!!请确认后填写")
            return;
        }
        if (email == '' || email == null) {
            loginObj.error("请输入邮箱")
            return;
        }
        if (password1 == '' || password1 == null || password2 == '' || password2 == null) {
            loginObj.error("请输入密码");
            return;
        }
        if (password1 != password2) {
            loginObj.error("两次密码不一样,请重新确认密码")
            return;
        }
        var mail = $.trim(email); // 去掉首尾空格
        var password1 = $.trim(password1);
        var password2 = $.trim(password2);
        var data = {};
        data['params["mail"]'] = mail;
        data['params["password1"]'] = password1;
        data['params["password2"]'] = password2;
        $.ajax({
            type: "POST",
            url: this.config.registerUrl,
            data: data,
            dataType: "JSON",
            success: function (result) {
                var data = '';
                if (result.code == '1') {
                    var reg = new RegExp("[a-zA-Z0-9]{1,10}@[a-zA-Z0-9]{1,5}\\.[a-zA-Z0-9]{1,5}");
                    if (result.dataObj.mail != null && reg.test(result.dataObj.mail)) {
                        console.log(result.dataObj.mail)
                        data = result.dataObj.mail;
                    }
                    window.location.href = loginObj.config.returnUrl+"?"+MD5_UTILS.encryption(loginObj.config.param+'='+data);
                }
            },
            error: function () {
                loginObj.error("系统异常");
            }
        });
    },
    submintPhone: function () {
        var loginObj = this;
        var phonenumber = $("#phone").val();
        var password1 = $("#passwordPhone").val();
        var password2 = $("#passwordRepeatPhone").val();
        if (!($('#reader-me').is(':checked'))) {
            loginObj.error("请勾选同意商城协议")
            return;
        }
        var reg = new RegExp("^[1][3,4,5,7,8][0-9]{9}$");
        if (!(reg.test(phonenumber))) {
            loginObj.error("手机号格式不正确!!!请确认后填写")
            return;
        }
        if (phonenumber == '' || phonenumber == null) {
            loginObj.error("请输入手机号")
            return;
        }
        if (password1 == '' || password1 == null || password2 == '' || password2 == null) {
            loginObj.error("请输入密码");
            return;
        }
        if (password1 != password2) {
            loginObj.error("两次密码不一样,请重新确认密码")
            return;
        }
        var phonenumber = $.trim(phonenumber); // 去掉首尾空格
        var password1 = $.trim(password1);
        var password2 = $.trim(password2);
        var data = {};
        data['params["phonenumber"]'] = phonenumber;
        data['params["password1"]'] = password1;
        data['params["password2"]'] = password2;
        $.ajax({
            type: "POST",
            url: this.config.registerUrl,
            data: data,
            dataType: "JSON",
            success: function (result) {
                var data = '';
                if (result.code == '1') {
                    var reg = new RegExp("^[1][3,4,5,7,8][0-9]{9}$");
                    if (result.dataObj.phonenumber != null && reg.test(result.dataObj.phonenumber)) {
                        console.log(result.dataObj.phonenumber)
                        data = result.dataObj.phonenumber
                    }
                    window.location.href = loginObj.config.returnUrl+"?"+MD5_UTILS.encryption(loginObj.config.param+'='+data);
                }
            },
            error: function () {
                loginObj.error("系统异常");
            }
        });
    }
}
$(document).ready(function () {
    var reg = new register();
    reg.login();
});