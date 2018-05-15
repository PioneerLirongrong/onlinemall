var onlineMallInformation = function () {

};
onlineMallInformation.prototype = {
    mapData: {},
    config: {
        updateInfoUrl: "/onlinemall/updateUserAllInformation.do",
        returnUrl: '../person/information.jsp',
    },
    exception: function (message) {
        alert(message)
    },
    init: function () {
        var index = this;
        COMMONUSERINFOUTIL.getUserInfo(function (data) {
            index.mapData = data;
            index.initUserInfo(index);
        });
        $("#submit").click(function () {
            index.submit();
        });
    },
    initUserInfo: function (that) {
        var table = {};
        // table['1990']='a';
        // table['1991']='b';
        // table['1992']='d';
        // table['1993']='e';
        // table['1994']='f';
        // table['1995']='g';
        // table['1996']='h';
        // table['1997']='i';
        // table['1998']='j';
        // table['1999']='k';
        // table['2000']='l';
        // table['2001']='m';
        // table['2002']='n';
        // table['2003']='o';
        // table['2004']='p';
        // table['2005']='q';
        // table['2006']='r';
        // table['2007']='s';
        // table['2008']='t';
        // table['2009']='u';
        // table['2010']='v';
        // table['2011']='w';
        // table['2012']='x';
        // table['2013']='y';
        // table['2014']='z';
        // table['2015']='A';
        // table['2016']='B';
        // table['2017']='C';
        // table['2018']='D';
        // table['1']='E';
        // table['2']='F';
        // table['3']='G';
        // table['4']='H';
        // table['5']='I';
        // table['6']='J';
        // table['7']='K';
        // table['8']='L';
        // table['9']='M';
        // table['10']='N';
        // table['11']='O';
        // table['12']='P';
        if (typeof(that.mapData) != "undefined") {
            $("#info1").html(
                "<div><b>用户名：<i>" + that.mapData["account"] + "</i></b></div>\n" +
                "<div class=\"vip\">\n" +
                "<span></span><a >会员专享" + 3 + "</a>\n" +
                "</div>"
            )
            $("#user-name1").val(that.mapData["account"]);
            $("#user-name2").val(that.mapData["name"]);
            if ("1" == that.mapData["sex"]) {
                $("#radio1").attr("checked", true);
            } else if ("0" == that.mapData["sex"]) {
                $("#radio2").attr("checked", true);
            } else {
                $("#radio3").attr("checked", true);
            }
            if ('' != that.mapData['birthday']) {
                var yearMonth = that.mapData['birthday'];
                var arr = yearMonth.split("-");
                var year = arr[0];
                var month = arr[1];
                $("#data-am-selected1").find("option[value = '" + year + "']").attr("selected", "selected");
                $("#data-am-selected2").find("option[value = '" + month + "']").attr("selected", "selected");
            }
            $("#user-phone").val(that.mapData["phonenumber"]);
            $("#user-email").val(that.mapData["mail"]);
        }
    },
    submit: function () {
        var info = this;
        var data = {};
        var account = $("#user-name1").val().trim();
        var name = $("#user-name2").val().trim();
        var sex = $('input[name="sex"]:checked').val();
        var year = $("#data-am-selected1 option:selected").val();
        var month = $("#data-am-selected2 option:selected").val();
        var birthday = year + "-" + month;
        var phone = $("#user-phone").val();
        if ("" != phone || null != phone) {
            var reg = new RegExp("^[1][3,4,5,7,8][0-9]{9}$");
            if (!(reg.test(phone))) {
                info.exception("手机号格式不正确!!!请确认后填写")
                return;
            }
        }
        var mail = $("#user-email").val();
        if ("" != mail || null != mail) {
            var reg = new RegExp("[a-zA-Z0-9]{1,10}@[a-zA-Z0-9]{1,5}\\.[a-zA-Z0-9]{1,5}");
            if (!(reg.test(mail))) {
                info.exception("邮箱格式不正确!!!请确认后填写")
                return;
            }
        }
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        data['params["accout"]'] = account
        data['params["name"]'] = name;
        data['params["sex"]'] = sex;
        data['params["birthday"]'] = birthday;
        data['params["phonenumber"]'] = phone;
        data['params["mail"]'] = mail;
        $.ajax({
            type: "POST",
            url: info.config.updateInfoUrl,
            data: data,
            dataType: "JSON",
            success: function (result) {
                if (result.code == '1') {
                    window.location.href = info.config.returnUrl;
                }
            },
            error: function () {
                info.exception("系统异常");
            }
        });

    }
};
$(document).ready(function () {
    var information = new onlineMallInformation();
    information.init();

});