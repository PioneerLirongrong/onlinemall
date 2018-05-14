var onlineMallHome = function () {

};
onlineMallHome.prototype = {
    mapData:{},
    config: {},
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
    error: function () {
        this.exception("系统异常")
    }
};
$(document).ready(function () {
    var home = new onlineMallHome();
    home.init();
});