var onlinemalHome = function () {

};
onlinemalHome.prototype={
    config: {

    },
    init:function(){
        var data = COMMONUTIL.getUserInfo();
        console.log(data)
    },
    error:function(message){
        alert(message);
    }
};
$(document).ready(function () {
    var home = new onlinemalHome();
    home.init();
});