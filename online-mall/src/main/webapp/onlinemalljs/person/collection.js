var onlineMallCollection = function () {

};
onlineMallCollection.prototype = {
    mapData: {},
    config: {
        updateInfoUrl: "/collect/listCollect.do",
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
                    $("#collect").empty();
                    $(jsonArr).each(function () {
                        $("#collect").append(
                            "<div class=\"s-item-wrap\" >"+
                            "<div class=\"s-item\">\n" +
                            "<div class=\"s-pic\">\n" +
                            "<a href=\"javascript:void(0)\" class=\"s-pic-link\">\n" +
                            "<img src=\"http://127.0.0.1:8082/"+this.url+"\" class=\"s-pic-img s-guess-item-img\">\n" +
                            "</a>\n" +
                            "</div>\n" +
                            "<div class=\"s-info\">\n" +
                            "<div class=\"s-title\"><a href=\"javascript:void(0)\" title=\""+this.goodName+"\">"+this.goodName+"</a></div>\n"+
                            "<div class=\"s-title\">\n" +
                            "</div>\n" +
                            "<div class=\"s-price-box\">\n" +
                            "<span class=\"s-price\"><em class=\"s-price-sign\">¥</em><em\n" +
                            "class=\"s-value\">"+this.originalPrice+"</em></span>\n" +
                            "<span class=\"s-history-price\"><em class=\"s-price-sign\">¥</em><em\n" +
                            "class=\"s-value\">"+this.discountPrice+"</em></span>\n" +
                            "</div>\n" +
                            "<div class=\"s-extra-box\">\n" +
                            "<span class=\"s-comment\">好评: "+this.goodEvaluate+"</span>\n" +
                            "<span class=\"s-sales\">月销: "+this.saleMonth+"</span>\n" +
                            "</div>\n" +
                            "</div>\n" +
                            "</div>"+
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
    var collect = new onlineMallCollection();
    collect.init();
});