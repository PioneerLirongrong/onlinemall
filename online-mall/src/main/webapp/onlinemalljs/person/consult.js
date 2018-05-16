var onlineMallConsult = function () {

};
onlineMallConsult.prototype = {
    mapData: {},
    config: {
        updateInfoUrl: "/consult/addAcquireAdvice.do",
        returnUrl: '../person/consultation.jsp',
        flag:"1"
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
            $("#user-email").val(that.mapData["mail"]);
        }
    },
    submit: function () {
        var info = this;
        var data = {};
        var acquireadvicetype = $("#data-am-selected option:selected").val();
        var acquireadvicedetail = $("#textareId").val().trim();
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        data['params["acquireadvicetype"]'] = acquireadvicetype
        data['params["acquireadvicedetail"]'] = acquireadvicedetail;
        data['params["acquireadviceflag"]'] = info.config.flag;
        $.ajax({
            type: "POST",
            url: this.config.updateInfoUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                    alert("提交成功，请注意手机来电，会有专员客服与您联系,祝您生活愉快！！！")
                    $("#consultForm").attr('action',info.config.returnUrl);
                }
            },
            error: function () {
                info.execption("系统异常");
            }
        });

    }
};
$(document).ready(function () {
    var consult = new onlineMallConsult();
    // consult.init();
    consult.updateInfo();
});