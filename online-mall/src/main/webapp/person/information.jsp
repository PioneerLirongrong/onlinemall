<%@ page contentType="text/html;charset=UTF-8" %>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">
    <title>个人资料</title>
    <link href="../AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="../AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">
    <link href="../css/personal.css" rel="stylesheet" type="text/css">
    <link href="../css/infstyle.css" rel="stylesheet" type="text/css">
    <script src="../AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
    <script src="../AmazeUI-2.4.2/assets/js/amazeui.js"></script>
    <script src="../js/jquerycookie.js"></script>
    <script src="../js/jquery.md5.js"></script>
    <script src="../js/jquery.base64.js"></script>
    <script src="../onlinemalljs/commonUtils/CommonUtil.js"></script>
    <script src="../onlinemalljs/commonUtils/CommonUserInfo.js"></script>
    <script src="../onlinemalljs/person/infomation.js"></script>
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

            <div class="user-info">
                <!--标题 -->
                <div class="am-cf am-padding">
                    <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">个人资料</strong> /
                        <small>Personal&nbsp;information</small>
                    </div>
                </div>
                <hr/>

                <!--头像 -->
                <div class="user-infoPic">

                    <div class="filePic">
                        <img class="am-circle am-img-thumbnail" src="../images/getAvatar.do.jpg" alt=""/>
                    </div>

                    <p class="am-form-help">头像</p>

                    <div id= 'info1' class="info-m">
                    </div>
                </div>

                <!--个人信息 -->
                <div class="info-main">
                    <form class="am-form am-form-horizontal">

                        <div class="am-form-group">
                            <label for="user-name1" class="am-form-label">昵称</label>
                            <div class="am-form-content">
                                <input type="text" id="user-name1" placeholder="nickname">
                                <small>昵称长度不能超过40个汉字</small>
                            </div>
                        </div>

                        <div class="am-form-group">
                            <label for="user-name2" class="am-form-label">姓名</label>
                            <div class="am-form-content">
                                <input type="text" id="user-name2" placeholder="name">

                            </div>
                        </div>

                        <div class="am-form-group">
                            <label class="am-form-label">性别</label>
                            <div class="am-form-content sex">
                                <label class="am-radio-inline">
                                    <input id = 'radio1' type="radio" name="sex" value="1" data-am-ucheck> 男
                                </label>
                                <label class="am-radio-inline">
                                    <input id = 'radio2' type="radio" name="sex" value="0" data-am-ucheck> 女
                                </label>
                                <label class="am-radio-inline">
                                    <input id = 'radio3' type="radio" name="sex" value="2" data-am-ucheck> 保密
                                </label>
                            </div>
                        </div>

                        <div class="am-form-group">
                            <label for="user-birth" class="am-form-label">生日</label>
                            <div id='user-birth' class="am-form-content birth">
                                <div class="birth-select">
                                    <select id = 'data-am-selected1'>
                                        <option value="1990">1990</option>
                                        <option value="1991">1991</option>
                                        <option value="1992">1992</option>
                                        <option value="1993">1993</option>
                                        <option value="1994">1994</option>
                                        <option value="1995">1995</option>
                                        <option value="1996">1996</option>
                                        <option value="1997">1997</option>
                                        <option value="1998">1998</option>
                                        <option value="1999">1999</option>
                                        <option value="2000">2000</option>
                                        <option value="2001">2001</option>
                                        <option value="2002">2002</option>
                                        <option value="2003">2003</option>
                                        <option value="2004">2004</option>
                                        <option value="2005">2005</option>
                                        <option value="2006">2006</option>
                                        <option value="2007">2007</option>
                                        <option value="2008">2008</option>
                                        <option value="2009">2009</option>
                                        <option value="2011">2011</option>
                                        <option value="2012">2012</option>
                                        <option value="2013">2013</option>
                                        <option value="2014">2014</option>
                                        <option value="2015">2015</option>
                                        <option value="2016">2016</option>
                                        <option value="2017">2017</option>
                                        <option value="2018">2018</option>
                                    </select>
                                    <em>年</em>
                                </div>
                                <div class="birth-select2">
                                    <select id="data-am-selected2">
                                        <option value="1">1</option>
                                        <option value="2">2</option>
                                        <option value="3">3</option>
                                        <option value="4">4</option>
                                        <option value="5">5</option>
                                        <option value="6">6</option>
                                        <option value="7">7</option>
                                        <option value="8">8</option>
                                        <option value="9">9</option>
                                        <option value="10">10</option>
                                        <option value="11">11</option>
                                        <option value="12">12</option>
                                    </select>
                                    <em>月</em>
                                </div>
                            </div>

                        </div>
                        <div class="am-form-group">
                            <label for="user-phone" class="am-form-label">电话</label>
                            <div class="am-form-content">
                                <input id="user-phone" placeholder="telephonenumber" type="tel">

                            </div>
                        </div>
                        <div class="am-form-group">
                            <label for="useremail" class="am-form-label">电子邮件</label>
                            <div class="am-form-content">
                                <input id="useremail" placeholder="Email" type="text">
                            </div>
                        </div>
                        <div class="info-btn">
                            <input id="submit" class="am-btn am-btn-danger" type="submit" value="保存修改">
                        </div>

                    </form>
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