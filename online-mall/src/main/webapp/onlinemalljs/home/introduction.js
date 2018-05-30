var onlineMallIntroduction = function () {

};
onlineMallIntroduction.prototype = {
    pageMap: {},
    mapData: {},
    config: {
        homeFlag: {},
        initDataUrl: "/order/addOrder.do",
        //添加收藏的接口
        addcollectUrl: "/collect/addCollect.do",
        //添加购物车的接口
        addshopCarUrl: "/onlinemallShopCar/addShopCarItem.do",
        //添加足记的接口
        addFootUrl: "/foot/addRecord.do"
    },
    exception: function (message) {
        alert(message)
    },
    init: function () {
        var home = this;
        var queryUrl = "";
        var id = "";
        var parmValue = MD5_UTILS.getQueryAndId();
        console.log(parmValue["queryUrl"] + "\t" + parmValue["id"])
        if (typeof(parmValue["queryUrl"]) == "undefined" || typeof(parmValue["id"]) == "undefined") {
            alert("页面加载失败,工程师正在抢救")
            return;
        } else {
            queryUrl = parmValue["queryUrl"];
            id = parmValue["id"];
            console.log(queryUrl + "\t" + id)
            home.pageMap["id"] = id;
            home.pageMap["queryUrl"] = queryUrl;
        }
        COMMONUSERINFOUTIL.getUserInfo(function (data) {
            home.mapData = data;
            console.log("this data is " + home.mapData["userid"])
        });
        home.init_goods(queryUrl, id);
        COMMONUSERINFOUTIL.getUserLoginOut(function (data) {
            if (data['status'] == "login") {
                home.save_foot(queryUrl,id)
            }
        })
    },
    init_goods: function (queryUrl, id) {
        var info = this;
        var data = {}
        data['params["id"]'] = id;
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
                        $("#item-inform").empty();
                        $("#J_AttrUL").empty();
                        console.log(jsonArr)
                        $(jsonArr).each(function () {
                            $("#inform").empty();
                            $("#inform").append(
                                "<div class=\"clearfixLeft\" id=\"clearcontent\">\n" +
                                "\n" +
                                "<div class=\"box\">\n" +
                                "<div class=\"tb-booth tb-pic tb-s310\">\n" +
                                "<a href=\"http://127.0.0.1:8082/" + this.url + "\"><img src=\"http://127.0.0.1:8082/" + this.url + "\" alt=\"细节展示放大镜特效\" rel=\"../images/01.jpg\"\n" +
                                "class=\"jqzoom\"/></a>\n" +
                                "</div>\n" +
                                "</div>\n" +
                                "\n" +
                                "<div class=\"clear\"></div>\n" +
                                "</div>\n" +
                                "\n" +
                                "<div class=\"clearfixRight\">\n" +
                                "<div class=\"tb-detail-hd\">\n" +
                                "<h1>\n" + this.goodsname + "</h1>\n" +
                                "</div>\n" +
                                "<div class=\"tb-detail-list\">\n" +
                                "<!--价格-->\n" +
                                "<div class=\"tb-detail-price\">\n" +
                                "<li class=\"price iteminfo_price\">\n" +
                                "<dt>促销价</dt>\n" +
                                "<dd><em>¥</em><b class=\"sys_item_price\">" + this.discouuntprice + "</b></dd>\n" +
                                "</li>\n" +
                                "<li class=\"price iteminfo_mktprice\">\n" +
                                "<dt>原价</dt>\n" +
                                "<dd><em>¥</em><b class=\"sys_item_mktprice\">" + this.originalprice + "</b></dd>\n" +
                                "</li>\n" +
                                "<div class=\"clear\"></div>\n" +
                                "</div>\n" +
                                "<!--销量-->\n" +
                                "<ul class=\"tm-ind-panel\">\n" +
                                "<li class=\"tm-ind-item tm-ind-sellCount canClick\">\n" +
                                "<div class=\"tm-indcon\"><span class=\"tm-label\">月销量</span><span class=\"tm-count\">" + this.salesmonth + "</span></div>\n" +
                                "</li>\n" +
                                "<li class=\"tm-ind-item tm-ind-sumCount canClick\">\n" +
                                "<div class=\"tm-indcon\"><span class=\"tm-label\">累计销量</span><span class=\"tm-count\">" + this.salescount + "</span>\n" +
                                "</div>\n" +
                                "</li>\n" +
                                "<li class=\"tm-ind-item tm-ind-reviewCount canClick tm-line3\">\n" +
                                "<div class=\"tm-indcon\"><span class=\"tm-label\">累计评价</span><span class=\"tm-count\">" + this.evaluatecount + "</span></div>\n" +
                                "</li>\n" +
                                "</ul>\n" +
                                "<div class=\"clear\"></div>\n" +
                                "<div class=\"pay\">\n" +
                                "<li>\n" +
                                "<div class=\"clearfix tb-btn tb-btn-buy theme-login\">\n" +
                                "<a id=\"ShopBuy\" title=\"点此按钮到下一步确认购买信息\" href=\"javascript:void(0)\">立即购买</a>" +
                                "</div>\n" +
                                "</li>\n" +
                                "<li>\n" +
                                "<div class=\"clearfix tb-btn tb-btn-basket theme-login\">\n" +
                                "<a id=\"addShopCar\" title=\"加入购物车\" href=\"javascript:void(0)\"><i></i>加入购物车</a>\n" +
                                "</div>\n" +
                                "</li>\n" +
                                "</li>\n" +
                                "<li>\n" +
                                "<div class=\"clearfix tb-btn tb-btn-basket theme-login\">\n" +
                                "<a id=\"addCollect\" title=\"添加收藏\" href=\"javascript:void(0)\"><i></i>添加收藏</a>\n" +
                                "</div>\n" +
                                "</li>" +
                                "</div>\n" +
                                "</div>\n" +
                                "<div class=\"clear\"></div>\n" +
                                "</div>\n" +
                                "<div class=\"theme-signin-right\">\n" +
                                "<div class=\"img-info\">\n" +
                                "<img src=\"../images/songzi.jpg\"/>\n" +
                                "</div>\n" +
                                "<div class=\"text-info\">\n" +
                                "<span class=\"J_Price price-now\">¥" + this.discouuntprice + "</span>\n" +
                                "<span id=\"Stock\" class=\"tb-hidden\">库存<span class=\"stock\">" + Math.round(Math.random() * 10000) + "</span>件</span>\n" +
                                "</div>\n" +
                                "</div>\n" +
                                "</form>"
                            );
                            $("#J_AttrUL").append(
                                "<li title=\"\">生产日期:&nbsp;" + MD5_UTILS.timestampToTime(this.producttime) + "</li>\n" +
                                "<li title=\"\">所属公司:&nbsp;" + this.productcompany + "</li>\n" +
                                "<li title=\"\">产品标号:&nbsp;" + this.productid + "</li>\n" +
                                "<li title=\"\">原料产地:&nbsp;" + this.productplace + "</li>\n" +
                                "<li title=\"\">产品许可证:&nbsp;" + this.productallow + "</li>\n" +
                                "<li title=\"\">产地:&nbsp;" + this.place + "</li>\n" +
                                "<li title=\"\">产品标准号:&nbsp;GB/T 22165</li>\n"
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
    save_foot: function (queryUrl,param) {
        var info = this;
        var data = {}
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        data['params["goodsid"]'] = param;
        data['params["queryurl"]'] = queryUrl;
        $.ajax({
            type: "POST",
            url: info.config.addFootUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                    console.log("添加足成功!!!")
                }
            },
            error: function () {
                info.execption("系统异常");
            }
        });
    },
    operate_goods: function () {
        var obj = this;
        $("#addCollect").click(function () {
            COMMONUSERINFOUTIL.getUserLoginOut(function (data) {
                if (data['status'] == "login") {
                    obj.addCollect();
                } else {
                    alert("请登录后操作")
                    return;
                }
            })
        })
        $("#addShopCar").click(function () {
            COMMONUSERINFOUTIL.getUserLoginOut(function (data) {
                if (data['status'] == "login") {
                    obj.addShopCar();
                } else {
                    alert("请登录后操作")
                    return;
                }
            })
        })
        $("#ShopBuy").click(function () {
            COMMONUSERINFOUTIL.getUserLoginOut(function (data) {
                if (data['status'] == "login") {
                    $('#ShopBuy').attr('href', "../home/pay.jsp?id=" + obj.pageMap["id"] + "&queryUrl=" + obj.pageMap["queryUrl"]);
                } else {
                    alert("请登录后操作")
                    return;
                }
            })
        })
    },
    addCollect: function () {
        var info = this;
        var data = {};
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        data['params["goodsid"]'] = info.pageMap["id"];
        data['params["queryurl"]'] = info.pageMap["queryUrl"];
        console.log(data['params["goodsid"]'])
        $.ajax({
            type: "POST",
            url: this.config.addcollectUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                    if (result.code == '1') {
                        alert("收藏成功!!")
                    }else {
                        info.exception("收藏失败")
                    }
                }
            },
            error: function () {
                info.execption("系统异常");
            }
        });
    },
    addShopCar: function () {
        var info = this;
        var data = {};
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        data['params["goodsid"]'] = info.pageMap["id"];
        data['params["queryurl"]'] = info.pageMap["queryUrl"];
        data['params["flag"]'] = "add";
        console.log(data['params["goodsid"]'])
        $.ajax({
            type: "POST",
            url: info.config.addshopCarUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                    alert("添加成功!!!")
                }else {
                    info.exception("添加失败")
                }
            },
            error: function () {
                info.execption("系统异常");
            }
        });
    }
};
$(document).ready(function () {
    var introduction = new onlineMallIntroduction();
    introduction.init();
    introduction.operate_goods();
});