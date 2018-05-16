var onlineMallAddress = function () {

};
onlineMallAddress.prototype = {
    mapData: {},
    config: {
        updateInfoUrl: "/userAddress/listAddress.do",
        addDateInfoUrl: "/userAddress/addAddress.do",
        returnUrl: '../person/address.jsp',
    },
    execption: function (message) {
        alert(message)
    },
    init: function () {
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
                    var jsonArr = result.dataList;
                    console.log(jsonArr)
                    $(jsonArr).each(function () {
                        $("#addressUl").append(
                            "<li class=\"user-addresslist defaultAddr\">\n" +
                            "<span class=\"new-option-r\"><i class=\"am-icon-check-circle\"></i>默认地址</span>\n" +
                            "<p class=\"new-tit new-p-re\">\n" +
                            "<span class=\"new-txt\">"+this.username+"</span>\n" +
                            "<span class=\"new-txt-rd2\">"+this.phonenumber+"</span>\n" +
                            "</p>\n" +
                            "<div class=\"new-mu_l2a new-p-re\">\n" +
                            "<p class=\"new-mu_l2cw\">\n" +
                            "<span class=\"title\">地址："+this.useraddress+"</span>\n" +
                            "<span class=\"province\">"+this.province+"</span>省\n" +
                            "<span class=\"city\">"+this.city+"</span>市\n" +
                            "<span class=\"dist\">"+this.county+"</span>区\n" +
                            "<span class=\"street\">"+this.useraddress+"</span></p>\n" +
                            "</div>"
                        );
                    });
                }
            },
            error: function () {
                alert("bbb")
                info.execption("系统异常");
            }
        });
    },
    updateInfo: function () {
        var indexnew = this;
        $("#submit").click(function () {
            indexnew.submit();
        });
    },
    submit: function () {
        var info = this;
        var data = {};
        var username = $("#username").val().trim();
        var phonenumber = $("#userphone").val();
        if ("" != phonenumber || null != phonenumber) {
            var reg = new RegExp("^[1][3,4,5,7,8][0-9]{9}$");
            if (!(reg.test(phonenumber))) {
                info.execption("手机号格式不正确!!!请确认后填写")
                return;
            }
        }
        var province = $("#province").val().trim();
        var city = $("#city").val().trim();
        var county = $("#county").val().trim();
        var useraddress = $("#userintro").val().trim();
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        data['params["username"]'] = username
        data['params["phonenumber"]'] = phonenumber;
        data['params["province"]'] = province;
        data['params["city"]'] = city;
        data['params["county"]'] = county;
        data['params["useraddress"]'] = useraddress;
        $.ajax({
            type: "POST",
            url: this.config.addDateInfoUrl,
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                    $("#addressForm").attr('action', info.config.returnUrl);
                }
            },
            error: function () {
                alert("bbbbb")
                info.execption("系统异常");
            }
        });
    }
};
$(document).ready(function () {
    var address = new onlineMallAddress();
    address.init();
    address.updateInfo();
});