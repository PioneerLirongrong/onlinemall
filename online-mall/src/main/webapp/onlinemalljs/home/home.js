var onlineMallHome = function () {

};
onlineMallHome.prototype = {
    mapData:{
    },
    config: {
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
                        var jsonArr = result.dataList;
                        $(jsonArr).each(function () {
                            $("#home").append(
                                alert("aaaaa")
                            )
                        })
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
    var home = new onlineMallHome();
    home.init();
    home.init_goods();
});