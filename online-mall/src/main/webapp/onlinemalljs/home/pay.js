var onlineMallPay = function () {

};
onlineMallPay.prototype = {
    pageMap: {},
    mapData: {},
    config: {
        homeFlag: {},
        initDataUrl: "/shop/listCollect.do",
        initAddressUrl: "/userAddress/listAddress.do"
    },
    exception: function (message) {
        alert(message)
    },
    display: function () {
    },
    init: function () {
        var home = this;
        var param = "";
        var parmValue = MD5_UTILS.getMap();
        console.log(parmValue["search"])
        if (typeof(parmValue["search"]) == "undefined") {
            param = "羽绒服";
        } else {
            param = decodeURI(parmValue["search"]);
        }
        COMMONUSERINFOUTIL.getUserInfo(function (data) {
            home.mapData = data;
            console.log("this data is " + home.mapData["userid"])
        });
        home.init_address();
        // home.init_goods(param);
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
                                "<span class=\"buy-user\">" + this.username +"</span>\n" +
                                "<span class=\"buy-phone\">" + this.phonenumber+"</span>\n" +
                                "</span>\n" +
                                "</div>\n" +
                                "<div class=\"default-address DefaultAddr\">\n" +
                                "<span class=\"buy-line-title buy-line-title-type\">收货地址：</span>\n" +
                                "<span class=\"buy--address-detail\">\n" +
                                "<span class=\"province\">" + this.province + "</span>省\n" +
                                "<span class=\"city\">" + this.city + "</span>市\n" +
                                "<span class=\"dist\">" + this.county + "</span>区\n" +
                                "<span id=\"address"+i+"\" class=\"street\">" + this.useraddress + "</span>\n" +
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
        var queryUrl = GOOD_TYPE_QUERY_URL.Query(param) + ".do";
        console.log(queryUrl + "=====")
        data['params["goodsname"]'] = param;
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
                        $(jsonArr).each(function () {
                            $(jsonArr).each(function () {
                                $("#searchGoods").append(
                                    "<li>\n" +
                                    "<div class=\"list \">\n" +
                                    "<a href=\"../home/introduction.jsp?id=" + this.id + "&queryUrl=" + queryUrl + "\">\n" +
                                    "<img src=\"../images/cp.jpg \"/>\n" +
                                    "<div class=\"pro-title \">" + this.goodsname + "</div>\n" +
                                    "<span class=\"e-price \">￥" + this.originalprice + "</span>\n" +
                                    "</a>\n" +
                                    "</div>\n" +
                                    "</li>"
                                )
                            })
                        })
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
        if("card" == arg){
            home.pageMap["payWay"]="银联";
        }else if("qq" == arg){
            home.pageMap["payWay"]="微信";
        }else {
            home.pageMap["payWay"]="支付宝";
        }
        console.log(home.pageMap["payWay"])
        alert(home.pageMap["payWay"])
    },
    getWuliuWay:function (arg) {
        var home = this;
        if("1" == arg){
            home.pageMap["logistics"]="圆通";
        }else if("2" == arg){
            home.pageMap["logistics"]="申通";
        }else if("3" == arg){
            home.pageMap["logistics"]="韵达";
        }else if("4" == arg){
            home.pageMap["logistics"]="中通";
        }else{
            home.pageMap["logistics"]="顺丰"
        }
        console.log(home.pageMap["logistics"])
        alert(home.pageMap["logistics"])
    }
};
$(document).ready(function () {
    var pay = new onlineMallPay();
    pay.init();
    pay.operate_event();
});