<%@ page contentType="text/html;charset=UTF-8" %>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

    <title>银行卡绑定</title>

    <link href="../AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="../AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

    <link href="../css/personal.css" rel="stylesheet" type="text/css">
    <link href="../css/stepstyle.css" rel="stylesheet" type="text/css">

    <script type="text/javascript" src="../js/jquery-1.7.2.min.js"></script>
    <script src="../AmazeUI-2.4.2/assets/js/amazeui.js"></script>
    <script src="../AmazeUI-2.4.2/assets/js/amazeui.js"></script>
    <script src="../AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
    <script src="../js/jquerycookie.js"></script>
    <script src="../js/jquery.md5.js"></script>
    <script src="../js/jquery.base64.js"></script>
    <script src="../onlinemalljs/commonUtils/CommonUtil.js"></script>
    <script src="../onlinemalljs/commonUtils/CommonUserInfo.js"></script>
    <script src="../onlinemalljs/person/cardAdd.js"></script>
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
                <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">银行卡绑定</strong> /
                    <small>Bind&nbsp;Card</small>
                </div>
            </div>
            <hr/>
            <!--进度条-->
            <div class="m-progress">
                <div class="m-progress-list">
							<span class="step-1 step">
                                <em class="u-progress-stage-bg"></em>
                                <i class="u-stage-icon-inner">1<em class="bg"></em></i>
                                <p class="stage-name">实名认证</p>
                            </span>
                    <span class="step-2 step">
                                <em class="u-progress-stage-bg"></em>
                                <i class="u-stage-icon-inner">2<em class="bg"></em></i>
                                <p class="stage-name">完成</p>
                            </span>
                    <span class="u-progress-placeholder"></span>
                </div>
                <div class="u-progress-bar total-steps-2">
                    <div class="u-progress-bar-inner"></div>
                </div>
            </div>
            <form class="am-form am-form-horizontal" id="bankCardAdd">
                <div class="am-form-group">
                    <label for="user-name" class="am-form-label">真实姓名</label>
                    <div class="am-form-content">
                        <input type="text" id="user-name" placeholder="请输入您的真实姓名">
                    </div>
                </div>
                <div class="am-form-group">
                    <label for="user-IDcard" class="am-form-label">身份证号</label>
                    <div class="am-form-content">
                        <input type="tel" id="user-IDcard" placeholder="请输入您的身份证信息">
                    </div>
                </div>
                <div class="am-form-group">
                    <label for="bankSelect" class="am-form-label">银行名称</label>
                    <div class="am-form-content">
                        <select id="bankSelect">
                            <option value="中国建设银行">中国建设银行</option>
                            <option value="中国农业银行">中国农业银行</option>
                            <option value="中国工商银行">中国工商银行</option>
                            <option value="浦发银行">浦发银行</option>
                            <option value="北京银行">北京银行</option>
                            <option value="平安银行">平安银行</option>
                            <option value="光大银行">光大银行</option>
                            <option value="中国银行">中国银行</option>
                        </select>
                    </div>
                </div>
                <div class="am-form-group">
                    <label for="bankTypeSelect" class="am-form-label">卡的类型</label>
                    <div class="am-form-content">
                        <select id="bankTypeSelect">
                            <option value="1">信用卡</option>
                            <option value="2">储蓄卡</option>
                            <option value="3">借计卡</option>
                        </select>
                    </div>
                </div>
                <div class="am-form-group">
                    <label for="BankID" class="am-form-label">银行卡号</label>
                    <div class="am-form-content">
                        <input type="text" id="BankID" placeholder="请输入要绑定的银行卡卡号">
                    </div>
                </div>
                <div class="am-form-group">
                    <label for="phone" class="am-form-label">手机号码</label>
                    <div class="am-form-content">
                        <input type="text" id="phone" placeholder="请输入此卡的预留手机号">
                    </div>
                </div>
                <div class="info-btn">
                    <input id="submit" class="am-btn am-btn-danger" type="submit" value="开通协议并确定">
                </div>

            </form>

        </div>
        <!--底部-->
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