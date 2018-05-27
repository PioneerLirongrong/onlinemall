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
                        $(jsonArr).each(function () {
                            $("#home").append(
                                "<li>\n" +
                                "<div class=\"list \">\n" +
                                "<a href=\"../home/introduction.jsp?id="+this.id+"&queryUrl="+info.config.initDataUrl+"\">\n" +                                "<img src=\"../images/cp.jpg \"/>\n" +
                                "<div class=\"pro-title \">"+this.goodsname+"</div>\n" +
                                "<span class=\"e-price \">￥"+this.originalprice+"</span>\n" +
                                "</a>\n" +
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
};
$(document).ready(function () {
    var shopCar = new onlineMallShopCar();
    shopCar.init();
    shopCar.init_goods();
    shopCar.search_goods();
});