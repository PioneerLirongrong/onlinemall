<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0 ,minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title>结算页面</title>
    <link href="../AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css"/>
    <link href="../basic/css/demo.css" rel="stylesheet" type="text/css"/>
    <link href="../css/cartstyle.css" rel="stylesheet" type="text/css"/>
    <link href="../css/jsstyle.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="../js/address.js"></script>
    <script src="../js/jquerycookie.js"></script>
    <script src="../js/jquery.md5.js"></script>
    <script src="../js/jquery.base64.js"></script>
    <script src="../js/mathcontext.js"></script>
    <script src="../js/bigdecimal.js"></script>
    <script src="../onlinemalljs/commonUtils/CommonUtil.js"></script>
    <script src="../onlinemalljs/commonUtils/CommonUserInfo.js"></script>
    <script src="../onlinemalljs/commonUtils/ShopGooDConfig.js"></script>
    <script src="../onlinemalljs/person/address.js"></script>
    <script src="../onlinemalljs/home/pay.js"></script>
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
                    class="am-icon-user am-icon-fw"></i>个人中心</a></div>
        </div>
        <div class="topMessage mini-cart">
            <div class="menu-hd"><a id="mc-menu-hd" href="../home/shopcart.jsp" target="_top"><i
                    class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum"
                                                                                          class="h">0</strong></a></div>
        </div>
        <div class="topMessage favorite">
            <div class="menu-hd"><a href="../person/collection.jsp" target="_top"><i
                    class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a></div>
        </div>
    </ul>
</div>
<div class="clear"></div>
<div class="concent">
    <!--地址 -->
    <div class="paycont">
        <div class="address">
            <h3>确认收货地址 </h3>
            <div class="clear"></div>
            <ul id="addressUL">
                <%--<li id="l1" class="user-addresslist" onclick="getAddress()">--%>
                <%--<div class="address-left">--%>
                <%--<div class="user DefaultAddr">--%>
                <%--<span class="buy-address-detail">--%>
                <%--<span class="buy-user">艾迪 </span>--%>
                <%--<span class="buy-phone">15888888888</span>--%>
                <%--</span>--%>
                <%--</div>--%>
                <%--<div class="default-address DefaultAddr">--%>
                <%--<span class="buy-line-title buy-line-title-type">收货地址：</span>--%>
                <%--<span class="buy--address-detail">--%>
                <%--<span class="province">湖北</span>省--%>
                <%--<span class="city">武汉</span>市--%>
                <%--<span class="dist">洪山</span>区--%>
                <%--<span id="address1" class="street">雄楚大道666号(中南财经政法大学)</span>--%>
                <%--</span>--%>
                <%--</span>--%>
                <%--</div>--%>
                <%--</div>--%>
                <%--<div class="clear"></div>--%>
                <%--</li>--%>
                <%--<li id="l2" class="user-addresslist" onclick="getAddress()">--%>
                <%--<div class="address-left">--%>
                <%--<div class="user DefaultAddr">--%>
                <%--<span class="buy-address-detail">--%>
                <%--<span class="buy-user">艾迪 </span>--%>
                <%--<span class="buy-phone">15877777777</span>--%>
                <%--</span>--%>
                <%--</div>--%>
                <%--<div class="default-address DefaultAddr">--%>
                <%--<span class="buy-line-title buy-line-title-type">收货地址：</span>--%>
                <%--<span class="buy--address-detail">--%>
                <%--<span class="province">湖北</span>省--%>
                <%--<span class="city">武汉</span>市--%>
                <%--<span class="dist">武昌</span>区--%>
                <%--<span id="address2" class="street">东湖路75号众环大厦9栋9层999</span>--%>
                <%--</span>--%>
                <%--</span>--%>
                <%--</div>--%>
                <%--</div>--%>
                <%--<div class="clear"></div>--%>
                <%--</li>--%>
            </ul>
            <div class="clear"></div>
        </div>
        <!--物流 -->
        <div class="logistics">
            <h3>选择物流方式</h3>
            <ul class="op_express_delivery_hot">
                <li id="way1" data-value="yuantong" class="OP_LOG_BTN " onclick="getWuliuWay()">
                    <i class="c-gap-right" style="background-position:0px -468px"></i>
                    圆通
                    <span></span>
                </li>
                <li id="way2" data-value="shentong" class="OP_LOG_BTN " onclick="getWuliuWay()">
                    <i class="c-gap-right" style="background-position:0px -1008px"></i>
                    申通
                    <span></span>
                </li>
                <li id="way3" data-value="yunda" class="OP_LOG_BTN  " onclick="getWuliuWay()">
                    <i class="c-gap-right" style="background-position:0px -576px"></i>
                    韵达
                    <span></span>
                </li>
                <li id="way4" data-value="zhongtong" class="OP_LOG_BTN op_express_delivery_hot_last "
                    onclick="getWuliuWay()">
                    <i class="c-gap-right" style="background-position:0px -324px"></i>
                    中通
                    <span></span>
                </li>
                <li id="way5" data-value="shunfeng" class="OP_LOG_BTN  op_express_delivery_hot_bottom"
                    onclick="getWuliuWay()">
                    <i class="c-gap-right" style="background-position:0px -180px"></i>
                    顺丰
                    <span></span>
                </li>
            </ul>
        </div>
        <div class="clear"></div>

        <!--支付方式-->
        <div class="logistics">
            <h3>选择支付方式</h3>
            <ul class="pay-list">
                <li id="card" onclick="getPayWay()" class="pay card"><img src="../images/wangyin.jpg"/>银联<span></span>
                </li>
                <li id="qq" onclick="getPayWay()" class="pay qq"><img src="../images/weizhifu.jpg"/>微信<span></span></li>
                <li id="taobao" onclick="getPayWay()" class="pay taobao"><img
                        src="../images/zhifubao.jpg"/>支付宝<span></span></li>
            </ul>
        </div>
        <div class="clear"></div>

        <!--订单 -->
        <form>
        <div class="concent">
            <div id="payTable">
                <h3>确认订单信息</h3>
                <div class="cart-table-th">
                    <div class="wp">

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
                        <div class="th th-oplist">
                            <div class="td-inner">配送方式</div>
                        </div>

                    </div>
                </div>
                <div class="clear"></div>
                <tr class="item-list">
                    <div class="bundle  bundle-last">
                        <div class="bundle-main">
                            <ul class="item-content clearfix" >
                                <div class="pay-phone" id="payUL">
                                    <li class="td td-item">
                                        <div class="item-pic">
                                            <a href="javascript:void(0)" class="J_MakePoint">
                                                <img src="../images/kouhong.jpg_80x80.jpg"
                                                     class="itempic J_ItemImg"></a>
                                        </div>
                                        <div class="item-info">
                                            <div class="item-basic-info">
                                                <a href="javascript:void(0)" class="item-title J_MakePoint"
                                                   data-point="tbcart.8.11">美康粉黛醉美唇膏
                                                    持久保湿滋润防水不掉色</a>
                                            </div>
                                        </div>
                                    </li>

                                    <li class="td td-price">
                                        <div class="item-price price-promo-promo">
                                            <div class="price-content">
                                                <input id="price" class="J_Price price-now" disabled="disabled" value="39.9">
                                            </div>
                                        </div>
                                    </li>
                                </div>
                                <li class="td td-amount">
                                    <div class="amount-wrapper ">
                                        <div class="item-amount ">
                                            <span class="phone-title">购买数量</span>
                                            <div class="sl">
                                                <input class=" am-btn" name="" type="button" value="-" onclick="reduce(1)"/>
                                                <input id="count" class="text_box" name="" type="text" value="1"
                                                       style="width:30px;"/>
                                                <input class=" am-btn" name="" type="button" value="+" onclick="addCount(1)"/>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                                <li class="td td-sum">
                                    <div class="td-inner">
                                        <input id="emtotal1" tabindex="0" class="J_ItemSum number" disabled="disabled" value="117.00">
                                    </div>
                                </li>
                                <li class="td td-oplist">
                                    <div class="td-inner">
                                        <span class="phone-title">配送方式</span>
                                        <div class="pay-logis">
                                            快递<b class="sys_item_freprice">10</b>元
                                        </div>
                                    </div>
                                </li>
                            </ul>
                            <div class="clear"></div>
                        </div>
                    </div>
                </tr>
                <div class="clear"></div>
            </div>
        </div>
        <div class="clear"></div>
        <!--含运费小计 -->
        <div class="buy-point-discharge ">
            <p class="price g_price ">
                合计（含运费） <span>¥</span><input id="emtotal2" disabled="disabled" type="text" class="pay-sum" value="224"/>
            </p>
        </div>
        <!--信息 -->
        <div class="order-go clearfix">
            <div class="pay-confirm clearfix">
                <div id="holyshit269" class="submitOrder">
                    <div class="go-btn-wrap">
                        <a id="J_Go" href="javascript:void(0)"  class="btn-go" tabindex="0" title="点击此按钮，提交订单">提交订单</a>
                    </div>
                </div>
                <div class="clear"></div>
            </div>
        </div>
        </form>
    </div>

    <div class="clear"></div>
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
</div>
<div class="theme-popover-mask"></div>
<div class="clear"></div>
</body>
<script>
    function addCount(arg) {
        var wuliuway = 10;
        var st = wuliuway.toString();
        var orig = $("#count").val();
        var addnew = (parseInt(orig)+arg).toString();
        $("#count").attr("value",addnew);
        var price = $("#price").val();
        var addTotal = new BigDecimal(price).multiply(new BigDecimal(addnew));
        $("#emtotal1").attr("value",addTotal.toString())
        var addTotal2 = new BigDecimal(addTotal.toString()).add(new BigDecimal(st));
        $("#emtotal2").attr("value",addTotal2.toString())
    }
    function reduce(arg) {
        var wuliuway = 10;
        var st = wuliuway.toString();
        var orig = $("#count").val();
        var news = parseInt(orig) -arg;
        if(news <= 0){
            news = 1;
        }
        $("#count").attr("value",news)
        var price = $("#price").val();
        var addTotal = new BigDecimal(price).multiply(new BigDecimal(news.toString()));
        $("#emtotal1").attr("value",addTotal.toString())
        var addTotal2 = new BigDecimal(addTotal.toString()).add(new BigDecimal(st));
        $("#emtotal2").attr("value",addTotal2.toString())
    }
</script>
</html>