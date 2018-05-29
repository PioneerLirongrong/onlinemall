var onlineMallFoot = function () {

};
onlineMallFoot.prototype = {
    mapData: {},
    config: {
        updateInfoUrl: "/foot/listRecord.do",
    },
    execption: function (message) {
        alert(message)
    },
    init: function () {
        var index = this;
        index.initInfo();
    },
    initInfo: function () {
        var info = this;
        var data = {};
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        $.ajax({
            type: "POST",
            url: this.config.updateInfoUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                    //遍历后台传回来的值
                    var jsonArr = result.dataList;
                    console.log(jsonArr)
                    $("#footDiv").empty();
                    $(jsonArr).each(function () {
                        $("#footDiv").append(
                           "<div class=\"goods\">\n" +
                            "<div class=\"goods-date\">\n" +
                            "<s class=\"line\"></s>\n" +
                            "</div>\n" +
                            "<div class=\"goods-box first-box\">\n" +
                            "<div class=\"goods-pic\">\n" +
                            "<div class=\"goods-pic-box\">\n" +
                            "<p class=\"goods-pic-link\" target=\"_blank\" style=\"cursor: pointer\">\n" +
                            "<img src=\"http://127.0.0.1:8082/"+this.url+"\" class=\"goods-img\"></p>\n" +
                            "</div>\n" +
                            "</div>\n" +
                            "\n" +
                            "<div class=\"goods-attr\">\n" +
                            "<div class=\"good-title\">\n" +
                            "<a class=\"title\" style=\"cursor: pointer\" target=\"_blank\">"+this.goodName+"</a>\n" +
                            "</div>\n" +
                            "<div class=\"goods-price\">\n" +
                            "<span class=\"g_price\">\n" +
                            "<span>¥</span><strong>"+this.discountPrice+"</strong>\n" +
                            "</span>\n" +
                            "<span class=\"g_price g_price-original\">\n" +
                            "<span>¥</span><strong>"+this.originalPrice+"</strong>\n" +
                            "</span>\n" +
                            "</div>\n" +
                            "<div class=\"clear\"></div>\n" +
                            "</div>\n" +
                            "</div>\n" +
                            "</div>"
                        )
                    })
                }else {
                    info.execption("加载失败")
                }
            },
            error: function () {
                info.execption("系统异常");
            }
        });

    }
};
$(document).ready(function () {
    var foot = new onlineMallFoot();
    foot.init();
});