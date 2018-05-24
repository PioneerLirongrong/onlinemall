<%@ page contentType="text/html;charset=UTF-8" %>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">
    <title>优惠券</title>
    <link href="../AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="../AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">
    <link href="../css/personal.css" rel="stylesheet" type="text/css">
    <link href="../css/cpstyle.css" rel="stylesheet" type="text/css">
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
</div>
<b class="line"></b>
<div class="center">
    <div class="col-main">
        <div class="main-wrap">

            <div class="user-coupon">
                <!--标题 -->
                <div class="am-cf am-padding">
                    <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">优惠券</strong> /
                        <small>Coupon</small>
                    </div>
                </div>
                <hr/>

                <div class="am-tabs-d2 am-tabs  am-margin" data-am-tabs>

                    <ul class="am-avg-sm-2 am-tabs-nav am-nav am-nav-tabs">
                        <li class="am-active"><a href="#tab1">可用优惠券</a></li>
                        <li><a href="#tab2">已用/过期优惠券</a></li>
                    </ul>

                    <div class="am-tabs-bd">
                        <div class="am-tab-panel am-fade am-in am-active" id="tab1">
                            <div class="coupon-items">
                                <div class="coupon-item coupon-item-d">
                                    <div class="coupon-list">
                                        <div class="c-type">
                                            <div class="c-class">
                                                <strong>购物券</strong>
                                            </div>
                                            <div class="c-price">
                                                <strong>￥8</strong>
                                            </div>
                                            <div class="c-limit">
                                                【消费满&nbsp;95元&nbsp;可用】
                                            </div>
                                            <div class="c-time"><span>使用期限</span>2015-12-21--2015-12-31</div>
                                            <div class="c-type-top"></div>

                                            <div class="c-type-bottom"></div>
                                        </div>

                                        <div class="c-msg">
                                            <div class="c-range">
                                                <div class="range-all">
                                                    <div class="range-item">
                                                        <span class="label">券&nbsp;编&nbsp;号：</span>
                                                        <span class="txt">35730144</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="op-btns">
                                                <a href="#" class="btn"><span class="txt">立即使用</span><b></b></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="coupon-item coupon-item-yf">
                                    <div class="coupon-list">
                                        <div class="c-type">
                                            <div class="c-class">
                                                <strong>运费券</strong>
                                            </div>
                                            <div class="c-price">
                                                <strong>可抵运费</strong>
                                            </div>
                                            <div class="c-limit">
                                                【不含偏远地区】
                                            </div>
                                            <div class="c-time"><span>使用期限</span>2015-12-21--2015-12-31</div>
                                            <div class="c-type-top"></div>

                                            <div class="c-type-bottom"></div>
                                        </div>

                                        <div class="c-msg">
                                            <div class="c-range">
                                                <div class="range-all">
                                                    <div class="range-item">
                                                        <span class="label">券&nbsp;编&nbsp;号：</span>
                                                        <span class="txt">35728267</span>
                                                    </div>
                                                </div>

                                            </div>
                                            <div class="op-btns">
                                                <a href="#" class="btn"><span class="txt">立即使用</span><b></b></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>
                        <div class="am-tab-panel am-fade" id="tab2">
                            <div class="coupon-items">
                                <div class="coupon-item coupon-item-d">
                                    <div class="coupon-list">
                                        <div class="c-type">
                                            <div class="c-class">
                                                <strong>购物券</strong>
                                                <span class="am-icon-trash"></span>
                                            </div>
                                            <div class="c-price">
                                                <strong>￥8</strong>
                                            </div>
                                            <div class="c-limit">
                                                【消费满&nbsp;95元&nbsp;可用】
                                            </div>
                                            <div class="c-time"><span>使用期限</span>2015-12-21--2015-12-31</div>
                                            <div class="c-type-top"></div>

                                            <div class="c-type-bottom"></div>
                                        </div>

                                        <div class="c-msg">
                                            <div class="c-range">
                                                <div class="range-all">
                                                    <div class="range-item">
                                                        <span class="label">券&nbsp;编&nbsp;号：</span>
                                                        <span class="txt">35730144</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="op-btns c-del">
                                                <a href="#" class="btn"><span class="txt">删除</span><b></b></a>
                                            </div>
                                        </div>

                                        <li class="td td-usestatus ">
                                            <div class="item-usestatus ">
                                                <span><img src="../images/gift_stamp_31.png"/></span>
                                            </div>
                                        </li>
                                    </div>
                                </div>
                                <div class="coupon-item coupon-item-yf">
                                    <div class="coupon-list">
                                        <div class="c-type">
                                            <div class="c-class">
                                                <strong>运费券</strong>
                                                <span class="am-icon-trash"></span>
                                            </div>
                                            <div class="c-price">
                                                <strong>可抵运费</strong>
                                            </div>
                                            <div class="c-limit">
                                                【不含偏远地区】
                                            </div>
                                            <div class="c-time"><span>使用期限</span>2015-12-21--2015-12-31</div>
                                            <div class="c-type-top"></div>

                                            <div class="c-type-bottom"></div>
                                        </div>

                                        <div class="c-msg">
                                            <div class="c-range">
                                                <div class="range-all">
                                                    <div class="range-item">
                                                        <span class="label">券&nbsp;编&nbsp;号：</span>
                                                        <span class="txt">35728267</span>
                                                    </div>
                                                </div>

                                            </div>
                                            <div class="op-btns c-del">
                                                <a href="#" class="btn"><span class="txt">删除</span><b></b></a>
                                            </div>
                                        </div>

                                        <li class="td td-usestatus ">
                                            <div class="item-usestatus ">
                                                <span><img src="../images/gift_stamp_21.png"/></span>
                                            </div>
                                        </li>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>

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
</div>

</body>

</html>