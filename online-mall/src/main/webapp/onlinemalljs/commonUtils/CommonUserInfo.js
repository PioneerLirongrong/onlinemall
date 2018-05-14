var COMMONUSERINFOUTIL = {
    getUserInfo: function (init) {
        var data = {};
        var map = {};
        var userId = $.cookie("onlinemall_zc_userId");
        if (null == userId) {
            map['params["userid"]'] = "1bb4df95203e48ea823f18fa53c0895e";
        } else {
            map['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        }
        $.ajax({
            type: "POST",
            url: "/onlinemall/getUserInfo.do",
            data: map,
            dataType: "JSON",
            success: function (result) {
                if (result.code == '1') {
                    if (result.dataObj.account == null) {
                        data['account'] = "";
                    } else {
                        data['account'] = result.dataObj.account;
                    }
                    if (result.dataObj.birthday == null) {
                        data['birthday'] = "";
                    } else {
                        data['birthday'] = result.dataObj.birthday;
                    }
                    if (result.dataObj.identitynumber == null) {
                        data['identitynumber'] = "";
                    } else {
                        data['identitynumber'] = result.dataObj.identitynumber;
                    }
                    if (result.dataObj.mail == null) {
                        data['mail'] = "";
                    } else {
                        data['mail'] = result.dataObj.mail;
                    }
                    if (result.dataObj.name == null) {
                        data['name'] = "";
                    } else {
                        data['name'] = result.dataObj.name;
                    }
                    if (result.dataObj.phonenumber == null) {
                        data['phonenumber'] = "";
                    } else {
                        data['phonenumber'] = result.dataObj.phonenumber;
                    }
                    if (result.dataObj.photourl1 == null) {
                        data['photourl1'] = "";
                    } else {
                        data['photourl1'] = result.dataObj.photourl1;
                    }
                    if (result.dataObj.photourl2 == null) {
                        data['photourl2'] = "";
                    } else {
                        data['photourl2'] = result.dataObj.photourl2;
                    }
                    if (result.dataObj.qqnumber == null) {
                        data['qqnumber'] = "";
                    } else {
                        data['qqnumber'] = result.dataObj.qqnumber;
                    }
                    if (result.dataObj.realname == null) {
                        data['realname'] = "";
                    } else {
                        data['realname'] = result.dataObj.realname;
                    }
                    if (result.dataObj.securitydegree == null) {
                        data['securitydegree'] = "";
                    } else {
                        data['securitydegree'] = result.dataObj.securitydegree;
                    }
                    if (result.dataObj.userid == null) {
                        data['userid'] = "";
                    } else {
                        data['userid'] = result.dataObj.userid;
                    }
                    if(typeof(data.userid)!="undefined"){
                        console.log("=====>" + data.userid);
                        //回调函数
                        init&&init(data);
                    }

                }
            },
            error: function () {
                console.log("/onlinemall/getUserInfo接口异常")
            }

        })
    },
    getUserLoginOut: function (init) {
        var data = {};
        var map = {};
        var userId = $.cookie("onlinemall_zc_userId");
        if (null == userId) {
            map['params["userid"]'] = "1bb4df95203e48ea823f18fa53c0895e";
        } else {
            map['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        }
        $.ajax({
            type: "POST",
            url: "/onlinemall/getUserLoginOutStatus.do",
            data: map,
            dataType: "JSON",
            success: function (result) {
                if (result.code == '1') {
                    data['status'] = result.status;
                    if(typeof(result.status)!="undefined"){
                        init&&init(data);
                    }

                }
            },
            error: function () {
                console.log("/onlinemall/getUserLoginOutStatus接口异常了")
                alert("bbbbb")
            }

        })
    }
}