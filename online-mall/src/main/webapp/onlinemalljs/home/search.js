var onlineMallSearch = function () {

};
onlineMallSearch.prototype = {
    mapData:{
    },
    config: {
        homeFlag:{},
        initDataUrl:"/shop/listCollect.do"
    },
    exception: function (message) {
        alert(message)
    },
    display: function () {
    },
    init: function () {
        var home = this;
        var param = "";
        var searchContent ="";
        var parmValue = MD5_UTILS.getParmValue();
        console.log(parmValue)
        if(typeof(parmValue["search"]) == "undefined"){
            searchContent = $("#searchInput").val();
            if(null == searchContent || "" == searchContent || !searchContent ){
                param = Math.round(Math.random()*10);
            } else {
                param = searchContent;
            }
        }else {
            param = parmValue["search"];
        }
        COMMONUSERINFOUTIL.getUserInfo(function (data) {
            home.mapData = data;
            console.log("this data is "+home.mapData["userid"])
        });
        home.init_goods(param);
    },
    init_goods:function (param) {
        var info = this;
        var data= {}
        data['params["clothestype"]'] = param;
        $.ajax({
            type: "POST",
            url: this.config.initDataUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                    if (result.code == '1') {
                        var innerText = $("p").text();
                        alert(innerText)
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
        var info = this;
        var search = $("ai-topsearch").val();
        var data={}
        $.ajax({
            type: "POST",
            url: this.config.initDataUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                    if (result.code == '1') {
                        alert("aaaa")
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
    var search = new onlineMallSearch();
    search.init();
    search.search_goods();
});