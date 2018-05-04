var COMMONUTIL = {
    getUserInfo: function () {
        var map = {}
        var data = {};
        map['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        $.ajax({
            type: "POST",
            url: "/onlinemall/getUserInfo.do",
            data: map,
            dataType: "JSON",
            success: function (result) {
                if (result.code == '1') {
                    if(result.dataObj.account == null){
                        data['account'] = null;
                    }else {
                        data['account'] = result.dataObj.account;
                    }
                    if(result.dataObj.birthday == null){
                        data['birthday'] = null;
                    }else {
                        data['birthday'] = result.dataObj.birthday;
                    }
                    if(result.dataObj.identitynumber == null){
                        data['identitynumber'] = null;
                    }else {
                        data['identitynumber'] = result.dataObj.identitynumber;
                    }
                    if(result.dataObj.mail == null){
                        data['mail'] = null;
                    }else {
                        data['mail'] = result.dataObj.mail;
                    }
                    if(result.dataObj.name == null){
                        data['name'] = null;
                    }else {
                        data['name'] = result.dataObj.name;
                    }
                    if(result.dataObj.phonenumber == null){
                        data['phonenumber'] = null;
                    }else {
                        data['phonenumber'] = result.dataObj.phonenumber;
                    }
                    if(result.dataObj.photourl1 == null){
                        data['photourl1'] = null;
                    }else {
                        data['photourl1'] = result.dataObj.photourl1;
                    }
                    if(result.dataObj.photourl2 == null){
                        data['photourl2'] = null;
                    }else {
                        data['photourl2'] = result.dataObj.photourl2;
                    }
                    if(result.dataObj.qqnumber == null){
                        data['qqnumber'] = null;
                    }else {
                        data['qqnumber'] = result.dataObj.qqnumber;
                    }
                    if(result.dataObj.realname == null){
                        data['realname'] = null;
                    }else {
                        data['realname'] = result.dataObj.realname;
                    }
                    if(result.dataObj.securitydegree == null){
                        data['securitydegree'] = null;
                    }else {
                        data['securitydegree'] = result.dataObj.securitydegree;
                    }
                    if(result.dataObj.userid == null){
                        data['userid'] = null;
                    }else {
                        data['userid'] = result.dataObj.userid;
                    }
                    console.log(data)
                    return data;
                }
            },
            error:function () {
                console.log("/onlinemall/getUserInfo接口异常")
            }
        })
    }
};
var MD5_UTILS = {
    //base64加密请求url中的参数
    encryption: function (params) {
        var param = $.trim(params);
        var encode = $.base64.encode(param);
        return encode;
    },
    //base64解密请求url的参数
    decryption: function (params) {
        var param = $.trim(params);
        var decode = $.base64.decode(param);
        return decode;
    },
    //返回的是字符串形式的参数，例如：class_id=3&id=2&
    getParmValue: function () {
        var map={};
        var urlparam = location.search.substr(1);
        var params = this.decryption(urlparam)
        var arr = params.split('&');
        if (arr) {
            var value = arr[0].split("=");
        }
        map[value[0]]=value[1]
        return map;
    }
}