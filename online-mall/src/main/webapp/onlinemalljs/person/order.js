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
        //1:待付款 2:代发货 3:待收货 4:待评价 5:退款
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
    //所有订单 0
    initAllOrderInfo: function () {
        var info = this;
        var data = {};
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
                        //1:待付款 2:代发货 3:待收货 4:待评价 5:退款
                        var status = "";
                        var order_status = this.orderstatus;
                        if (0 == order_status) {
                            status = "拍下商品";
                        } else if (1 == order_status) {
                            status = "卖家发货";
                        } else if (2 == order_status) {
                            status = "代发货";
                        } else if (3 == order_status) {
                            status = "待收货";
                        } else if (4 == order_status) {
                            status = "待评价";
                        } else {
                            status = "退款";
                        }
                        $("#AllOrder").append(
                            "<div class=\"order-status5\">\n" +
                            "<div class=\"order-title\">\n" +
                            "<div class=\"dd-num\">订单编号：<a href=\"javascript:;\">" + "8307296207293" + Math.round(Math.random() * 10) + "</a></div>\n" +
                            "<span>成交时间：" + MD5_UTILS.timestampToTime(this.orderchengjiaotime) + "</span>\n" +
                            "</div>\n" +
                            "<div class=\"order-content\">\n" +
                            "<div class=\"order-left\">\n" +
                            "<ul class=\"item-list\">\n" +
                            "<li class=\"td td-item\">\n" +
                            "<div class=\"item-pic\">\n" +
                            "<a href=\"#\" class=\"J_MakePoint\">\n" +
                            "<img src=http://127.0.0.1:8082/" + this.goodsurl + "\n" +
                            "class=\"itempic J_ItemImg\">\n" +
                            "</a>\n" +
                            "</div>\n" +
                            "<div class=\"item-info\">\n" +
                            "<div class=\"item-basic-info\">\n" +
                            "<a href=\"#\">\n" +
                            "<p>" + this.goodsname + "</p>\n" +
                            "</a>\n" +
                            "</div>\n" +
                            "</div>\n" +
                            "</li>\n" +
                            "<li class=\"td td-price\">\n" +
                            "<div class=\"item-price\">\n" +
                            this.goodsprice +
                            "</div>\n" +
                            "</li>\n" +
                            "<li class=\"td td-number\">\n" +
                            "<div class=\"item-number\">\n" +
                            "<span>×</span>"+this.goodscount+"\n" +
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
                            "合计：" + this.ordertotalamount + "\n" +
                            "<p>含运费：<span>" + this.orderwuliutotalamount + "</span></p>\n" +
                            "</div>\n" +
                            "</li>\n" +
                            "<div class=\"move-right\">\n" +
                            "<li class=\"td td-status\">\n" +
                            "<div class=\"item-status\">\n" +
                            "<p class=\"Mystatus\">" + status + "</p>\n" +
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
    //待支付的订单 1
    initWatiPayOrder: function () {
        var info = this;
        var data = {};
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        data['params["orderstatus"]'] = "1";
        $.ajax({
            type: "POST",
            url: this.config.updateInfoUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                //1:待付款 2:代发货 3:待收货 4:待评价 5:退款
                if (result.code == '1') {
                    var jsonArr = result.dataList;
                    $(jsonArr).each(function () {
                        $("#waitPayOrder").append(
                            "<div class=\"order-status5\">\n" +
                            "<div class=\"order-title\">\n" +
                            "<div class=\"dd-num\">订单编号：<a href=\"javascript:;\">" + "8307296207293" + Math.round(Math.random() * 10) + "</a></div>\n" +
                            "<span>成交时间：" + MD5_UTILS.timestampToTime(this.orderchengjiaotime) + "</span>\n" +
                            "</div>\n" +
                            "<div class=\"order-content\">\n" +
                            "<div class=\"order-left\">\n" +
                            "<ul class=\"item-list\">\n" +
                            "<li class=\"td td-item\">\n" +
                            "<div class=\"item-pic\">\n" +
                            "<a href=\"#\" class=\"J_MakePoint\">\n" +
                            "<img src=http://127.0.0.1:8082/" + this.goodsurl + "\n" +
                            "class=\"itempic J_ItemImg\">\n" +
                            "</a>\n" +
                            "</div>\n" +
                            "<div class=\"item-info\">\n" +
                            "<div class=\"item-basic-info\">\n" +
                            "<a href=\"#\">\n" +
                            "<p>" + this.goodsname + "</p>\n" +
                            "</a>\n" +
                            "</div>\n" +
                            "</div>\n" +
                            "</li>\n" +
                            "<li class=\"td td-price\">\n" +
                            "<div class=\"item-price\">\n" +
                            this.goodsprice +
                            "</div>\n" +
                            "</li>\n" +
                            "<li class=\"td td-number\">\n" +
                            "<div class=\"item-number\">\n" +
                            "<span>×</span>"+this.goodscount+"\n" +
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
                            "合计：" + this.ordertotalamount + "\n" +
                            "<p>含运费：<span>" + this.orderwuliutotalamount + "</span></p>\n" +
                            "</div>\n" +
                            "</li>\n" +
                            "<div class=\"move-right\">\n" +
                            "<li class=\"td td-status\">\n" +
                            "<div class=\"item-status\">\n" +
                            "<p class=\"Mystatus\">等待买家付款</p>\n" +
                            "</div>\n" +
                            "</li>\n" +
                            "<li class=\"td td-change\">\n" +
                            "<a href=\"../home/pay.jsp\">\n" +
                            "<div class=\"am-btn am-btn-danger anniu\">\n" +
                            "一键支付\n" +
                            "</div>\n" +
                            "</a>\n" +
                            "</li>\n" +
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
    //待发货 2
    initWaitOutOrder: function () {
        var info = this;
        var data = {};
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        data['params["orderstatus"]'] = "2";
        $.ajax({
            type: "POST",
            url: this.config.updateInfoUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                //1:待付款 2:代发货 3:待收货 4:待评价 5:退款
                if (result.code == '1') {
                    if (result.code == '1') {
                        var jsonArr = result.dataList;
                        $(jsonArr).each(function () {
                            $("#WaitOutOrder").append(
                                "<div class=\"order-status5\">\n" +
                                "<div class=\"order-title\">\n" +
                                "<div class=\"dd-num\">订单编号：<a href=\"javascript:;\">" + "8307296207293" + Math.round(Math.random() * 10) + "</a></div>\n" +
                                "<span>成交时间：" + MD5_UTILS.timestampToTime(this.orderchengjiaotime) + "</span>\n" +
                                "</div>\n" +
                                "<div class=\"order-content\">\n" +
                                "<div class=\"order-left\">\n" +
                                "<ul class=\"item-list\">\n" +
                                "<li class=\"td td-item\">\n" +
                                "<div class=\"item-pic\">\n" +
                                "<a href=\"#\" class=\"J_MakePoint\">\n" +
                                "<img src=http://127.0.0.1:8082/" + this.goodsurl + "\n" +
                                "class=\"itempic J_ItemImg\">\n" +
                                "</a>\n" +
                                "</div>\n" +
                                "<div class=\"item-info\">\n" +
                                "<div class=\"item-basic-info\">\n" +
                                "<a href=\"#\">\n" +
                                "<p>" + this.goodsname + "</p>\n" +
                                "</a>\n" +
                                "</div>\n" +
                                "</div>\n" +
                                "</li>\n" +
                                "<li class=\"td td-price\">\n" +
                                "<div class=\"item-price\">\n" +
                                this.goodsprice +
                                "</div>\n" +
                                "</li>\n" +
                                "<li class=\"td td-number\">\n" +
                                "<div class=\"item-number\">\n" +
                                "<span>×</span>"+this.goodscount+"\n" +
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
                                "合计：" + this.ordertotalamount + "\n" +
                                "<p>含运费：<span>" + this.orderwuliutotalamount + "</span></p>\n" +
                                "</div>\n" +
                                "</li>\n" +
                                "<div class=\"move-right\">\n" +
                                "<li class=\"td td-status\">\n" +
                                "<div class=\"item-status\">\n" +
                                "<p class=\"Mystatus\">买家已付款</p>\n" +
                                "</div>\n" +
                                "</li>\n" +
                                "<li class=\"td td-change\">\n" +
                                "<div class=\"am-btn am-btn-danger anniu\" onclick=\"messages()\">\n" +
                                "提醒发货\n" +
                                "</div>\n" +
                                "</li>\n" +
                                "</div>"
                            )
                        })
                    }
                }
            },
            error: function () {
                info.execption("系统异常");
            }
        });

    },
    //待收货 3
    initWaitInOrder: function () {
        var info = this;
        var data = {};
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        data['params["orderstatus"]'] = "3";
        $.ajax({
            type: "POST",
            url: this.config.updateInfoUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                //1:待付款 2:代发货 3:待收货 4:待评价 5:退款
                if (result.code == '1') {
                    if (result.code == '1') {
                        var jsonArr = result.dataList;
                        var i = 0;
                        $(jsonArr).each(function () {
                            $("#WaitInOrder").append(
                                "<div class=\"order-status5\">\n" +
                                "<div class=\"order-title\">\n" +
                                "<div class=\"dd-num\">订单编号：<a href=\"javascript:;\">" + "8307296207293" + Math.round(Math.random() * 10) + "</a></div>\n" +
                                "<span>成交时间：" + MD5_UTILS.timestampToTime(this.orderchengjiaotime) + "</span>\n" +
                                "</div>\n" +
                                "<div class=\"order-content\">\n" +
                                "<div class=\"order-left\">\n" +
                                "<ul class=\"item-list\">\n" +
                                "<li class=\"td td-item\">\n" +
                                "<div class=\"item-pic\">\n" +
                                "<a href=\"#\" class=\"J_MakePoint\">\n" +
                                "<img src=http://127.0.0.1:8082/" + this.goodsurl + "\n" +
                                "class=\"itempic J_ItemImg\">\n" +
                                "</a>\n" +
                                "</div>\n" +
                                "<div class=\"item-info\">\n" +
                                "<div class=\"item-basic-info\">\n" +
                                "<a href=\"#\">\n" +
                                "<p>" + this.goodsname + "</p>\n" +
                                "</a>\n" +
                                "</div>\n" +
                                "</div>\n" +
                                "</li>\n" +
                                "<li class=\"td td-price\">\n" +
                                "<div class=\"item-price\">\n" +
                                this.goodsprice +
                                "</div>\n" +
                                "</li>\n" +
                                "<li class=\"td td-number\">\n" +
                                "<div class=\"item-number\">\n" +
                                "<span>×</span>"+this.goodscount+"\n" +
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
                                "合计：" + this.ordertotalamount + "\n" +
                                "<p>含运费：<span>" + this.orderwuliutotalamount + "</span></p>\n" +
                                "</div>\n" +
                                "</li>\n" +
                                "<div class=\"move-right\">\n" +
                                "<li class=\"td td-status\">\n" +
                                "<div class=\"item-status\">\n" +
                                "<p class=\"Mystatus\">卖家已发货</p>\n" +
                                "<p class=\"order-info\"><a href=\"logistics.jsp\">查看物流</a></p>\n" +
                                "</div>\n" +
                                "</li>\n" +
                                "<li class=\"td td-change\">\n" +
                                "<div id=\'divs" + i + "\' onclick='receive($(this).attr(\"id\"))' class=\"am-btn am-btn-danger anniu\">\n" +
                                "确认收货\n" +
                                "</div>\n" +
                                "</li>\n" +
                                "</div>"
                            )
                        })
                    }
                }
            },
            error: function () {
                info.execption("系统异常");
            }
        });

    },
    //待评价 4
    initWaitEvaluateOrder: function () {
        var info = this;
        var data = {};
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        data['params["orderstatus"]'] = "4";
        $.ajax({
            type: "POST",
            url: this.config.updateInfoUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                //1:待付款 2:代发货 3:待收货 4:待评价 5:退款
                if (result.code == '1') {
                    if (result.code == '1') {
                        var jsonArr = result.dataList;
                        $(jsonArr).each(function () {
                            $("#WaitEvaluateOrder").append(
                                "<div class=\"order-status5\">\n" +
                                "<div class=\"order-title\">\n" +
                                "<div class=\"dd-num\">订单编号：<a href=\"javascript:;\">" + "8307296207293" + Math.round(Math.random() * 10) + "</a></div>\n" +
                                "<span>成交时间：" + MD5_UTILS.timestampToTime(this.orderchengjiaotime) + "</span>\n" +
                                "</div>\n" +
                                "<div class=\"order-content\">\n" +
                                "<div class=\"order-left\">\n" +
                                "<ul class=\"item-list\">\n" +
                                "<li class=\"td td-item\">\n" +
                                "<div class=\"item-pic\">\n" +
                                "<a href=\"#\" class=\"J_MakePoint\">\n" +
                                "<img src=http://127.0.0.1:8082/" + this.goodsurl + "\n" +
                                "class=\"itempic J_ItemImg\">\n" +
                                "</a>\n" +
                                "</div>\n" +
                                "<div class=\"item-info\">\n" +
                                "<div class=\"item-basic-info\">\n" +
                                "<a href=\"#\">\n" +
                                "<p>" + this.goodsname + "</p>\n" +
                                "</a>\n" +
                                "</div>\n" +
                                "</div>\n" +
                                "</li>\n" +
                                "<li class=\"td td-price\">\n" +
                                "<div class=\"item-price\">\n" +
                                this.goodsprice +
                                "</div>\n" +
                                "</li>\n" +
                                "<li class=\"td td-number\">\n" +
                                "<div class=\"item-number\">\n" +
                                "<span>×</span>"+this.goodscount+"\n" +
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
                                "合计：" + this.ordertotalamount + "\n" +
                                "<p>含运费：<span>" + this.orderwuliutotalamount + "</span></p>\n" +
                                "</div>\n" +
                                "</li>\n" +
                                "<div class=\"move-right\">\n" +
                                "<li class=\"td td-status\">\n" +
                                "<div class=\"item-status\">\n" +
                                "<p class=\"Mystatus\">交易成功</p>\n" +
                                "<p class=\"order-info\"><a href=\"logistics.jsp\">查看物流</a></p>\n" +
                                "</div>\n" +
                                "</li>\n" +
                                "<li class=\"td td-change\">\n" +
                                "<a href=\"commentlist.jsp\">\n" +
                                "<div class=\"am-btn am-btn-danger anniu\">\n" +
                                "评价商品\n" +
                                "</div>\n" +
                                "</a>\n" +
                                "</li>\n" +
                                "</div>"
                            )
                        })
                    }
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