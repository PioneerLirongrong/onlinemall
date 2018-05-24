var onlineMallInformation = function () {

};
onlineMallInformation.prototype = {
    mapData: {},
    config: {
        updateInfoUrl: "/onlinemall/updateUserAllInformation.do",
        returnUrl: '../person/setpay.jsp',
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
            $("#info1").html(
                "<div><b>用户名：<i>" + that.mapData["account"] + "</i></b></div>\n" +
                "<div class=\"vip\">\n" +
                "<span></span><a >会员专享" + 3 + "</a>\n" +
                "</div>"
            )
            $("#user-name1").val(that.mapData["account"]);
            $("#user-name2").val(that.mapData["name"]);
            if ("1" == that.mapData["sex"]) {
                $("#radio1").attr("checked", true);
            } else if ("0" == that.mapData["sex"]) {
                $("#radio2").attr("checked", true);
            } else {
                $("#radio3").attr("checked", true);
            }
            if ('' != that.mapData['birthday']) {
                var yearMonth = that.mapData['birthday'];
                var arr = yearMonth.split("-");
                var year = arr[0];
                var month = arr[1];
                $("#data-am-selected1").find("option[value = '" + year + "']").attr("selected", "selected");
                $("#data-am-selected2").find("option[value = '" + month + "']").attr("selected", "selected");
            }
            $("#user-phone").val(that.mapData["phonenumber"]);
            $("#useremail").val(that.mapData["mail"]);
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
            data['params["phonenumber"]'] = phone;
        }
        var mail = $("#useremail").val();
        if ("" != mail || null != mail) {
            var reg = new RegExp("[a-zA-Z0-9]{1,10}@[a-zA-Z0-9]{1,5}\\.[a-zA-Z0-9]{1,5}");
            if (!(reg.test(mail))) {
                info.execption("邮箱格式不正确!!!请确认后填写")
                return;
            }
            data['params["mail"]'] = mail;
        }
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        data['params["account"]'] = account
        data['params["name"]'] = name;
        data['params["sex"]'] = sex;
        data['params["birthday"]'] = birthday;
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
    var information = new onlineMallInformation();
    information.init();
    information.updateInfo();
});