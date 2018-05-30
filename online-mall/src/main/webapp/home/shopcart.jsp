<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title>购物车页面</title>
    <link href="../AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css"/>
    <link href="../basic/css/demo.css" rel="stylesheet" type="text/css"/>
    <link href="../css/cartstyle.css" rel="stylesheet" type="text/css"/>
    <link href="../css/optstyle.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="../js/jquery.js"></script>
    <script src="../js/mathcontext.js"></script>
    <script src="../js/bigdecimal.js"></script>
    <script src="../js/jquerycookie.js"></script>
    <script src="../js/jquery.md5.js"></script>
    <script src="../js/jquery.base64.js"></script>
    <script src="../onlinemalljs/commonUtils/CommonUtil.js"></script>
    <script src="../onlinemalljs/commonUtils/CommonUserInfo.js"></script>
    <script src="../onlinemalljs/home/home.js"></script>
    <script src="../onlinemalljs/commonUtils/ShopGooDConfig.js"></script>
    <script src="../onlinemalljs/home/shopcart.js"></script>
</head>
<body>
<!--顶部导航条 -->
<div class="am-container header">
    <ul class="message-r">
        <div class="topMessage home">
            <div class="menu-hd"><a href="../home/home3.jsp" target="_top" class="h">商城首页</a></div>
        </div>
        <div class="topMessage my-shangcheng">
            <div class="menu-hd MyShangcheng"><a href="../person/index.jsp" target="_top"><i
                    class="am-icon-user am-icon-fw"></i>个人中心</a>
            </div>
        </div>
        <div class="topMessage favorite">
            <div class="menu-hd"><a href="../person/collection.jsp" target="_top"><i
                    class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a>
            </div>
        </div>
    </ul>
</div>
<div class="clear"></div>
<!--购物车 -->
<div class="concent">
    <div id="cartTable">
        <div class="cart-table-th">
            <div class="wp">
                <div class="th th-chk">
                    <div id="J_SelectAll1" class="select-all J_SelectAll">
                    </div>
                </div>
                <div class="th th-item">
                    <div class="td-inner">商品信息</div>
                </div>
                <div class="th th-price">
                    <div class="td-inner">单价</div>
                </div>
                <div class="th th-amount">
                    <div class="td-inner">数量</div>
                </div>
                <div class="th th-sum">
                    <div class="td-inner">金额</div>
                </div>
                <div class="th th-op">
                    <div class="td-inner">操作</div>
                </div>
            </div>
        </div>
        <div class="clear"></div>
        <tr class="item-list">
            <div class="bundle  bundle-last ">
                <div class="clear"></div>
                <div class="bundle-main" id="shopCarDiv">
                    <%--<ul class="item-content clearfix">--%>
                        <%--<li class="td td-item">--%>
                            <%--<div class="item-pic">--%>
                                <%--<a href="" target="_blank" data-title="美康粉黛醉美东方唇膏口红正品 持久保湿滋润防水不掉色护唇彩妆"--%>
                                   <%--class="J_MakePoint" data-point="tbcart.8.12">--%>
                                    <%--<img src="../images/kouhong.jpg_80x80.jpg" class="itempic J_ItemImg"></a>--%>
                            <%--</div>--%>
                            <%--<div class="item-info">--%>
                                <%--<div class="item-basic-info">--%>
                                    <%--<a href="#" target="_blank" title="美康粉黛醉美唇膏 持久保湿滋润防水不掉色"--%>
                                       <%--class="item-title J_MakePoint" data-point="tbcart.8.11">美康粉黛醉美唇膏 持久保湿滋润防水不掉色</a>--%>
                                <%--</div>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li class="td td-info">--%>
                            <%--<div class="item-props item-props-can">--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li class="td td-price">--%>
                            <%--<div class="item-price price-promo-promo">--%>
                                <%--<div class="price-content">--%>
                                    <%--<div class="price-line">--%>
                                        <%--<input id="price" type="text" disabled="disabled" class="J_Price price-now" tabindex="0" value="39.00">--%>
                                    <%--</div>--%>
                                <%--</div>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li class="td td-amount">--%>
                            <%--<div class="amount-wrapper ">--%>
                                <%--<div class="item-amount ">--%>
                                    <%--<div class="sl">--%>
                                        <%--<input class=" am-btn" name="" type="button" value="-" onclick="reduce(this.goodsid,this.queryurl)"/>--%>
                                        <%--<input id="count" class="text_box" name="" type="text" value="3" style="width:30px;"/>--%>
                                        <%--<input class=" am-btn" name="" type="button" value="+" onclick="addCount(this.goodsid,this.queryurl)"/>--%>
                                    <%--</div>--%>
                                <%--</div>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li class="td td-sum">--%>
                            <%--<div class="td-inner">--%>
                                <%--<input id="emtotal1" type="text" tabindex="0" disabled="disabled" class="J_ItemSum number" value="117.00">--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li class="td td-op">--%>
                            <%--<div class="td-inner">--%>
                                <%--<a onclick="deleteShopCar(this.id)" href="javascript:void(0);" class="delete">--%>
                                    <%--删除</a>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                    <%--</ul>--%>
                </div>
            </div>
        </tr>
    </div>
    <div class="clear"></div>
    <div class="footer">
        <div class="footer-hd ">
            <p>
                <a href="http://www.tute.edu.cn/">天职师大</a>
                <b>|</b>
                <a href="../home/home3.jsp">商城首页</a>
                <b>|</b>
                <a href="https://www.alipay.com/">支付宝</a>
                <b>|</b>
                <a href="../error/error.jsp">物流</a>
            </p>
        </div>
        <div class="footer-bd ">
            <p>
                <a href="../error/friend.jsp">关于我们</a>
                <a href="../error/friend.jsp">合作伙伴</a>
                <a href="../error/friend.jsp">联系我们</a>
                <a href="../error/friend.jsp">网站地图</a>
            </p>
        </div>
    </div>

</div>
<!--引导 -->
<div class="navCir">
    <li><a href="home3.jsp"><i class="am-icon-home "></i>首页</a></li>
    <li><a href="sort.jsp"><i class="am-icon-list"></i>分类</a></li>
    <li class="active"><a href="shopcart.jsp"><i class="am-icon-shopping-basket"></i>购物车</a></li>
    <li><a href="../person/index.jsp"><i class="am-icon-user"></i>我的</a></li>
</div>
</body>
<script>
    function addCount(goodsid,queryUrl) {
        console.log(goodsid+"\t"+queryUrl)
        var arg = 1;
        var orig = $("#count").val();
        var addnew = (parseInt(orig)+arg).toString();
        $("#count").attr("value",addnew);
        var price = $("#price").val();
        var addTotal = new BigDecimal(price).multiply(new BigDecimal(addnew));
        $("#emtotal1").attr("value",addTotal.toString())
        var data = {};
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        data['params["goodsid"]'] = goodsid;
        data['params["queryurl"]'] = queryUrl;
        data['params["flag"]'] = "add";
        $.ajax({
            type: "POST",
            url: "/onlinemallShopCar/addShopCarItem.do",
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                    alert("操作成功")
                    window.location.href="../home/shopcart.jsp";
                }else {
                    info.execption("操作失败")
                }
            },
            error: function () {
                info.execption("系统异常");
            }
        });
    }
    function reduce(goodsid,queryUrl){
        console.log(goodsid+"\t"+queryUrl)
        var info = this;
        var arg = 1;
        var orig = $("#count").val();
        var news = parseInt(orig) -arg;
        if(news <= 0){
            alert("无法修改,可以选择删除该商品!!!!")
            return;
        }
        $("#count").attr("value",news)
        var price = $("#price").val();
        var addTotal = new BigDecimal(price).multiply(new BigDecimal(news.toString()));
        $("#emtotal1").attr("value",addTotal.toString())
        var data = {};
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        data['params["goodsid"]'] = goodsid;
        data['params["queryurl"]'] = queryUrl;
        data['params["flag"]'] = "reduce";
        console.log(data)
        $.ajax({
            type: "POST",
            url: "/onlinemallShopCar/addShopCarItem.do",
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                    alert("操作成功")
                    window.location.href="../home/shopcart.jsp";
                }else {
                    info.execption("操作失败")
                }
            },
            error: function () {
                info.execption("系统异常");
            }
        });
    }

    function deleteShopCar(id){
        console.log(id)
        var info = this;
        var data = {};
        data['params["userid"]'] = $.cookie("onlinemall_zc_userId");
        data['params["id"]'] = id;
        console.log(data)
        $.ajax({
            type: "POST",
            url: "/onlinemallShopCar/deleteShopCarItem.do",
            data: data,
            dataType: "JSON",
            async: false,
            success: function (result) {
                if (result.code == '1') {
                    window.location.href = "../home/shopcart.jsp"
                }else {
                    info.execption("操作失败")
                }
            },
            error: function () {
                info.execption("系统异常");
            }
        });
    }
</script>
</html>