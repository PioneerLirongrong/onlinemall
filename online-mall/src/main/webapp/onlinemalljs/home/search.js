var onlineMallSearch = function () {

};
onlineMallSearch.prototype = {
    mapData: {},
    config: {
        homeFlag: {},
        initDataUrl: "/shop/listCollect.do"
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
            param = "连衣裙";
        } else {
            param = decodeURI(parmValue["search"]);
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
        var queryUrl = GOOD_TYPE_QUERY_URL.Query(param) + ".do";
        console.log(queryUrl + "=====")
        if(queryUrl == "/shop/listClothes.do"){
            param = "连衣裙"
        }
        data['params["goodsname"]'] = param;
        $.ajax({
            type: "POST",
            url: queryUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                    var jsonArr = result.dataList;
                    console.log(jsonArr)
                    $("#searchGoods").empty()
                    $(jsonArr).each(function () {
                        $("#searchGoods").append(
                            "<li>\n" +
                            "<div class=\"list \">\n" +
                            "<a href=\"../home/introduction.jsp?id=" + this.id + "&queryUrl=" + queryUrl + "\">\n" +
                            "<img src=\" http://127.0.0.1:8082/" + this.url + " \"/>\n" +
                            "<div class=\"pro-title \">" + this.goodsname + "</div>\n" +
                            "<span class=\"e-price \">￥" + this.originalprice + "</span>\n" +
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
    search_goods: function () {
        var obj = this;
        $("#ai-topsearch").click(function () {
            obj.search();
        })
    },
    search: function () {
        var info = this;
        var data = {}
        var param = $("#searchInput").val();
        if (null == param || "" == param || typeof(param) == "undefined") {
            alert("未填写查抄信息,默认查找")
            data['params["goodsname"]'] = "连衣裙";
        } else {
            data['params["goodsname"]'] = param;
        }
        var queryUrl = GOOD_TYPE_QUERY_URL.Query(param) + ".do";
        if (queryUrl == "/shop/listClothes") {
            alert("未匹配到改了类型的数据，查询默认数据")
        }
        console.log(queryUrl + "=====")
        $.ajax({
            type: "POST",
            url: queryUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                    var jsonArr = result.dataList;
                    console.log(jsonArr)
                    $("#searchGoods").empty();
                    $(jsonArr).each(function () {
                        $("#searchGoods").append(
                            "<li>\n" +
                            "<div class=\"list \">\n" +
                            "<a href=\"../home/introduction.jsp?id=" + this.id + "&queryUrl=" + queryUrl + "\">\n" +
                            "<img src=\" http://127.0.0.1:8082/" + this.url + " \"/>\n" +
                            "<div class=\"pro-title \">" + this.goodsname + "</div>\n" +
                            "<span class=\"e-price \">￥" + this.originalprice + "</span>\n" +
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
};
$(document).ready(function () {
    var search = new onlineMallSearch();
    search.init();
    search.search_goods();
});