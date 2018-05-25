var onlineMallHome = function () {

};
onlineMallHome.prototype = {
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
                    if (result.code == '1') {
                        var innerText = $("p").text();
                        alert(innerText)
                        //遍历后台传回来的值
                        // var jsonArr = result.dataList;
                        // $(jsonArr).each(function () {
                        //     $("#home").append(
                        //         alert("aaaaa")
                        //     )
                        // })
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
        var search = $("#searchInput").val();
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
                        var innerText = $("p").text();
                        alert(innerText)
                        // var jsonArr = result.dataList;
                        // $(jsonArr).each(function () {
                        //     $("#home").append(
                        //         alert("aaaaa")
                        //     )
                        // })
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
    var home = new onlineMallHome();
    home.init();
    home.init_goods();
    home.search_goods();
});