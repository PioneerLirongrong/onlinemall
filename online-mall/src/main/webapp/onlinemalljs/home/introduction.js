var onlineMallIntroduction = function () {

};
onlineMallIntroduction.prototype = {
    mapData: {},
    config: {
        homeFlag: {},
        initDataUrl: "/order/addOrder.do",
        addcollectUrl:"",
        addshopCarUrl:"",
        addFootUrl:""
    },
    exception: function (message) {
        alert(message)
    },
    init: function () {
        var home = this;
        var param = "";
        var parmValue = MD5_UTILS.getParmValue();
        console.log(parmValue["goodId"])
        if (typeof(parmValue["goodId"]) == "undefined") {
            alert("页面加载失败,工程师正在抢救")
            return;
        } else {
            param = parmValue["goodId"];
        }
        COMMONUSERINFOUTIL.getUserInfo(function (data) {
            home.mapData = data;
            console.log("this data is " + home.mapData["userid"])
        });
        home.init_goods(param);
    },
    init_goods: function (param) {
        var info = this;
        var data = {}
        data['params["id"]'] = param;
        $.ajax({
            type: "POST",
            url: this.config.initDataUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                    if (result.code == '1') {
                        var jsonArr = result.dataList;
                        console.log(jsonArr)
                        $(jsonArr).each(function () {
                            $("#searchGoods").append(
                                "<li>\n" +
                                "<div class=\"i-pic limit\">\n" +
                                "<img src=\""+this.url+"\"/>\n" +
                                "<p class=\"title fl\">"+this.shoesbrand+" "+this.goodsname+"</p>\n" +
                                "<p class=\"price fl\">\n" +
                                "<b>¥</b>\n" +
                                "<strong>"+this.originalprice+"</strong>\n" +
                                "</p>\n" +
                                "<p class=\"number fl\">\n" +
                                "销量<span>"+this.salescount+"</span>\n" +
                                "</p>\n" +
                                "</div>\n" +
                                "</li>"
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
    search_goods: function () {
        var obj = this;
        $("#ai-topsearch").click(function () {
            obj.search();
        })
    },
    search: function () {
        var info = this;
        var data = {}
        $.ajax({
            type: "POST",
            url: this.config.initDataUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                    if (result.code == '1') {
                        var jsonArr = result.dataList;
                        console.log(jsonArr);
                        $(jsonArr).each(function () {
                            $("#searchGoods").empty();
                            $("#searchGoods").append(
                                "<li>\n" +
                                "<div class=\"i-pic limit\">\n" +
                                "<img src=\""+this.url+"\"/>\n" +
                                "<p class=\"title fl\">"+this.shoesbrand+" "+this.goodsname+"</p>\n" +
                                "<p class=\"price fl\">\n" +
                                "<b>¥</b>\n" +
                                "<strong>"+this.originalprice+"</strong>\n" +
                                "</p>\n" +
                                "<p class=\"number fl\">\n" +
                                "销量<span>"+this.salescount+"</span>\n" +
                                "</p>\n" +
                                "</div>\n" +
                                "</li>"
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
};
$(document).ready(function () {
    var introduction = new onlineMallIntroduction();
    introduction.init();
    introduction.search_goods();
});