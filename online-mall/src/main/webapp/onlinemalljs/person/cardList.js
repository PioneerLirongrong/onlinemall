var onlineMallCardList = function () {

};
onlineMallCardList.prototype = {
    mapData: {},
    config: {
        updateInfoUrl: "/userBanks/listBankCards.do",
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
        indexnew.submit();
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
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        $.ajax({
            type: "POST",
            url: this.config.updateInfoUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                    var jsonArr = result.dataList;
                    $(jsonArr).each(function () {
                        var css = "";
                        var bankname = this.bankname;
                        var banktype = this.banktype;
                        var banknumber = this.banknumber.substr(-4);
                        if (banktype == '1') {
                            css = "<span class=\"card-type card-type-CC\"></span>";
                        } else if (banktype == '2') {
                            css = "<span class=\"card-type card-type-DC\"></span>";
                        } else {
                            css = "<span class=\"card-type card-type-CC\"></span>";
                        }
                        $("#cardListUl").append(
                            "<li>\n" +
                            "<div class=\"card-box\">\n" +
                            "<div class=\"card-box-name\">\n" +
                            "<span class=\"bank-logo\"><a><img src=\"../images/bankjh.png\"></a></span>\n" +
                            "<span title=\"" + bankname + "\" class=\"bank-name\">" + bankname + "</span>\n" +
                            "<span class=\"bank-num4\">尾号" + banknumber + "</span>\n" +
                            css +
                            "</div>\n" +
                            "<div class=\"card-box-express\">\n" +
                            "<div class=\"express-status\">\n" +
                            "<span class=\"asset-icon asset-icon-express-s\"></span> <span>已开通</span>\n" +
                            "</div>\n" +
                            "</div>\n" +
                            "</div>\n" +
                            "</li>"
                        );
                    });
                }
            },
            error: function () {
                info.execption("系统异常");
            }
        });

    }
};
$(document).ready(function () {
    var cardList = new onlineMallCardList();
    // cardList.init();
    cardList.updateInfo();
});