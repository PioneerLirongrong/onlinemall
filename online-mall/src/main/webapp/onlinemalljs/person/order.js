var onlineMallOrder = function () {

};
onlineMallOrder.prototype = {
    mapData: {},
    config: {
        updateInfoUrl: "/order/listOrder.do"
    },
    execption: function (message) {
        alert(message)
    },
    initInfo: function () {
        var info = this;
        //所有订单
        info.initAllOrderInfo();
        //待支付的订单
        info.initWatiPayOrder();
        //待发货
        info.initWaitOutOrder();
        //待收货
        info.initWaitInOrder();
        //待评价
        info.initWaitEvaluateOrder();
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

    },
    initAllOrderInfo: function () {
        var info = this;
        var data = {};
//(0:拍下商品 1:卖家发货 2:确认收货 3:退款中 4:退款成功,5待发货,6待收货,7待评价)
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        data['params["orderstatus"]'] = "";
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
                        $("#AllOrder").append(
                            "<div class=\"order-status5\">\n" +
                            "<div class=\"order-title\">\n" +
                            "<div class=\"dd-num\">订单编号：<a href=\"javascript:;\">1601430</a></div>\n" +
                            "<span>成交时间：2015-12-20</span>\n" +
                            "</div>\n" +
                            "<div class=\"order-content\">\n" +
                            "<div class=\"order-left\">\n" +
                            "<ul class=\"item-list\">\n" +
                            "<li class=\"td td-item\">\n" +
                            "<div class=\"item-pic\">\n" +
                            "<a href=\"#\" class=\"J_MakePoint\">\n" +
                            "<img src=\"../images/kouhong.jpg_80x80.jpg\"\n" +
                            "class=\"itempic J_ItemImg\">\n" +
                            "</a>\n" +
                            "</div>\n" +
                            "<div class=\"item-info\">\n" +
                            "<div class=\"item-basic-info\">\n" +
                            "<a href=\"#\">\n" +
                            "<p>美康粉黛醉美唇膏 持久保湿滋润防水不掉色</p>\n" +
                            "<p class=\"info-little\">颜色：12#川南玛瑙\n" +
                            "<br/>包装：裸装 </p>\n" +
                            "</a>\n" +
                            "</div>\n" +
                            "</div>\n" +
                            "</li>\n" +
                            "<li class=\"td td-price\">\n" +
                            "<div class=\"item-price\">\n" +
                            "333.00\n" +
                            "</div>\n" +
                            "</li>\n" +
                            "<li class=\"td td-number\">\n" +
                            "<div class=\"item-number\">\n" +
                            "<span>×</span>2\n" +
                            "</div>\n" +
                            "</li>\n" +
                            "<li class=\"td td-operation\">\n" +
                            "<div class=\"item-operation\">\n" +
                            "\n" +
                            "</div>\n" +
                            "</li>\n" +
                            "</ul>\n" +
                            "</div>\n" +
                            "<div class=\"order-right\">\n" +
                            "<li class=\"td td-amount\">\n" +
                            "<div class=\"item-amount\">\n" +
                            "合计：676.00\n" +
                            "<p>含运费：<span>10.00</span></p>\n" +
                            "</div>\n" +
                            "</li>\n" +
                            "<div class=\"move-right\">\n" +
                            "<li class=\"td td-status\">\n" +
                            "<div class=\"item-status\">\n" +
                            "<p class=\"Mystatus\">交易成功</p>\n" +
                            "<p class=\"order-info\"><a href=\"logistics.jsp\">查看物流</a></p>\n" +
                            "</div>\n" +
                            "</li>\n" +
                            "</div>\n" +
                            "</div>\n" +
                            "</div>\n" +
                            "</div>"
                        )
                    })
                }
            },
            error: function () {
                info.execption("系统异常");
            }
        });
    },
    initWatiPayOrder: function () {
        var info = this;
        var data = {};
//(0:拍下商品 1:代付款 2:确认收货 3:退款中 4:退款成功,5待发货,6待收货,7待评价)
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        data['params["orderstatus"]'] = "1";
        $.ajax({
            type: "POST",
            url: this.config.updateInfoUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                    alert("aaaaa")
                    var jsonArr = result.dataList;
                    $(jsonArr).each(function () {

                    })
                }
            },
            error: function () {
                info.execption("系统异常");
            }
        });
    },
    initWaitOutOrder: function () {
        var info = this;
        var data = {};
//(0:拍下商品 1:代付款 2:确认收货 3:退款中 4:退款成功,5待发货,6待收货,7待评价)
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        data['params["orderstatus"]'] = "5";
        $.ajax({
            type: "POST",
            url: this.config.updateInfoUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                    alert("aaaaa")
                    var jsonArr = result.dataList;
                    $(jsonArr).each(function () {

                    })
                }
            },
            error: function () {
                info.execption("系统异常");
            }
        });

    },
    initWaitInOrder: function () {
        var info = this;
        var data = {};
//(0:拍下商品 1:代付款 2:确认收货 3:退款中 4:退款成功,5待发货,6待收货,7待评价)
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        data['params["orderstatus"]'] = "6";
        $.ajax({
            type: "POST",
            url: this.config.updateInfoUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                    alert("aaaaa")
                    var jsonArr = result.dataList;
                    $(jsonArr).each(function () {

                    })
                }
            },
            error: function () {
                info.execption("系统异常");
            }
        });

    },
    initWaitEvaluateOrder: function () {
        var info = this;
        var data = {};
//(0:拍下商品 1:代付款 2:确认收货 3:退款中 4:退款成功,5待发货,6待收货,7待评价)
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        data['params["orderstatus"]'] = "7";
        $.ajax({
            type: "POST",
            url: this.config.updateInfoUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                    alert("aaaaa")
                    var jsonArr = result.dataList;
                    $(jsonArr).each(function () {

                    })
                }
            },
            error: function () {
                info.execption("系统异常");
            }
        });
    }
};
$(document).ready(function () {
    var order = new onlineMallOrder();
    order.initInfo();
});