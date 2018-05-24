<%@ page contentType="text/html;charset=UTF-8" %>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">
    <title>地址管理</title>
    <link href="../AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="../AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">
    <link href="../css/personal.css" rel="stylesheet" type="text/css">
    <link href="../css/addstyle.css" rel="stylesheet" type="text/css">
    <script src="../AmazeUI-2.4.2/assets/js/jquery.min.js" type="text/javascript"></script>
    <script src="../AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
    <script src="../AmazeUI-2.4.2/assets/js/amazeui.js"></script>
    <script src="../js/jquerycookie.js"></script>
    <script src="../js/jquery.md5.js"></script>
    <script src="../js/jquery.base64.js"></script>
    <script src="../onlinemalljs/commonUtils/CommonUtil.js"></script>
    <script src="../onlinemalljs/commonUtils/CommonUserInfo.js"></script>
    <script src="../onlinemalljs/person/address.js"></script>
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

            <div class="user-address">
                <!--标题 -->
                <div class="am-cf am-padding">
                    <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">地址管理</strong> /
                        <small>Address&nbsp;list</small>
                    </div>
                </div>
                <hr/>
                <ul class="am-avg-sm-1 am-avg-md-3 am-thumbnails" id="addressUl">

                </ul>
                <div class="clear"></div>
                <a class="new-abtn-type" data-am-modal="{target: '#doc-modal-1', closeViaDimmer: 0}">添加新地址</a>
                <!--例子-->
                <div class="am-modal am-modal-no-btn" id="doc-modal-1">

                    <div class="add-dress">

                        <!--标题 -->
                        <div class="am-cf am-padding">
                            <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">新增地址</strong> /
                                <small>Add&nbsp;address</small>
                            </div>
                        </div>
                        <hr/>

                        <div class="am-u-md-12 am-u-lg-8" style="margin-top: 20px;">
                            <form class="am-form am-form-horizontal" id="addressForm">

                                <div class="am-form-group">
                                    <label for="username" class="am-form-label">收货人</label>
                                    <div class="am-form-content">
                                        <input type="text" id="username" placeholder="收货人">
                                    </div>
                                </div>

                                <div class="am-form-group">
                                    <label for="userphone" class="am-form-label">手机号码</label>
                                    <div class="am-form-content">
                                        <input id="userphone" placeholder="手机号必填" type="text">
                                    </div>
                                </div>

                                <div class="am-form-group">
                                    <label for="province" class="am-form-label">所属省</label>
                                    <div class="am-form-content">
                                        <input id="province" placeholder="所属省必填" type="text">
                                    </div>
                                </div>

                                <div class="am-form-group">
                                    <label for="city" class="am-form-label">所属市</label>
                                    <div class="am-form-content">
                                        <input id="city" placeholder="所属市必填" type="text">
                                    </div>
                                </div>

                                <div class="am-form-group">
                                    <label for="county" class="am-form-label">所属区</label>
                                    <div class="am-form-content">
                                        <input id="county" placeholder="所属区必填" type="text">
                                    </div>
                                </div>
                                <div class="am-form-group">
                                    <label for="userintro" class="am-form-label">详细地址</label>
                                    <div class="am-form-content">
                                        <textarea class="" rows="3" id="userintro" placeholder="输入详细地址"></textarea>
                                        <small>100字以内写出你的详细地址...</small>
                                    </div>
                                </div>

                                <div class="am-form-group">
                                    <div class="am-u-sm-9 am-u-sm-push-3">
                                        <input id="submit" class="am-btn am-btn-danger" type="submit" value="保存">
                                        <a href="javascript: void(0)" class="am-close am-btn am-btn-danger"
                                           data-am-modal-close>取消</a>
                                    </div>
                                </div>
                            </form>
                        </div>

                    </div>

                </div>

            </div>

            <script type="text/javascript">
                $(document).ready(function () {
                    $(".new-option-r").click(function () {
                        $(this).parent('.user-addresslist').addClass("defaultAddr").siblings().removeClass("defaultAddr");
                    });

                    var $ww = $(window).width();
                    if ($ww > 640) {
                        $("#doc-modal-1").removeClass("am-modal am-modal-no-btn")
                    }

                })
            </script>

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