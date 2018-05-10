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