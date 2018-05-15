var onlineMallSafety = function () {

};
onlineMallSafety.prototype = {
    mapData: {},
    config: {
        updateInfoUrl: "/onlinemall/updateUserSecurityDegree.do",
        returnUrl: '../person/information.jsp',
    },
    execption: function (message) {
        alert(message)
    },
    init: function () {
        var index = this;
        COMMONUSERINFOUTIL.getUserInfo(function (data) {
            index.mapData = data;
            index.initUserInfo(index);
        });
    },
    updateInfo: function () {
        var indexnew = this;
        $("#submit").click(function () {
            indexnew.submit();
        });
    },
    initUserInfo: function (that) {
        if (typeof(that.mapData) != "undefined") {
            $("#userinfo").html(
                "<div><b>用户名：<i>" + that.mapData["account"] + "</i></b></div>\n" +
                "<div class=\"safeText\">\n" +
                "<a href=\"safety.jsp\">账户安全:<em style=\"margin-left:20px ;\">" + that.mapData["securitydegree"] + "</em>分</a>\n" +
                "<div class=\"progressBar\"><span style=\"left: -95px;\" class=\"progress\"></span></div>\n" +
                "</div>"
            )
            if ("" == this.mapData["securitypay"] || null == this.mapData["securitypay"]) {
                $("#check2").html(
                    " <a href=\"setpay.jsp\">\n" +
                    "<div class=\"am-btn am-btn-secondary\">未启用</div>\n" +
                    "</a>"
                )
            } else {
                $("#check2").html(
                    " <a href=\"setpay.jsp\">\n" +
                    "<div class=\"am-btn am-btn-secondary\">已启用</div>\n" +
                    "</a>"
                )
            };
            if("" == this.mapData["realname"] || null == this.mapData["realname"]){
                $("#check3").html(
                    "<a href=\"idcard.jsp\">\n" +
                    "<div class=\"am-btn am-btn-secondary\">未认证</div>\n" +
                    "</a>"
                )
            }else {
                $("#check3").html(
                    "<a href=\"idcard.jsp\">\n" +
                    "<div class=\"am-btn am-btn-secondary\">已认证</div>\n" +
                    "</a>"
                )
            }


            if ("" == this.mapData["securityansower1"] || null == this.mapData["securityansower1"]) {
                $("#check4").html(
                    " <a href=\"question.jsp\">\n" +
                    "<div class=\"am-btn am-btn-secondary\">未认证</div>\n" +
                    "</a>"
                )
            } else {
                $("#check4").html(
                    " <a href=\"question.jsp\">\n" +
                    "<div class=\"am-btn am-btn-secondary\">已认证</div>\n" +
                    "</a>"
                )
            }

        }
    },
    submit: function () {
        var info = this;
        var data = {};
        var account = $("#user-name1").val().trim();
        var name = $("#user-name2").val().trim();
        var sex = $('input[name="sex"]:checked').val();
        var year = $("#data-am-selected1 option:selected").val();
        var month = $("#data-am-selected2 option:selected").val();
        var birthday = year + "-" + month;
        var phone = $("#user-phone").val();
        if ("" != phone || null != phone) {
            var reg = new RegExp("^[1][3,4,5,7,8][0-9]{9}$");
            if (!(reg.test(phone))) {
                info.execption("手机号格式不正确!!!请确认后填写")
                return;
            }
        }
        var mail = $("#user-email").val();
        if ("" != mail || null != mail) {
            var reg = new RegExp("[a-zA-Z0-9]{1,10}@[a-zA-Z0-9]{1,5}\\.[a-zA-Z0-9]{1,5}");
            if (!(reg.test(mail))) {
                info.execption("邮箱格式不正确!!!请确认后填写")
                return;
            }
        }
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        data['params["accout"]'] = account
        data['params["name"]'] = name;
        data['params["sex"]'] = sex;
        data['params["birthday"]'] = birthday;
        data['params["phonenumber"]'] = phone;
        data['params["mail"]'] = mail;
        $.ajax({
            type: "POST",
            url: this.config.updateInfoUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                    window.location.href = info.config.returnUrl;
                }
            },
            error: function () {
                info.execption("系统异常");
            }
        });

    }
};
$(document).ready(function () {
    var safety = new onlineMallSafety();
    safety.init();
    safety.updateInfo();
});