var onlineMallHome = function () {

};
onlineMallHome.prototype = {
    mapData:{
    },
    config: {
        homeFlag:{},
        initDataUrl:"/shop/listClothes.do"
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
    },
    init_goods:function () {
        var info = this;
        var data= {}
        $.ajax({
            type: "POST",
            url: this.config.initDataUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                        //遍历后台传回来的值
                        var jsonArr = result.dataList;
                        console.log(jsonArr)
                        $(jsonArr).each(function () {
                            $("#home").append(
                                "<li>\n" +
                                "<div class=\"list \">\n" +
                                "<a href=\"../home/introduction.jsp?id="+this.id+"&queryUrl="+info.config.initDataUrl+"\">\n" +
                                "<img src=\"http://127.0.0.1:8082/"+this.url+"\"/>\n" +
                                "<div class=\"pro-title \">"+this.goodsname+"</div>\n" +
                                "<span class=\"e-price \">￥"+this.originalprice+"</span>\n" +
                                "</a>\n" +
                                "</div>\n" +
                                "</li>"
                            )
                        })
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
            param = "连衣裙";
        }else {
            param = searchContent;
        }
        window.location.href = "../home/search.jsp"+"?"+"search="+encodeURI(param);
    },
};
$(document).ready(function () {
    var home = new onlineMallHome();
    home.init();
    home.init_goods();
    home.search_goods();
});