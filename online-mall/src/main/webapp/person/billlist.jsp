<%@ page contentType="text/html;charset=UTF-8" %>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

    <title>账单明细</title>

    <link href="../AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="../AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

    <link href="../css/personal.css" rel="stylesheet" type="text/css">
    <link href="../css/bilstyle.css" rel="stylesheet" type="text/css">

    <script src="../AmazeUI-2.4.2/assets/js/jquery.min.js" type="text/javascript"></script>
    <script src="../AmazeUI-2.4.2/assets/js/amazeui.js" type="text/javascript"></script>

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
            <div class="am-cf am-padding">
                <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">账单明细</strong> /
                    <small>Electronic&nbsp;bill</small>
                </div>
            </div>
            <hr>

            <!--交易时间	-->

            <div class="order-time">
                <label class="form-label">交易时间：</label>
                <div class="show-input">
                    <select class="am-selected" data-am-selected>
                        <option value="today">今天</option>
                        <option value="sevenDays" selected="">最近一周</option>
                        <option value="oneMonth">最近一个月</option>
                        <option value="threeMonths">最近三个月</option>
                        <option class="date-trigger">自定义时间</option>
                    </select>
                </div>
                <div class="clear"></div>
            </div>

            <table width="100%">

                <thead>
                <tr>
                    <th class="memo"></th>
                    <th class="time">创建时间</th>
                    <th class="name">名称</th>
                    <th class="amount">金额</th>
                    <th class="action">操作</th>
                </tr>
                </thead>

                <tbody>
                <tr>
                    <td class="img">
                        <i><img src="../images/songzi.jpg"></i>
                    </td>
                    <td class="time">
                        <p> 2016-01-28
                        </p>
                        <p class="text-muted"> 10:58
                        </p>
                    </td>
                    <td class="title name">
                        <p class="content">
                            良品铺子精选松子，即开即食全国包邮
                        </p>
                    </td>

                    <td class="amount">
                        <span class="amount-pay">- 11.90</span>
                    </td>
                    <td class="operation">
                        删除
                    </td>
                </tr>

                <tr>

                    <td class="img">
                        <i><img src="../images/songzi.jpg"></i>
                    </td>
                    <td class="time">
                        <p> 2016-01-28
                        </p>
                        <p class="text-muted"> 10:58
                        </p>
                    </td>
                    <td class="title name">
                        <p class="content">
                            良品铺子精选松子，即开即食全国包邮
                        </p>
                    </td>

                    <td class="amount">
                        <span class="amount-pay">- 11.90</span>
                    </td>
                    <td class="operation">
                        删除
                    </td>
                </tr>
                </tbody>
            </table>

            <script type="text/javascript">
                $(document).ready(function () {
                    $(".date-trigger").click(function () {
                        $(".show-input").css("display", "none");
                    });

                })
            </script>

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