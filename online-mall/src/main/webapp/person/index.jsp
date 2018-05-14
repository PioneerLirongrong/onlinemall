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
    <div class="nav-cont">
        <div class="nav-extra">
            <i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利
            <i class="am-icon-angle-right" style="padding-left: 10px;"></i>
        </div>
    </div>
</div>
<b class="line"></b>
<div class="center">
    <div class="col-main">
        <div class="main-wrap">
            <div class="wrap-left">
                <div class="wrap-list">
                    <div class="m-user">
                        <!--个人信息 -->
                        <div class="m-userinfo">
                            <a href="news.jsp">
                                <div class="tipsBox"><i class="am-icon-envelope"></i></div>
                            </a>
                            <div class="m-baseinfo">
                                <a class="m-pic" href="information.jsp">
                                    <img src="../images/getAvatar.do.jpg">
                                </a>
                                <div class="m-info">
                                    <em class="s-name">小叮当</em>
                                    <div class="vip1"><a href="#"><span></span><em>会员专享</em></a></div>
                                    <div class="safeText"><a href="safety.jsp">账户安全:<em
                                            style="margin-left:20px ;">60</em>分</a>
                                        <div class="progressBar"><span style="left: -95px;" class="progress"></span>
                                        </div>
                                    </div>
                                    <div class="m-address">
                                        <a href="address.jsp" class="i-trigger">收货地址<i class="am-icon-angle-right"
                                                                                       style="padding-left:5px ;"></i></a>
                                    </div>
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

                    <!--优惠券积分-->
                    <div class="twoTab">
                        <div class="twoTabModel Coupon">
                            <h5 class="squareTitle"><a href="#"><span class="splitBorder"></span>优惠券<i
                                    class="am-icon-angle-right"></i></a></h5>
                            <div class="Box">
                                <div class="CouponList">
                                    <span class="price">¥<strong class="num">50</strong></span>
                                    <p class="brandName"><a href="#">ABC品牌499减50</a></p>
                                    <p class="discount">满<span>499</span>元抵扣</p>
                                    <a href="#" class="btnReceive">立即领取</a>
                                </div>
                            </div>
                        </div>
                        <div class="twoTabModel credit">
                            <h5 class="squareTitle"><a href="#"><span class="splitBorder"></span>积分商城<i
                                    class="am-icon-angle-right"></i></a></h5>
                            <div class="Box">
                                <p class="countDown">
                                    <span class="hour">12</span>：<span class="minute">09</span>：<span
                                        class="second">02</span><em class="txtStart">即将开始</em>
                                </p>
                                <div class="am-slider am-slider-default am-slider-carousel"
                                     data-am-flexslider="{itemWidth:108, itemMargin:3, slideshow: false}">
                                    <ul class="am-slides">
                                        <li><a href="#"><img src="../images/333.jpg"/></a></li>
                                        <li><a href="#"><img src="../images/222.jpg"/></a></li>
                                        <li><a href="#"><img src="../images/111.jpg"/></a></li>
                                        <li><a href="#"><img src="../images/333.jpg"/></a></li>
                                        <li><a href="#"><img src="../images/222.jpg"/></a></li>
                                        <li><a href="#"><img src="../images/111.jpg"/></a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
            <div class="clear"></div>
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
                <p><i class="am-icon-dollar"></i>我的资产</p>
                <ul>
                    <li><a href="points.jsp">我的积分</a></li>
                    <li><a href="coupon.jsp">优惠券 </a></li>
                    <li><a href="bonus.jsp">红包</a></li>
                    <li><a href="walletlist.jsp">账户余额</a></li>
                    <li><a href="bill.jsp">账单明细</a></li>
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

                    <li><a href="news.jsp">我的消息</a></li>
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