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
                                "<a href=\" ../home/introduction.js?id="+this.goodsid+"&&queryUrl="+this.queryurl+"\" target=\"_blank\" data-title=\"\"\n" +
                                "class=\"J_MakePoint\" data-point=\"tbcart.8.12\">\n" +
                                "<img src=\""+this.url+"\" class=\"itempic J_ItemImg\"></a>\n" +
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
                                "<em class=\"price-original\">"+this.originalprice+"</em>\n" +
                                "</div>\n" +
                                "<div class=\"price-line\">\n" +
                                "<em class=\"J_Price price-now\" tabindex=\"0\">"+this.discouuntprice+"</em>\n" +
                                "</div>\n" +
                                "</div>\n" +
                                "</div>\n" +
                                "</li>\n" +
                                "<li class=\"td td-amount\">\n" +
                                "<div class=\"amount-wrapper \">\n" +
                                "<div class=\"item-amount \">\n" +
                                "<div class=\"sl\">\n" +
                                "<input class=\" am-btn\" name=\"\" type=\"button\" value=\"-\" onclick=\"reduce(1)\"/>\n" +
                                "<input id=\"count\" class=\"text_box\" name=\"\" type=\"text\" value=\"1\" style=\"width:30px;\"/>\n" +
                                "<input class=\" am-btn\" name=\"\" type=\"button\" value=\"+\" onclick=\"addCount(1)\"/>\n" +
                                "</div>\n" +
                                "</div>\n" +
                                "</div>\n" +
                                "</li>\n" +
                                "<li class=\"td td-sum\">\n" +
                                "<div class=\"td-inner\">\n" +
                                "<input tabindex=\"0\" class=\"J_ItemSum number\" value='117.00'>" +
                                "</div>\n" +
                                "</li>\n" +
                                "<li class=\"td td-op\">\n" +
                                "<div class=\"td-inner\">\n" +
                                "<a onclick=\"moveCollect()\" title=\"移入收藏夹\" class=\"btn-fav\" href=\"javascript:void(0);\">\n" +
                                "移入收藏夹</a>\n" +
                                "<a onclick=\"deleteShopCar()\" href=\"javascript:void(0);\" class=\"delete\">\n" +
                                "删除</a>\n" +
                                "</div>\n" +
                                "</li>\n" +
                                "</ul>"
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
    search_goods:function () {
        var obj = this;
        $("#ai-topsearch").click(function () {
            obj.search();
        })
    },
    search:function () {
        var param = "";
        var searchContent = $("#searchInput").val();
        if(null == searchContent || "" == searchContent || !searchContent){
            param = "羽绒服";
        }else {
            param = searchContent;
        }
        window.location.href = "../home/search.jsp"+"?"+"search="+encodeURI(param);
    },
    moveCollect:function () {
        alert("moveCollect")
    },
    deleteShopCar:function () {
        alert("deleteShopCar")
    }
};
$(document).ready(function () {
    var shopCar = new onlineMallShopCar();
    shopCar.init();
    shopCar.operate_goods();
});