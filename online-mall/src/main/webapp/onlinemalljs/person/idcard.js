var onlineMallInformation = function () {

};
onlineMallInformation.prototype = {
    mapData: {},
    config: {
        updateInfoUrl: "/onlinemall/updateUserSecurityDegree.do",
        returnUrl: '/person/safety.jsp',
    },
    execption: function (message) {
        alert(message)
    },
    init: function () {
        var index = this;
        COMMONUSERINFOUTIL.getUserInfo(function (data) {
            index.mapData = data;
            index.initUserInfo(index);
        });
    },
    updateInfo:function(){
        var indexnew  = this;
        $("#submit").click(function () {
            indexnew.submit();
        });
    },
    submit: function () {
        var info = this;
        var data = {};
        var account = $("#user-real-name").val().trim();
        var userBankId = $("#user-bind-IDcard").val().trim();
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        data['params["identitynumber"]'] = userBankId
        data['params["realname"]'] = account;
        $.ajax({
            type: "POST",
            url: this.config.updateInfoUrl,
            data: data,
            async:false,
            dataType: "JSON",
            success: function (result) {
                if (result.code == '1') {
                    $("#idCardForm").attr('action',info.config.returnUrl);
                }
            },
            error: function () {
                info.execption("系统异常");
            }
        });

    }
};
$(document).ready(function () {
    var information = new onlineMallInformation();
    // information.init();
    information.updateInfo();
});