var onlineMallSetppay = function () {

};
onlineMallSetppay.prototype = {
    mapData: {},
    config: {
        updateInfoUrl: "/onlinemall/updateUserSecurityDegree.do",
        returnUrl: '/person/safety.jsp',
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
    updateInfo:function(){
        var indexnew  = this;
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
            $("#user-email").val(that.mapData["mail"]);
        }
    },
    submit: function () {
        var info = this;
        var data = {};
        var newpassword = $("#user-pay-password").val().trim();
        var confirmpassword = $("#user-confirm-pay-password").val().trim();
        if(newpassword != confirmpassword){
            alert("两次密码不一样,请确认后重新输入")
            return
        }
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        data['params["realname"]'] = newpassword;
        data['params["pay_password_2"]'] = confirmpassword;
        data['params["pay_password_1"]'] = newpassword;
        $.ajax({
            type: "POST",
            url: this.config.updateInfoUrl,
            data: data,
            dataType: "JSON",
            async:true,
            async:false,
            success: function (result) {
                if (result.code == '1') {
                    $("#passwordForm").attr('action',info.config.returnUrl);
                }
            },
            error: function () {
                info.execption("系统异常");
            }
        });
        return false;
    }
};
$(document).ready(function () {
    var setppay = new onlineMallSetppay();
    // password.init();
    setppay.updateInfo();
});