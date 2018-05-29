var onlineMallShopCar = function () {

};
onlineMallShopCar.prototype = {
    mapData:{
    },
    config: {
        homeFlag:{},
        initDataUrl:"/onlinemallShopCar/listShopCarItems.do"
    },
    exception: function (message) {
        alert(message)
    },
    init: function () {
        var home = this;
        COMMONUSERINFOUTIL.getUserInfo(function (data) {
            home.mapData = data;
            console.log("this data is "+home.mapData["userid"])
        });
        //初始化购物车的数据
        home.init_goods();
    },
    init_goods:function () {
        var info = this;
        var data= {};
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        $.ajax({
            type: "POST",
            url: this.config.initDataUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                    if (result.code == '1') {
                        //遍历后台传回来的值
                        var jsonArr = result.dataList;
                        console.log(jsonArr)
                        $("#shopCarDiv").empty()
                        $(jsonArr).each(function () {
                            $("#shopCarDiv").append(
                                "<ul class=\"item-content clearfix\">\n" +
                                "<li class=\"td td-item\">\n" +
                                "<div class=\"item-pic\">\n" +
                                "<a href=\"introduction.jsp?id="+this.goodsid+"&queryUrl="+this.queryurl+"\" target=\"_blank\" data-title=\"\"\n" +
                                "class=\"J_MakePoint\" data-point=\"tbcart.8.12\">\n" +
                                "<img src=\"http://127.0.0.1:8082/"+this.url+"\" class=\"itempic J_ItemImg\"></a>\n" +
                                "</div>\n" +
                                "</div>\n" +
                                "</li>\n" +
                                "<li class=\"td td-info\">\n" +
                                "<div class=\"item-props item-props-can\">\n" +
                                "</div>\n" +
                                "</li>\n" +
                                "<li class=\"td td-price\">\n" +
                                "<div class=\"item-price price-promo-promo\">\n" +
                                "<div class=\"price-content\">\n" +
                                "<div class=\"price-line\">\n" +
                                "</div>\n" +
                                "<div class=\"price-line\">\n" +
                                "<input id=\"price\" type=\"text\" disabled=\"disabled\" class=\"J_Price price-now\" tabindex=\"0\" value=\""+this.discouuntprice+"\">"+
                                "</div>\n" +
                                "</div>\n" +
                                "</div>\n" +
                                "</li>\n" +
                                "<li class=\"td td-amount\">\n" +
                                "<div class=\"amount-wrapper \">\n" +
                                "<div class=\"item-amount \">\n" +
                                "<div class=\"sl\">\n" +
                                "<input class=\" am-btn\"  type=\"button\" value=\"-\" onclick=\"reduce(\'"+this.goodsid+"\',\'"+this.queryurl+"\')\"/>"+
                                // "<input class=\" am-btn\" name=\"\" type=\"button\" value=\"-\" onclick=\"reduce(\'"+this.goodsid+"\')\"/>\n" +
                                "<input id=\"count\" class=\"text_box\" name=\"\" type=\"text\" value=\""+this.goodcount+"\" style=\"width:30px;\"/>\n" +
                                "<input class=\" am-btn\"  type=\"button\" value=\"+\" onclick=\"addCount(\'"+this.goodsid+"\',\'"+this.queryurl+"\')\"/>"+
                                // "<input class=\" am-btn\" name=\"\" type=\"button\" value=\"+\" onclick=\"addCount(\'"+this.goodsid+"\')\"/>\n" +
                                "</div>\n" +
                                "</div>\n" +
                                "</div>\n" +
                                "</li>\n" +
                                "<li class=\"td td-sum\">\n" +
                                "<div class=\"td-inner\">\n" +
                                "<input id='emtotal1' disabled='disabled'　tabindex=\"0\" class=\"J_ItemSum number\" value='117.00'>" +
                                "</div>\n" +
                                "</li>\n" +
                                "<li class=\"td td-op\">\n" +
                                "<div class=\"td-inner\">\n" +
                                "<a onclick=\"deleteShopCar(\'"+this.id+"\')\" href=\"javascript:void(0);\" class=\"delete\">\n" +
                                "删除</a>" +
                                "</div>\n" +
                                "</li>\n" +
                                "</ul>"
                            )
                        })
                        var news = $("#count").val()
                        var price = $("#price").val();
                        var addTotal = new BigDecimal(price).multiply(new BigDecimal(news.toString()));
                        $("#emtotal1").attr("value",addTotal.toString())
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
    var shopCar = new onlineMallShopCar();
    shopCar.init();
});