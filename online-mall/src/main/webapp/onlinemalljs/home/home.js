var onlineMallHome = function () {

};
onlineMallHome.prototype = {
    mapData:{

    },
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
    init_goods:function () {
        var maps={};


    }
};
$(document).ready(function () {
    var home = new onlineMallHome();
    home.init();
    home.init_goods();

});