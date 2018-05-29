<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title>付款成功页面</title>
    <link rel="stylesheet" type="text/css" href="../AmazeUI-2.4.2/assets/css/amazeui.css"/>
    <link href="../AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="../basic/css/demo.css" rel="stylesheet" type="text/css"/>

    <link href="../css/sustyle.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="../basic/js/jquery-1.7.min.js"></script>

</head>

<body>


<!--顶部导航条 -->
<div class="am-container header">
    <ul class="message-r">
        <div class="topMessage home">
            <div class="menu-hd"><a href="../home/home3.jsp" target="_top" class="h">商城首页</a></div>
        </div>
        <div class="topMessage mini-cart">
            <div class="menu-hd"><a id="mc-menu-hd" href="../home/shopcart.jsp" target="_top"><i
                    class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum"
                                                                                          class="h">0</strong></a></div>
        </div>
        <div class="topMessage favorite">
            <div class="menu-hd"><a href="../person/collection.jsp" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a>
            </div>
        </div>
    </ul>
</div>
<div class="clear"></div>


<div class="take-delivery">
    <div class="status">
        <h2>您已成功付款</h2>
        <div class="successInfo">
            <div class="option">
                <span class="info">您可以</span>
                <a href="../person/order.jsp" class="J_MakePoint">查看<span>已买到的宝贝</span></a>
            </div>
        </div>
    </div>
</div>


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


</body>
</html>
