var onlinemalHome = function () {

};
onlinemalHome.prototype = {
    config: {
        map: {}
    },
    excep: function (message) {
        alert(message)
    },
    init: function () {
        this.map = COMMONUTIL.getUserInfo();
        console.log(this.map)
    },
    error: function () {
        this.excep("系统异常")
    }
};
$(document).ready(function () {
    var home = new onlinemalHome();
    home.init();
});