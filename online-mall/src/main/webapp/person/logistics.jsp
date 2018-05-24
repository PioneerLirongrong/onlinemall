<%@ page contentType="text/html;charset=UTF-8" %>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

    <title>物流</title>

    <link href="../AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="../AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

    <link href="../css/personal.css" rel="stylesheet" type="text/css">
    <link href="../css/lostyle.css" rel="stylesheet" type="text/css">

</head>

<body>
<!--头 -->
<header>
    <article>
        <div class="mt-logo">
            <!--顶部导航条 -->
            <div class="am-container header">
                <ul class="message-r">
                    <div class="topMessage home">
                        <div class="menu-hd"><a href="../home/home3.jsp" target="_top" class="h">商城首页</a></div>
                    </div>
                    <div class="topMessage mini-cart">
                        <div class="menu-hd"><a id="mc-menu-hd" href="../home/shopcart.jsp" target="_top"><i
                                class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum"
                                                                                                      class="h">0</strong></a>
                        </div>
                    </div>
                    <div class="topMessage favorite">
                        <div class="menu-hd"><a href="collection.jsp" target="_top"><i
                                class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a></div>
                    </div>
                </ul>
            </div>
        </div>
        <div class="clear"></div>
        </div>
        </div>
    </article>
</header>
<div class="nav-table">
    <div class="long-title"><span class="all-goods">全部分类</span></div>
</div>
<b class="line"></b>
<div class="center">
    <div class="col-main">
        <div class="main-wrap">
            <div class="user-logistics">
                <!--标题 -->
                <div class="am-cf am-padding">
                    <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">物流跟踪</strong> /
                        <small>Logistics&nbsp;History</small>
                    </div>
                </div>
                <hr/>
                <div class="package-title">
                    <div class="m-item">
                        <div class="item-pic">
                            <img src="../images/kouhong.jpg_80x80.jpg" class="itempic J_ItemImg">
                        </div>
                        <div class="item-info">
                            <p class="log-status">物流状态:<span>已签收</span></p>
                            <p>承运公司：天天物流</p>
                            <p>快递单号：373269427868</p>
                            <p>官方电话：4001-888-888</p>
                        </div>
                    </div>
                    <div class="clear"></div>
                </div>
                <div class="package-status">
                    <ul class="status-list">
                        <li class="latest">
                            <p class="text">【武汉市】已签收,签收人是青年城签收，感谢使用天天快递，期待再次为您服务</p>
                            <div class="time-list">
                                <span class="date">2015-12-19</span><span class="week">周六</span><span class="time">15:35:42</span>
                            </div>
                        </li>
                        <li>
                            <p class="text">【武汉市】光谷关山分部派件员正在为您派件</p>
                            <div class="time-list">
                                <span class="date hidden">2015-12-19</span><span class="week hidden">周六</span><span
                                    class="time">14:27:28</span>
                            </div>
                        </li>
                        <li>
                            <p class="text">【武汉市】快件已到达 光谷关山分部</p>
                            <div class="time-list">
                                <span class="date hidden">2015-12-19</span><span class="week hidden">周六</span><span
                                    class="time">09:25:51</span>
                            </div>
                        </li>
                        <li>
                            <p class="text">【武汉市】武汉 已发出</p>
                            <div class="time-list">
                                <span class="date  hidden">2015-12-19</span><span class="week  hidden">周六</span><span
                                    class="time">06:56:03</span>
                            </div>
                        </li>
                        <li>
                            <p class="text">【杭州市】杭州集散陆运 已发出</P>
                            <div class="time-list">
                                <span class="date">2015-12-17</span><span class="week">周四</span><span class="time">22:15:23</span>
                            </div>
                        </li>
                        <li>
                            <p class="text">【绍兴市】诸暨 已发出</p>
                            <div class="time-list">
                                <span class="date hidden">2015-12-17</span><span class="week hidden">周四</span><span
                                    class="time">18:55:25</span>
                            </div>
                        </li>
                        <li>
                            <span class="text">【绍兴市】天天快递 诸暨收件员 已揽件</span>
                            <div class="time-list">
                                <span class="date hidden">2015-12-17</span><span class="week hidden">周四</span><span
                                    class="time">18:54:25</span>
                            </div>
                        </li>
                        <li>
                            <span class="text">商家正通知快递公司揽件</span>
                            <div class="time-list">
                                <span class="date hidden">2015-12-17</span><span class="week hidden">周四</span><span
                                    class="time">15:49:40</span>
                            </div>
                        </li>
                        <li>
                            <span class="text">您的包裹已出库</span>
                            <div class="time-list">
                                <span class="date hidden">2015-12-17</span><span class="week hidden">周四</span><span
                                    class="time">15:49:40</span>
                            </div>
                        </li>
                        <li>
                            <p class="text">您的订单待配货</p>
                            <div class="time-list">
                                <span class="date hidden">2015-12-17</span><span class="week hidden">周四</span><span
                                    class="time">15:18:15</span>
                            </div>
                        </li>
                        <li class="first">
                            <p class="text">您的订单开始处理</p>
                            <div class="time-list">
                                <span class="date  hidden">2015-12-17</span><span class="week  hidden">周四</span><span
                                    class="time">14:27:50</span>
                            </div>
                        </li>

                    </ul>
                </div>
            </div>
        </div>
        <!--底部-->
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
    <aside class="menu">
        <ul>
            <li class="person active">
                <a href="index.jsp"><i class="am-icon-user"></i>个人中心</a>
            </li>
            <li class="person">
                <p><i class="am-icon-newspaper-o"></i>个人资料</p>
                <ul>
                    <li><a href="information.jsp">个人信息</a></li>
                    <li><a href="safety.jsp">安全设置</a></li>
                    <li><a href="address.jsp">地址管理</a></li>
                    <li><a href="cardlist.jsp">快捷支付</a></li>
                </ul>
            </li>
            <li class="person">
                <p><i class="am-icon-balance-scale"></i>我的交易</p>
                <ul>
                    <li><a href="order.jsp">订单管理</a></li>
                </ul>
            </li>
            <li class="person">
                <p><i class="am-icon-tags"></i>我的收藏</p>
                <ul>
                    <li><a href="collection.jsp">收藏</a></li>
                    <li><a href="foot.jsp">足迹</a></li>
                </ul>
            </li>

            <li class="person">
                <p><i class="am-icon-qq"></i>在线客服</p>
                <ul>
                    <li><a href="consultation.jsp">商品咨询</a></li>
                    <li><a href="suggest.jsp">意见反馈</a></li>
                </ul>
            </li>
        </ul>

    </aside>
</div>

</body>

</html>