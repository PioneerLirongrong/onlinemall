var onlineMallQuestion = function () {

};
onlineMallQuestion.prototype = {
    mapData: {},
    config: {
        updateInfoUrl: "/onlinemall/updateUserSecurityDegree.do",
        returnUrl: '../person/safety.jsp'
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
        var ansower1 = $("#user-answer1").val().trim();
        var ansower2 = $("#user-answer2").val().trim();
        var question1 = $("#data-am-selected_1 option:selected").val().trim();
        var question2 = $("#data-am-selected_2 option:selected").val().trim();
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        data['params["securityproblem1"]'] = question1
        data['params["securityansower1"]'] = ansower1;
        data['params["securityproblem2"]'] = question2
        data['params["securityansower2"]'] = ansower2;
        $.ajax({
            type: "POST",
            url: this.config.updateInfoUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                    $("#questionForm").attr('action',info.config.returnUrl);
                }
            },
            error: function () {
                info.execption("系统异常");
            }
        });

    }
};
$(document).ready(function () {
    var question = new onlineMallQuestion();
    // information.init();
    question.updateInfo();
});