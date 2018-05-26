<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title>搜索页面</title>
    <link href="../AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css"/>
    <link href="../AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css"/>
    <link href="../basic/css/demo.css" rel="stylesheet" type="text/css"/>
    <link href="../css/seastyle.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="../basic/js/jquery-1.7.min.js"></script>
    <script type="text/javascript" src="../js/script.js"></script>
    <script src="../AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
    <script src="../AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>
    <script src="../js/jquerycookie.js"></script>
    <script src="../js/jquery.md5.js"></script>
    <script src="../js/jquery.base64.js"></script>
    <script src="../onlinemalljs/commonUtils/CommonUtil.js"></script>
    <script src="../onlinemalljs/commonUtils/CommonUserInfo.js"></script>
    <script src="../onlinemalljs/home/search.js"></script>
    <script src="../onlinemalljs/commonUtils/ShopGooDConfig.js"></script>
</head>

<body>

<!--顶部导航条 -->
<div class="am-container header">
    <ul class="message-l">
        <div class="topMessage">
            <div class="menu-hd">
                <%
                    String username = (String) session.getAttribute("account");
                    if (null == username) {
                %>
                <a href="../home/login.jsp" target="_top" class="h">您请登录</a>
                <a href="../home/register.jsp" target="_top">免费注册</a>
                <%
                } else {
                %>
                <a href="../person/index.jsp" target="_top"><i class="am-icon-user am-icon-fw"></i><%= username%>
                </a>
                <a href="javascript:void(0)" onclick="getUserLoginOutStatus('6')" target="_top"><i
                        class="am-icon-user am-icon-fw"></i>退出当前登录的用户
                </a>
                <%
                    }
                %>
            </div>
        </div>
    </ul>
    <ul class="message-r">
        <div class="topMessage home">
            <div class="menu-hd"><a href="../home/home3.jsp" target="_top" class="h">商城首页</a></div>
        </div>
        <div class="topMessage my-shangcheng">
            <div class="menu-hd MyShangcheng"><a id='mc-menu-hd_1' target="_top" href="javascript:void(0)"
                                                 onclick="getUserLoginOutStatus('1')"><i
                    class="am-icon-user am-icon-fw"></i>个人中心</a>
            </div>
        </div>
        <div class="topMessage mini-cart">
            <div class="menu-hd"><a id="mc-menu-hd_2" target="_top" href="javascript:void(0)"
                                    onclick="getUserLoginOutStatus('2')"><i
                    class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum"
                                                                                          class="h">0</strong></a>
            </div>
        </div>
        <div class="topMessage favorite">
            <div class="menu-hd"><a id='mc-menu-hd_3' target="_top" href="javascript:void(0)"
                                    onclick="getUserLoginOutStatus('3')"><i
                    class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a>
            </div>
        </div>
    </ul>
</div>
<!--悬浮搜索框-->
<div class="nav white">
    <div class="logo"><img src="../images/logo.png"/></div>
    <div class="logoBig">
        <li><img src="../images/logobig.png"/></li>
    </div>

    <div class="search-bar pr">
        <a name="index_none_header_sysc" href="#"></a>
        <form>
            <input id="searchInput" name="index_none_header_sysc" type="text" placeholder="搜索" autocomplete="off">
            <input id="ai-topsearch" class="submit am-btn" value="搜索" index="1" type="button">
        </form>
    </div>
</div>

<div class="clear"></div>
<b class="line"></b>
<div class="search">
    <div class="search-list">
        <div class="nav-table">
            <div class="long-title"><span class="all-goods">全部分类</span></div>
            <div class="nav-cont">
                <ul>
                    <li class="index"><a href="#">首页</a></li>
                </ul>
            </div>
        </div>


        <div class="am-g am-g-fixed">
            <div class="am-u-sm-12 am-u-md-12">
                <div class="search-content">
                    <div class="clear"></div>
                    <ul class="am-avg-sm-2 am-avg-md-3 am-avg-lg-4 boxes" id="searchGoods">
                        <%--<li>--%>
                            <%--<div class="list ">--%>
                                <%--<a href="../home/introduction.jsp ">--%>
                                    <%--<img src="../images/cp.jpg "/>--%>
                                    <%--<div class="pro-title ">萨拉米 1+1小鸡腿</div>--%>
                                    <%--<span class="e-price ">￥29.90</span>--%>
                                <%--</a>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="list ">--%>
                                <%--<a href="../home/introduction.jsp ">--%>
                                    <%--<img src="../images/cp2.jpg "/>--%>
                                    <%--<div class="pro-title ">ZEK 原味海苔</div>--%>
                                    <%--<span class="e-price ">￥8.90</span>--%>
                                <%--</a>--%>
                                <%--<p name="p" style="display: none">666666</p>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="list ">--%>
                                <%--<a href="../home/introduction.jsp ">--%>
                                    <%--<img src="../images/cp.jpg "/>--%>
                                    <%--<div class="pro-title ">萨拉米 1+1小鸡腿</div>--%>
                                    <%--<span class="e-price ">￥29.90</span>--%>
                                <%--</a>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="list ">--%>
                                <%--<a href="../home/introduction.jsp ">--%>
                                    <%--<img src="../images/cp2.jpg "/>--%>
                                    <%--<div class="pro-title ">ZEK 原味海苔</div>--%>
                                    <%--<span class="e-price ">￥8.90</span>--%>
                                <%--</a>--%>
                                <%--<p name="p" style="display: none">666666</p>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="list ">--%>
                                <%--<a href="../home/introduction.jsp ">--%>
                                    <%--<img src="../images/cp.jpg "/>--%>
                                    <%--<div class="pro-title ">萨拉米 1+1小鸡腿</div>--%>
                                    <%--<span class="e-price ">￥29.90</span>--%>
                                <%--</a>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="list ">--%>
                                <%--<a href="../home/introduction.jsp ">--%>
                                    <%--<img src="../images/cp2.jpg "/>--%>
                                    <%--<div class="pro-title ">ZEK 原味海苔</div>--%>
                                    <%--<span class="e-price ">￥8.90</span>--%>
                                <%--</a>--%>
                                <%--<p name="p" style="display: none">666666</p>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="list ">--%>
                                <%--<a href="../home/introduction.jsp ">--%>
                                    <%--<img src="../images/cp.jpg "/>--%>
                                    <%--<div class="pro-title ">萨拉米 1+1小鸡腿</div>--%>
                                    <%--<span class="e-price ">￥29.90</span>--%>
                                <%--</a>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="list ">--%>
                                <%--<a href="../home/introduction.jsp ">--%>
                                    <%--<img src="../images/cp2.jpg "/>--%>
                                    <%--<div class="pro-title ">ZEK 原味海苔</div>--%>
                                    <%--<span class="e-price ">￥8.90</span>--%>
                                <%--</a>--%>
                                <%--<p name="p" style="display: none">666666</p>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="list ">--%>
                                <%--<a href="../home/introduction.jsp ">--%>
                                    <%--<img src="../images/cp.jpg "/>--%>
                                    <%--<div class="pro-title ">萨拉米 1+1小鸡腿</div>--%>
                                    <%--<span class="e-price ">￥29.90</span>--%>
                                <%--</a>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="list ">--%>
                                <%--<a href="../home/introduction.jsp ">--%>
                                    <%--<img src="../images/cp2.jpg "/>--%>
                                    <%--<div class="pro-title ">ZEK 原味海苔</div>--%>
                                    <%--<span class="e-price ">￥8.90</span>--%>
                                <%--</a>--%>
                                <%--<p name="p" style="display: none">666666</p>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="i-pic limit">--%>
                                <%--<img src="../images/imgsearch1.jpg"/>--%>
                                <%--<p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>--%>
                                <%--<p class="price fl">--%>
                                    <%--<b>¥</b>--%>
                                    <%--<strong>56.90</strong>--%>
                                <%--</p>--%>
                                <%--<p class="number fl">--%>
                                    <%--销量<span>1110</span>--%>
                                <%--</p>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="i-pic limit">--%>

                                <%--<img src="../images/imgsearch1.jpg"/>--%>
                                <%--<p class="title fl">手剥松子218g 坚果炒货零食新货巴西松子包邮</p>--%>
                                <%--<p class="price fl">--%>
                                    <%--<b>¥</b>--%>
                                    <%--<strong>56.90</strong>--%>
                                <%--</p>--%>
                                <%--<p class="number fl">--%>
                                    <%--销量<span>1110</span>--%>
                                <%--</p>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="i-pic limit">--%>

                                <%--<img src="../images/imgsearch1.jpg"/>--%>
                                <%--<p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>--%>
                                <%--<p class="price fl">--%>
                                    <%--<b>¥</b>--%>
                                    <%--<strong>56.90</strong>--%>
                                <%--</p>--%>
                                <%--<p class="number fl">--%>
                                    <%--销量<span>1110</span>--%>
                                <%--</p>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="i-pic limit">--%>

                                <%--<img src="../images/imgsearch1.jpg"/>--%>
                                <%--<p class="title fl">手剥松子218g 坚果炒货零食新货巴西松子包邮</p>--%>
                                <%--<p class="price fl">--%>
                                    <%--<b>¥</b>--%>
                                    <%--<strong>56.90</strong>--%>
                                <%--</p>--%>
                                <%--<p class="number fl">--%>
                                    <%--销量<span>1110</span>--%>
                                <%--</p>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="i-pic limit">--%>

                                <%--<img src="../images/imgsearch1.jpg"/>--%>
                                <%--<p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>--%>
                                <%--<p class="price fl">--%>
                                    <%--<b>¥</b>--%>
                                    <%--<strong>56.90</strong>--%>
                                <%--</p>--%>
                                <%--<p class="number fl">--%>
                                    <%--销量<span>1110</span>--%>
                                <%--</p>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="i-pic limit">--%>

                                <%--<img src="../images/imgsearch1.jpg"/>--%>
                                <%--<p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>--%>
                                <%--<p class="price fl">--%>
                                    <%--<b>¥</b>--%>
                                    <%--<strong>56.90</strong>--%>
                                <%--</p>--%>
                                <%--<p class="number fl">--%>
                                    <%--销量<span>1110</span>--%>
                                <%--</p>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="i-pic limit">--%>

                                <%--<img src="../images/imgsearch1.jpg"/>--%>
                                <%--<p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>--%>
                                <%--<p class="price fl">--%>
                                    <%--<b>¥</b>--%>
                                    <%--<strong>56.90</strong>--%>
                                <%--</p>--%>
                                <%--<p class="number fl">--%>
                                    <%--销量<span>1110</span>--%>
                                <%--</p>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="i-pic limit">--%>

                                <%--<img src="../images/imgsearch1.jpg"/>--%>
                                <%--<p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>--%>
                                <%--<p class="price fl">--%>
                                    <%--<b>¥</b>--%>
                                    <%--<strong>56.90</strong>--%>
                                <%--</p>--%>
                                <%--<p class="number fl">--%>
                                    <%--销量<span>1110</span>--%>
                                <%--</p>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="i-pic limit">--%>

                                <%--<img src="../images/imgsearch1.jpg"/>--%>
                                <%--<p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>--%>
                                <%--<p class="price fl">--%>
                                    <%--<b>¥</b>--%>
                                    <%--<strong>56.90</strong>--%>
                                <%--</p>--%>
                                <%--<p class="number fl">--%>
                                    <%--销量<span>1110</span>--%>
                                <%--</p>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="i-pic limit">--%>

                                <%--<img src="../images/imgsearch1.jpg"/>--%>
                                <%--<p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>--%>
                                <%--<p class="price fl">--%>
                                    <%--<b>¥</b>--%>
                                    <%--<strong>56.90</strong>--%>
                                <%--</p>--%>
                                <%--<p class="number fl">--%>
                                    <%--销量<span>1110</span>--%>
                                <%--</p>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="i-pic limit">--%>

                                <%--<img src="../images/imgsearch1.jpg"/>--%>
                                <%--<p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>--%>
                                <%--<p class="price fl">--%>
                                    <%--<b>¥</b>--%>
                                    <%--<strong>56.90</strong>--%>
                                <%--</p>--%>
                                <%--<p class="number fl">--%>
                                    <%--销量<span>1110</span>--%>
                                <%--</p>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="i-pic limit">--%>

                                <%--<img src="../images/imgsearch1.jpg"/>--%>
                                <%--<p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>--%>
                                <%--<p class="price fl">--%>
                                    <%--<b>¥</b>--%>
                                    <%--<strong>56.90</strong>--%>
                                <%--</p>--%>
                                <%--<p class="number fl">--%>
                                    <%--销量<span>1110</span>--%>
                                <%--</p>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="i-pic limit">--%>
                                <%--<img src="../images/imgsearch1.jpg"/>--%>
                                <%--<p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>--%>
                                <%--<p class="price fl">--%>
                                    <%--<b>¥</b>--%>
                                    <%--<strong>56.90</strong>--%>
                                <%--</p>--%>
                                <%--<p class="number fl">--%>
                                    <%--销量<span>1110</span>--%>
                                <%--</p>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="i-pic limit">--%>

                                <%--<img src="../images/imgsearch1.jpg"/>--%>
                                <%--<p class="title fl">手剥松子218g 坚果炒货零食新货巴西松子包邮</p>--%>
                                <%--<p class="price fl">--%>
                                    <%--<b>¥</b>--%>
                                    <%--<strong>56.90</strong>--%>
                                <%--</p>--%>
                                <%--<p class="number fl">--%>
                                    <%--销量<span>1110</span>--%>
                                <%--</p>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="i-pic limit">--%>

                                <%--<img src="../images/imgsearch1.jpg"/>--%>
                                <%--<p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>--%>
                                <%--<p class="price fl">--%>
                                    <%--<b>¥</b>--%>
                                    <%--<strong>56.90</strong>--%>
                                <%--</p>--%>
                                <%--<p class="number fl">--%>
                                    <%--销量<span>1110</span>--%>
                                <%--</p>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="i-pic limit">--%>
                                <%--<img src="../images/imgsearch1.jpg"/>--%>
                                <%--<p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>--%>
                                <%--<p class="price fl">--%>
                                    <%--<b>¥</b>--%>
                                    <%--<strong>56.90</strong>--%>
                                <%--</p>--%>
                                <%--<p class="number fl">--%>
                                    <%--销量<span>1110</span>--%>
                                <%--</p>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="i-pic limit">--%>

                                <%--<img src="../images/imgsearch1.jpg"/>--%>
                                <%--<p class="title fl">手剥松子218g 坚果炒货零食新货巴西松子包邮</p>--%>
                                <%--<p class="price fl">--%>
                                    <%--<b>¥</b>--%>
                                    <%--<strong>56.90</strong>--%>
                                <%--</p>--%>
                                <%--<p class="number fl">--%>
                                    <%--销量<span>1110</span>--%>
                                <%--</p>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<div class="i-pic limit">--%>

                                <%--<img src="../images/imgsearch1.jpg"/>--%>
                                <%--<p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>--%>
                                <%--<p class="price fl">--%>
                                    <%--<b>¥</b>--%>
                                    <%--<strong>56.90</strong>--%>
                                <%--</p>--%>
                                <%--<p class="number fl">--%>
                                    <%--销量<span>1110</span>--%>
                                <%--</p>--%>
                            <%--</div>--%>
                        <%--</li>--%>
                    </ul>
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
    </div>

</div>
<!--菜单 -->
<div class=tip>
    <div id="sidebar">
        <div id="wrap">
            <div id="shopCart " class="item ">
                <a id='mc-menu-hd_4' href="javascript:void(0)" onclick="getUserLoginOutStatus('4')">
                    <span class="message "></span>
                </a>
                <p>
                    购物车
                </p>
                <p class="cart_num ">0</p>
            </div>
            <div id="brand " class="item ">
                <a id='mc-menu-hd_5' href="javascript:void(0)" onclick="getUserLoginOutStatus('5')">
                    <span class="wdsc "><img src="../images/wdsc.png "/></span>
                </a>
                <div class="mp_tooltip ">
                    我的收藏
                    <i class="icon_arrow_right_black "></i>
                </div>
            </div>

            <div class="quick_toggle ">
                <li class="qtitem ">
                    <a href="#top " class="return_top "><span class="top "></span></a>
                </li>
            </div>

            <!--回到顶部 -->
            <div id="quick_links_pop " class="quick_links_pop hide "></div>

        </div>
    </div>
</div>
<script>
    window.jQuery || document.write('<script src="basic/js/jquery-1.9.min.js"><\/script>');
</script>
<script type="text/javascript" src="../basic/js/quick_links.js"></script>

<div class="theme-popover-mask"></div>
</body>
<script>
    function getUserLoginOutStatus(data) {
        if ('1' == data) {
            COMMONUSERINFOUTIL.getUserLoginOut(function (data) {
                if (data['status'] == "login") {
                    $('#mc-menu-hd_1').attr('href', '../person/index.jsp');
                } else {
                    alert("请登录后操作")
                    return;
                }
            })
            //href="../person/index.jsp"
        } else if ('2' == data) {
            COMMONUSERINFOUTIL.getUserLoginOut(function (data) {
                if (data['status'] == "login") {
                    $('#mc-menu-hd_2').attr('href', '../home/shopcart.jsp');
                } else {
                    alert("请登录后操作")
                    return;
                }
            })
            //href="../home/shopcart.jsp"
        } else if ('3' == data) {
            COMMONUSERINFOUTIL.getUserLoginOut(function (data) {
                if (data['status'] == "login") {
                    $('#mc-menu-hd_3').attr('href', '../person/collection.jsp');
                } else {
                    alert("请登录后操作")
                    return;
                }
            })
            //href="../person/collection.jsp"
        } else if ('4' == data) {
            COMMONUSERINFOUTIL.getUserLoginOut(function (data) {
                if (data['status'] == "login") {
                    $('#mc-menu-hd_4').attr('href', '../home/shopcart.jsp');
                } else {
                    alert("请登录后操作")
                    return;
                }
            })
        } else if ('5' == data) {
            COMMONUSERINFOUTIL.getUserLoginOut(function (data) {
                if (data['status'] == "login") {
                    $('#mc-menu-hd_5').attr('href', '../person/collection.jsp');
                } else {
                    alert("请登录后操作")
                    return;
                }
            })
        } else {
            var map = {};
            var userId = $.cookie("onlinemall_zc_userId");
            if (null == userId) {
                map['params["userid"]'] = "1bb4df95203e48ea823f18fa53c0895e";
            } else {
                map['params["userid"]'] = $.cookie("onlinemall_zc_userId");
            }
            $.ajax({
                type: "POST",
                url: "/onlinemall/loginOut.do",
                data: map,
                dataType: "JSON",
                success: function (result) {
                    if (result.code == '1') {
                        window.location.href = "../home/home3.jsp";
                    }
                },
                error: function () {
                    alert("网络异常，退出登录失败")
                }

            })
        }
    }
</script>
</html>