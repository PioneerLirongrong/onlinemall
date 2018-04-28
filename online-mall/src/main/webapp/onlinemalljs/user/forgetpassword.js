var forgetPass = function () {

};
forgetPass.prototype={
    config: {
        registerUrl:'/onlinemall/findPassByMailOrPhone.do',
        returnUrl:'/home/login.jsp'
    },
    error:function(message){
        alert(message);
    },
    login:function () {
        var thatloging = this;
        $("#regisTerSubmitMail").click(function () {
            thatloging.submintMail();
        });
    },
    submintMail:function () {
        var data={};
        var loginObj = this;
        var email = $("#email").val();
        var password1 = $("#passwordMail").val();
        var password2 = $("#passwordRepeatMail").val();
        if (email == '' || email == null ) {
            loginObj.error("请输入邮箱/手机号")
            return;
        }
        var reg = new RegExp("[a-zA-Z0-9]{1,10}@[a-zA-Z0-9]{1,5}\\.[a-zA-Z0-9]{1,5}");
        if((reg.test(email))){
            data['params["mail"]']=$.trim(email);;
        }
        var reg = new RegExp("^[1][3,4,5,7,8][0-9]{9}$");
        if((reg.test(email))){
            data['params["phonenumber"]']=$.trim(email);
        }
        if (password1 == '' || password1 == null || password2 == '' || password2 == null) {
            loginObj.error("请输入密码");
            return;
        }
        if(password1 != password2){
            loginObj.error("两次密码不一样,请重新确认密码")
            return;
        }
        var password1 = $.trim(password1);
        var password2 = $.trim(password2);
        data['params["password1"]']=password1;
        data['params["password2"]']=password2;
        $.ajax({
            type : "POST",
            url :this.config.registerUrl,
            data :data,
            dataType : "JSON",
            success:function (result) {
                if(result.code == '1') {
                    window.location.href = loginObj.config.returnUrl;
                }else {
                    loginObj.error(result.message)
                }
            },
            error : function() {
                loginObj.error('系统异常，请重试！');
            }
        });
    },
}
$(document).ready(function () {
    var reg = new forgetPass();
    reg.login();
});