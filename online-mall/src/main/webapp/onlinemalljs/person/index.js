var onlineMallIndex = function () {

};
onlineMallIndex.prototype = {
    mapData:{},
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
    initUserInfo:function(that){
        if(typeof(that.mapData) != "undefined"){
            $("#m-userInfo").html(
                "<em class=\"s-name\">"+that.mapData["account"]+"</em>\n" +
                "<div class=\"vip1\"><a ><span></span><em>会员等级"+3+"</em></a></div>\n" +
                "<div class=\"safeText\"><a href=\"safety.jsp\">账户安全:<em\n" +
                "style=\"margin-left:20px ;\">"+that.mapData["securitydegree"]+"</em>分</a>\n" +
                "<div class=\"progressBar\"><span style=\"left: -95px;\" class=\"progress\"></span>\n" +
                "</div>\n" +
                "</div>"
            )
        }
    },
    error: function () {
        this.exception("系统异常")
    }
};
$(document).ready(function () {
    var index = new onlineMallIndex();
    index.init();
});