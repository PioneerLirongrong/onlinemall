<%@ page contentType="text/html;charset=UTF-8" %>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

    <title>退换货管理</title>

    <link href="../AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="../AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

    <link href="../css/personal.css" rel="stylesheet" type="text/css">
    <link href="../css/orstyle.css" rel="stylesheet" type="text/css">

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

            <div class="user-order">

                <!--标题 -->
                <div class="am-cf am-padding">
                    <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">退换货管理</strong> /
                        <small>Change</small>
                    </div>
                </div>
                <hr/>

                <div class="am-tabs am-tabs-d2 am-margin" data-am-tabs>

                    <ul class="am-avg-sm-2 am-tabs-nav am-nav am-nav-tabs">
                        <li class="am-active"><a href="#tab1">退款管理</a></li>
                        <li><a href="#tab2">售后管理</a></li>

                    </ul>

                    <div class="am-tabs-bd">
                        <div class="am-tab-panel am-fade am-in am-active" id="tab1">
                            <div class="order-top">
                                <div class="th th-item">
                                    <td class="td-inner">商品</td>
                                </div>
                                <div class="th th-orderprice th-price">
                                    <td class="td-inner">交易金额</td>
                                </div>
                                <div class="th th-changeprice th-price">
                                    <td class="td-inner">退款金额</td>
                                </div>
                                <div class="th th-status th-moneystatus">
                                    <td class="td-inner">交易状态</td>
                                </div>
                                <div class="th th-change th-changebuttom">
                                    <td class="td-inner">交易操作</td>
                                </div>
                            </div>

                            <div class="order-main">
                                <div class="order-list">
                                    <div class="order-title">
                                        <div class="dd-num">退款编号：<a href="javascript:;">1601430</a></div>
                                        <span>申请时间：2015-12-20</span>
                                        <!--    <em>店铺：小桔灯</em>-->
                                    </div>
                                    <div class="order-content">
                                        <div class="order-left">
                                            <ul class="item-list">
                                                <li class="td td-item">
                                                    <div class="item-pic">
                                                        <a href="#" class="J_MakePoint">
                                                            <img src="../images/kouhong.jpg_80x80.jpg"
                                                                 class="itempic J_ItemImg">
                                                        </a>
                                                    </div>
                                                    <div class="item-info">
                                                        <div class="item-basic-info">
                                                            <a href="#">
                                                                <p>美康粉黛醉美唇膏 持久保湿滋润防水不掉色</p>
                                                                <p class="info-little">颜色：12#川南玛瑙
                                                                    <br/>包装：裸装 </p>
                                                            </a>
                                                        </div>
                                                    </div>
                                                </li>

                                                <ul class="td-changeorder">
                                                    <li class="td td-orderprice">
                                                        <div class="item-orderprice">
                                                            <span>交易金额：</span>72.00
                                                        </div>
                                                    </li>
                                                    <li class="td td-changeprice">
                                                        <div class="item-changeprice">
                                                            <span>退款金额：</span>70.00
                                                        </div>
                                                    </li>
                                                </ul>
                                                <div class="clear"></div>
                                            </ul>

                                            <div class="change move-right">
                                                <li class="td td-moneystatus td-status">
                                                    <div class="item-status">
                                                        <p class="Mystatus">退款成功</p>

                                                    </div>
                                                </li>
                                            </div>
                                            <li class="td td-change td-changebutton">
                                                <a href="record.html">
                                                    <div class="am-btn am-btn-danger anniu">
                                                        钱款去向
                                                    </div>
                                                </a>
                                            </li>

                                        </div>
                                    </div>
                                </div>

                            </div>

                        </div>
                        <div class="am-tab-panel am-fade" id="tab2">
                            <div class="order-top">
                                <div class="th th-item">
                                    <td class="td-inner">商品</td>
                                </div>
                                <div class="th th-orderprice th-price">
                                    <td class="td-inner">交易金额</td>
                                </div>
                                <div class="th th-changeprice th-price">
                                    <td class="td-inner">退款金额</td>
                                </div>
                                <div class="th th-status th-moneystatus">
                                    <td class="td-inner">交易状态</td>
                                </div>
                                <div class="th th-change th-changebuttom">
                                    <td class="td-inner">交易操作</td>
                                </div>
                            </div>

                            <div class="order-main">
                                <div class="order-list">
                                    <div class="order-title">
                                        <div class="dd-num">退款编号：<a href="javascript:;">1601430</a></div>
                                        <span>申请时间：2015-12-20</span>
                                        <!--    <em>店铺：小桔灯</em>-->
                                    </div>
                                    <div class="order-content">
                                        <div class="order-left">
                                            <ul class="item-list">
                                                <li class="td td-item">
                                                    <div class="item-pic">
                                                        <a href="#" class="J_MakePoint">
                                                            <img src="../images/kouhong.jpg_80x80.jpg"
                                                                 class="itempic J_ItemImg">
                                                        </a>
                                                    </div>
                                                    <div class="item-info">
                                                        <div class="item-basic-info">
                                                            <a href="#">
                                                                <p>美康粉黛醉美唇膏 持久保湿滋润防水不掉色</p>
                                                                <p class="info-little">颜色：12#川南玛瑙
                                                                    <br/>包装：裸装 </p>
                                                            </a>
                                                        </div>
                                                    </div>
                                                </li>

                                                <ul class="td-changeorder">
                                                    <li class="td td-orderprice">
                                                        <div class="item-orderprice">
                                                            <span>交易金额：</span>72.00
                                                        </div>
                                                    </li>
                                                    <li class="td td-changeprice">
                                                        <div class="item-changeprice">
                                                            <span>退款金额：</span>70.00
                                                        </div>
                                                    </li>
                                                </ul>
                                                <div class="clear"></div>
                                            </ul>

                                            <div class="change move-right">
                                                <li class="td td-moneystatus td-status">
                                                    <div class="item-status">
                                                        <p class="Mystatus">退款成功</p>

                                                    </div>
                                                </li>
                                            </div>
                                            <li class="td td-change td-changebutton">
                                                <a href="record.html">
                                                    <div class="am-btn am-btn-danger anniu">
                                                        钱款去向
                                                    </div>
                                                </a>
                                            </li>

                                        </div>
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
                    <li><a href="address.html">地址管理</a></li>
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
                    <li><a href="suggest.html">意见反馈</a></li>

                    <li><a href="news.jsp">我的消息</a></li>
                </ul>
            </li>
        </ul>

    </aside>
</div>

</body>

</html>