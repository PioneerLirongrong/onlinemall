var loginoop = function () {

};
loginoop.prototype={
    config: {
        loingUrl:'/account/loginAccount.do',
        returnUrl:"../../index.jsp"
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
        var name = $.trim(userName); // 去掉首尾空格
        var password = $.trim(password);
        var params = new Array();
        params.push({
            name:'equal[phonenumber]',
            value:name
        })
        params.push({
            name:'equal[password]',
            value:password
        });
        // params['phonenumber']=name;
        // params['password']=password;
        $.ajax({
            type : "POST",
            url :this.config.loingUrl,
            data :params,
            dataType : "json",
            success : function(result) {
                if (result.code == '1') {
                    // alert(path)
                    // window.location.href ="index.jsp";
                    window.location.href=loginObj.config.returnUrl;
                } else {
                    $.ligerDialog.error(result.message);
                    //loginObj.initImgCode();
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
    },
    fetchCookieLoginName : function() {
        var ctfo_userName = $.cookie("ctfo_zc_userName");
        var ctfo_rememberLoginFlag = $.cookie("ctfo_zc_rememberLoginFlag");
        if (ctfo_userName != null) {
            $("input[name=username]").val(ctfo_userName);
        }
        if (ctfo_rememberLoginFlag == 1) {
            $("input[name=rememberLoginName]").attr("checked", true);
        }
    },
}
$(document).ready(function () {
    var log = new loginoop();
    log.initImgCode();
    log.fetchCookieLoginName();
    log.login();
});