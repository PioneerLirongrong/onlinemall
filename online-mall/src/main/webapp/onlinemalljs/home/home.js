var onlinemalHome = function () {

};
onlinemalHome.prototype = {
    mapdata:{},
    config: {},
    excep: function (message) {
        alert(message)
    },
    display: function () {
    },
    init: function () {
        var home = this;
        COMMONUSERINFOUTIL.getUserInfo(function (data) {
            home.mapdata = data;
            console.log("this data is "+home.mapdata["userid"])
            // alert(home.mapdata["userid"])
        });
    },
    error: function () {
        this.excep("系统异常")
    }
};
$(document).ready(function () {
    var home = new onlinemalHome();
    home.init();
});