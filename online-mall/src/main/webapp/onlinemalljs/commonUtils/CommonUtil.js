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
    },
    getMap: function () {
        var map={};
        var params = location.search.substr(1);
        var arr = params.split('&');
        if (arr) {
            var value = arr[0].split("=");
        }
        map[value[0]]=value[1]
        return map;
    },
    getQueryAndId:function () {
        var map={};
        var params = location.search.substr(1);
        var arr = params.split('&');
        if (arr) {
            var value1 = arr[0].split("=");
            var value2 = arr[1].split("=");

        }
        map[value1[0]]=value1[1];
        map[value2[0]]=value2[1];
        return map;

    },
    timestampToTime:function (timestamp) {
    var date = new Date(timestamp);
    Y = date.getFullYear() + '-';
    M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
    D = date.getDate() + ' ';
    return Y+M+D;
}
}