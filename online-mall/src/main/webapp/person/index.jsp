<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">
    <title>个人中心</title>
    <link href="../AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="../AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">
    <link href="../css/personal.css" rel="stylesheet" type="text/css">
    <link href="../css/vipstyle.css" rel="stylesheet" type="text/css">
    <script src="../AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
    <script src="../AmazeUI-2.4.2/assets/js/amazeui.js"></script>
    <script src="../js/jquerycookie.js"></script>
    <script src="../js/jquery.md5.js"></script>
    <script src="../js/jquery.base64.js"></script>
    <script src="../onlinemalljs/commonUtils/CommonUtil.js"></script>
    <script src="../onlinemalljs/commonUtils/CommonUserInfo.js"></script>
    <script src="../onlinemalljs/person/index.js"></script>
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
            <div class="wrap-left">
                <div class="wrap-list">
                    <div class="m-user">
                        <!--个人信息 -->
                        <div  class="m-userinfo">
                            <a href="news.jsp">
                                <div class="tipsBox"><i class="am-icon-envelope"></i></div>
                            </a>
                            <div class="m-baseinfo">
                                <a class="m-pic" href="information.jsp">
                                    <img src="../images/getAvatar.do.jpg">
                                </a>
                                <div id= 'm-userInfo' class="m-info">

                                </div>
                            </div>
                            <div class="m-right">
                                <div class="m-new">
                                    <a href="news.jsp"><i class="am-icon-dropbox  am-icon-md"
                                                          style="padding-right:5px ;"></i>消息盒子</a>
                                </div>
                            </div>
                        </div>

                        <!--个人资产-->
                        <div class="m-userproperty">
                            <div class="s-bar">
                                <i class="s-icon"></i>个人资产
                            </div>
                            <p class="m-coupon">
                                <a href="coupon.jsp">
                                    <em class="m-num">2</em>
                                    <span class="m-title">优惠券</span>
                                </a>
                            </p>
                            <p class="m-wallet">
                                <a href="wallet.jsp">
                                    <em class="m-num">0.00</em>
                                    <span class="m-title">账户余额</span>
                                </a>
                            </p>
                            <p class="m-bill">
                                <a href="pointnew.jsp">
                                    <em class="m-num">10</em>
                                    <span class="m-title">总积分</span>
                                </a>
                            </p>
                        </div>

                        <!--我的钱包-->
                        <div class="wallet">
                            <div class="s-bar">
                                <i class="s-icon"></i>商城钱包
                            </div>
                            <p class="m-big squareS">
                                <a href="cardlist.jsp">
                                    <i><img src="../images/shopping.png"/></i>
                                    <span class="m-title">能购物</span>
                                </a>
                            </p>
                            <p class="m-big squareA">
                                <a href="safety.jsp">
                                    <i><img src="../images/safe.png"/></i>
                                    <span class="m-title">够安全</span>
                                </a>
                            </p>
                            <p class="m-big squareL">
                                <a href="bonus.jsp">
                                    <i><img src="../images/profit.png"/></i>
                                    <span class="m-title">很灵活</span>
                                </a>
                            </p>
                        </div>

                    </div>
                    <div class="box-container-bottom"></div>

                    <!--订单 -->
                    <div class="m-order">
                        <div class="s-bar">
                            <i class="s-icon"></i>我的订单
                            <a class="i-load-more-item-shadow" href="order.jsp">全部订单</a>
                        </div>
                        <ul>
                            <li><a href="order.jsp"><i><img src="../images/pay.png"/></i><span>待付款</span></a></li>
                            <li><a href="order.jsp"><i><img src="../images/send.png"/></i><span>待发货<em
                                    class="m-num">1</em></span></a></li>
                            <li><a href="order.jsp"><i><img src="../images/receive.png"/></i><span>待收货</span></a></li>
                            <li><a href="order.jsp"><i><img src="../images/comment.png"/></i><span>待评价<em
                                    class="m-num">3</em></span></a></li>
                            <li><a href="change.jsp"><i><img src="../images/refund.png"/></i><span>退换货</span></a></li>
                        </ul>
                        <div class="orderContentBox">
                            <div class="orderContent">
                                <div class="orderContentpic">
                                    <div class="imgBox">
                                        <a href="orderinfo.jsp"><img src="../images/youzi.jpg"></a>
                                    </div>
                                </div>
                                <div class="detailContent">
                                    <a href="orderinfo.jsp" class="delivery">签收</a>
                                    <div class="orderID">
                                        <span class="time">2016-03-09</span>
                                        <span class="splitBorder">|</span>
                                        <span class="time">21:52:47</span>
                                    </div>
                                    <div class="orderID">
                                        <span class="num">共1件商品</span>
                                    </div>
                                </div>
                                <div class="state">待评价</div>
                                <div class="price"><span class="sym">¥</span>23.<span class="sym">80</span></div>

                            </div>
                            <a href="javascript:void(0);" class="btnPay">再次购买</a>
                        </div>

                        <div class="orderContentBox">
                            <div class="orderContent">
                                <div class="orderContentpic">
                                    <div class="imgBox">
                                        <a href="orderinfo.jsp"><img src="../images/heart.jpg"></a>
                                    </div>
                                </div>
                                <div class="detailContent">
                                    <a href="orderinfo.jsp" class="delivery">派件</a>
                                    <div class="orderID">
                                        <span class="time">2016-03-09</span>
                                        <span class="splitBorder">|</span>
                                        <span class="time">21:52:47</span>
                                    </div>
                                    <div class="orderID">
                                        <span class="num">共2件商品</span>
                                    </div>
                                </div>
                                <div class="state">已发货</div>
                                <div class="price"><span class="sym">¥</span>246.<span class="sym">50</span></div>

                            </div>
                            <a href="javascript:void(0);" class="btnPay">再次购买</a>
                        </div>
                    </div>
                    <!--九宫格-->
                    <div class="user-squaredIcon">
                        <div class="s-bar">
                            <i class="s-icon"></i>我的常用
                        </div>
                        <ul>
                            <a href="order.jsp">
                                <li class="am-u-sm-4"><i class="am-icon-truck am-icon-md"></i>
                                    <p>物流查询</p>
                                </li>
                            </a>
                            <a href="collection.jsp">
                                <li class="am-u-sm-4"><i class="am-icon-heart am-icon-md"></i>
                                    <p>我的收藏</p>
                                </li>
                            </a>
                            <a href="foot.jsp">
                                <li class="am-u-sm-4"><i class="am-icon-paw am-icon-md"></i>
                                    <p>我的足迹</p>
                                </li>
                            </a>
                            <a href="#">
                                <li class="am-u-sm-4"><i class="am-icon-gift am-icon-md"></i>
                                    <p>为你推荐</p>
                                </li>
                            </a>
                            <a href="blog.jsp">
                                <li class="am-u-sm-4"><i class="am-icon-share-alt am-icon-md"></i>
                                    <p>我的分享</p>
                                </li>
                            </a>
                            <a href="../home/home2.jsp">
                                <li class="am-u-sm-4"><i class="am-icon-clock-o am-icon-md"></i>
                                    <p>限时活动</p>
                                </li>
                            </a>

                        </ul>
                    </div>

                    <div class="user-suggestion">
                        <div class="s-bar">
                            <i class="s-icon"></i>会员中心
                        </div>
                        <div class="s-bar">
                            <a href="suggest.jsp"><i class="s-icon"></i>意见反馈</a>
                        </div>
                    </div>
                </div>
            </div>
            <%--<div class="clear"></div>--%>
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
                    <li><a href="change.jsp">退款售后</a></li>
                    <li><a href="comment.jsp">评价商品</a></li>
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
<!--引导 -->
<div class="navCir">
    <li><a href="../home/home2.jsp"><i class="am-icon-home "></i>首页</a></li>
    <li><a href="../home/sort.jsp"><i class="am-icon-list"></i>分类</a></li>
    <li><a href="../home/shopcart.jsp"><i class="am-icon-shopping-basket"></i>购物车</a></li>
    <li class="active"><a href="index.jsp"><i class="am-icon-user"></i>我的</a></li>
</div>
</body>

</html>