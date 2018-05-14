var onlineMallInformation = function () {

};
onlineMallInformation.prototype = {
    mapData: {},
    config: {},
    exception: function (message) {
        alert(message)
    },
    display: function () {
    },
    init: function () {
        var index = this;
        COMMONUSERINFOUTIL.getUserInfo(function (data) {
            index.mapData = data;
            index.initUserInfo(index);
        });
    },
    initUserInfo: function (that) {
        if (typeof(that.mapData) != "undefined") {
            $("#info1").html(
                "<div><b>用户名：<i>" + that.mapData["account"] + "</i></b></div>\n" +
                "<div class=\"vip\">\n" +
                "<span></span><a >会员专享" + 3 + "</a>\n" +
                "</div>"
            )
            $("#user-name1").val(that.mapData["account"])
            $("#user-name2").val(that.mapData["name"])
            $("#")

        }
    },
    error: function () {
        this.exception("系统异常")
    }
};
$(document).ready(function () {
    var information = new onlineMallInformation();
    information.init();
});