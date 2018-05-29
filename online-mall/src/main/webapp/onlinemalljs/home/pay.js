var onlineMallPay = function () {

};
onlineMallPay.prototype = {
    pageMap: {},
    mapData: {},
    config: {
        homeFlag: {},
        initDataUrl: "/shop/listCollect.do",
        initAddressUrl: "/userAddress/listAddress.do",
        initOrderUrl:"/order/addOrder.do",
        returnUrl:"../home/success.jsp"
    },
    exception: function (message) {
        alert(message)
    },
    display: function () {
    },
    init: function () {
        var home = this;
        var param = "";
        var parmValue = MD5_UTILS.getQueryAndId();
        console.log(parmValue["id"])
        if (typeof(parmValue["id"]) == "undefined") {
            alert("页面加载失败，正在抢救")
        } else {
            param = parmValue["id"];
            home.pageMap["id"]=param;
            home.pageMap["queryUrl"]=parmValue["queryUrl"]
        }
        COMMONUSERINFOUTIL.getUserInfo(function (data) {
            home.mapData = data;
            console.log("this data is " + home.mapData["userid"])
        });
        home.init_address();
        home.init_goods(param);
    },
    init_address: function () {
        var info = this;
        var data = {}
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        $.ajax({
            type: "POST",
            url: info.config.initAddressUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                    if (result.code == '1') {
                        var jsonArr = result.dataList;
                        console.log(jsonArr)
                        var i = 1;
                        $("#addressUL").empty();
                        $(jsonArr).each(function () {
                            $("#addressUL").append(
                                "<li id=\"l" + i + "\" class=\"user-addresslist\" onclick=\"getAddress()\">\n" +
                                "<div class=\"address-left\">\n" +
                                "<div class=\"user DefaultAddr\">\n" +
                                "<span class=\"buy-address-detail\">\n" +
                                "<span class=\"buy-user\">" + this.username + "</span>\n" +
                                "<span class=\"buy-phone\">" + this.phonenumber + "</span>\n" +
                                "</span>\n" +
                                "</div>\n" +
                                "<div class=\"default-address DefaultAddr\">\n" +
                                "<span class=\"buy-line-title buy-line-title-type\">收货地址：</span>\n" +
                                "<span class=\"buy--address-detail\">\n" +
                                "<span class=\"province\">" + this.province + "</span>省\n" +
                                "<span class=\"city\">" + this.city + "</span>市\n" +
                                "<span class=\"dist\">" + this.county + "</span>区\n" +
                                "<span id=\"address" + i + "\" class=\"street\">" + this.useraddress + "</span>\n" +
                                "</span>\n" +
                                "</span>\n" +
                                "</div>\n" +
                                "</div>\n" +
                                "<div class=\"clear\"></div>\n" +
                                "</li>"
                            )
                            i++;
                        })
                    }
                }
            },
            error: function () {
                info.execption("系统异常");
            }
        });
    },
    init_goods: function (param) {
        var info = this;
        var data = {}
        var queryUrl = info.pageMap["queryUrl"];
        console.log(queryUrl + "=====")
        data['params["id"]'] = param;
        $.ajax({
            type: "POST",
            url: queryUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                    if (result.code == '1') {
                        var jsonArr = result.dataList;
                        console.log(jsonArr)
                        $("#payUL").empty();
                        $(jsonArr).each(function () {
                            $("#payUL").append(
                                "<li class=\"td td-item\">\n" +
                                "<div class=\"item-pic\">\n" +
                                "<a href=\"javascript:void(0)\" class=\"J_MakePoint\">\n" +
                                "<img src=\"http://127.0.0.1:8082/"+this.url+"\"\n" +
                                "class=\"itempic J_ItemImg\"></a>\n" +
                                "</div>\n" +
                                "<div class=\"item-info\">\n" +
                                "<div class=\"item-basic-info\">\n" +
                                "<a href=\"javascript:void(0)\" class=\"item-title J_MakePoint\"\n" +
                                "data-point=\"tbcart.8.11\">"+this.goodsname+"</a>\n" +
                                "</div>\n" +
                                "</div>\n" +
                                "</li>\n" +
                                "\n" +
                                "<li class=\"td td-price\">\n" +
                                "<div class=\"item-price price-promo-promo\">\n" +
                                "<div class=\"price-content\">\n" +
                                "<input id=\"price\" class=\"J_Price price-now\" disabled=\"disabled\" value=\""+this.originalprice+"\">\n" +
                                "</div>\n" +
                                "</div>\n" +
                                "</li>\n"
                            )

                        })
                        if(result.dataList.length == 0){
                            return;
                        }
                        var wuliuway = 10;
                        var orig = $("#count").val().toString();
                        var price = $("#price").val().toString();
                        var addTotal = new BigDecimal(price).multiply(new BigDecimal(orig));
                        $("#emtotal1").attr("value",addTotal.toString())
                        var addTotal2 = new BigDecimal(addTotal.toString()).add(new BigDecimal(wuliuway.toString()));
                        $("#emtotal2").attr("value",addTotal2.toString())
                    }
                }
            },
            error: function () {
                info.execption("系统异常");
            }
        });
    },
    operate_event: function () {
        var obj = this;
        //获取地址
        $("#l1").click(function () {
            obj.getAddress("address1");
        })
        $("#l2").click(function () {
            obj.getAddress("address2");
        })
        $("#l3").click(function () {
            obj.getAddress("address3");
        })
        $("#l4").click(function () {
            obj.getAddress("address4");
        })
        $("#l5").click(function () {
            obj.getAddress("address5");
        })
        //获取物流
        $("#way1").click(function () {
            obj.getWuliuWay("1");
        })
        $("#way2").click(function () {
            obj.getWuliuWay("2");
        })
        $("#way3").click(function () {
            obj.getWuliuWay("3");
        })
        $("#way4").click(function () {
            obj.getWuliuWay("4");
        })
        $("#way5").click(function () {
            obj.getWuliuWay("5");
        })
        //获取支付方式
        $("#card").click(function () {
            obj.getPayWay("card");
        })
        $("#qq").click(function () {
            obj.getPayWay("qq");
        })
        $("#taobao").click(function () {
            obj.getPayWay("taobao");
        })
        //提交订单
        $("#J_Go").click(function () {
            obj.createOrder();
        })
    },
    getAddress: function (address) {
        var home = this;
        var address = $("#" + address + "").text();
        home.pageMap["address"] = address;
        alert(home.pageMap["address"]);
        console.log(home.pageMap)
    },
    getPayWay: function (arg) {
        var home = this;
        if ("card" == arg) {
            home.pageMap["payWay"] = "银联";
        } else if ("qq" == arg) {
            home.pageMap["payWay"] = "微信";
        } else {
            home.pageMap["payWay"] = "支付宝";
        }
        console.log(home.pageMap["payWay"])
        alert(home.pageMap["payWay"])
    },
    getWuliuWay: function (arg) {
        var home = this;
        if ("1" == arg) {
            home.pageMap["logistics"] = "圆通";
        } else if ("2" == arg) {
            home.pageMap["logistics"] = "申通";
        } else if ("3" == arg) {
            home.pageMap["logistics"] = "韵达";
        } else if ("4" == arg) {
            home.pageMap["logistics"] = "中通";
        } else {
            home.pageMap["logistics"] = "顺丰"
        }
        console.log(home.pageMap["logistics"])
        alert(home.pageMap["logistics"])
    },
    createOrder:function () {
        var info = this;
        var data = {}
        var queryUrl = info.config.initDataUrl;
        console.log(queryUrl + "=====")
        if(typeof(info.pageMap["address"]) == "undefined" || typeof(info.pageMap["logistics"]) == "undefined" ||
        typeof(info.pageMap["payWay"]) == "undefined"){
            alert("请完善订单的物流，支付方式，地址等信息")
            return;
        }
        var count = $("#count").val().toString();
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        data['params["goodsid"]'] = info.pageMap["id"];
        data['params["goodscount"]'] = count;
        data['params["ordertotalamount"]'] = count;
        var total = $("#emtotal2").val();
        data['params["ordertotalamount"]'] = total;
        data['params["orderwuliutotalamount"]'] = 10;
        data['params["orderaddress"]'] = encodeURI(info.pageMap["address"]);
        data['params["url"]'] = info.pageMap["queryUrl"];
        $.ajax({
            type: "POST",
            url:info.config.initOrderUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                    window.location.href=info.config.returnUrl;
                }
            },
            error: function () {
                info.execption("系统异常");
            }
        });
    }
};
$(document).ready(function () {
    var pay = new onlineMallPay();
    pay.init();
    pay.operate_event();
});