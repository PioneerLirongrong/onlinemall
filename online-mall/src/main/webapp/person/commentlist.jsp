<%@ page contentType="text/html;charset=UTF-8" %>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">
    <title>发表评论</title>
    <link href="../AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="../AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">
    <link href="../css/personal.css" rel="stylesheet" type="text/css">
    <link href="../css/appstyle.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="../js/jquery-1.7.2.min.js"></script>
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

            <div class="user-comment">
                <!--标题 -->
                <div class="am-cf am-padding">
                    <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">发表评论</strong> /
                        <small>Make&nbsp;Comments</small>
                    </div>
                </div>
                <hr/>

                <div class="comment-main">
                    <div class="comment-list">
                        <div class="item-pic">
                            <a href="#" class="J_MakePoint">
                                <img src="../images/comment.jpg_400x400.jpg" class="itempic">
                            </a>
                        </div>

                        <div class="item-title">

                            <div class="item-name">
                                <a href="#">
                                    <p class="item-basic-info">美康粉黛醉美唇膏 持久保湿滋润防水不掉色</p>
                                </a>
                            </div>
                            <div class="item-info">
                                <div class="info-little">
                                    <span>颜色：洛阳牡丹</span>
                                    <span>包装：裸装</span>
                                </div>
                                <div class="item-price">
                                    价格：<strong>19.88元</strong>
                                </div>
                            </div>
                        </div>
                        <div class="clear"></div>
                        <div class="item-comment">
                            <textarea placeholder="请写下对宝贝的感受吧，对他人帮助很大哦！"></textarea>
                        </div>
                        <div class="filePic">
                            <input type="file" class="inputPic" allowexts="gif,jpeg,jpg,png,bmp" accept="image/*">
                            <span>晒照片(0/5)</span>
                            <img src="../images/image.jpg" alt="">
                        </div>
                        <div class="item-opinion">
                            <li><i class="op1"></i>好评</li>
                            <li><i class="op2"></i>中评</li>
                            <li><i class="op3"></i>差评</li>
                        </div>
                    </div>

                    <!--多个商品评论-->
                    <div class="comment-list">
                        <div class="item-pic">
                            <a href="#" class="J_MakePoint">
                                <img src="../images/comment.jpg_400x400.jpg" class="itempic">
                            </a>
                        </div>

                        <div class="item-title">

                            <div class="item-name">
                                <a href="#">
                                    <p class="item-basic-info">美康粉黛醉美唇膏 持久保湿滋润防水不掉色</p>
                                </a>
                            </div>
                            <div class="item-info">
                                <div class="info-little">
                                    <span>颜色：洛阳牡丹</span>
                                    <span>包装：裸装</span>
                                </div>
                                <div class="item-price">
                                    价格：<strong>19.88元</strong>
                                </div>
                            </div>
                        </div>
                        <div class="clear"></div>
                        <div class="item-comment">
                            <textarea placeholder="请写下对宝贝的感受吧，对他人帮助很大哦！"></textarea>
                        </div>
                        <div class="filePic">
                            <input type="file" class="inputPic" allowexts="gif,jpeg,jpg,png,bmp" accept="image/*">
                            <span>晒照片(0/5)</span>
                            <img src="../images/image.jpg" alt="">
                        </div>
                        <div class="item-opinion">
                            <ul>
                                <li><i class="op1"></i>好评</li>
                                <li><i class="op2"></i>中评</li>
                                <li><i class="op3"></i>差评</li>
                            </ul>
                        </div>
                    </div>

                    <div class="comment-list">
                        <div class="item-pic">
                            <a href="#" class="J_MakePoint">
                                <img src="../images/comment.jpg_400x400.jpg" class="itempic">
                            </a>
                        </div>

                        <div class="item-title">

                            <div class="item-name">
                                <a href="#">
                                    <p class="item-basic-info">美康粉黛醉美唇膏 持久保湿滋润防水不掉色</p>
                                </a>
                            </div>
                            <div class="item-info">
                                <div class="info-little">
                                    <span>颜色：洛阳牡丹</span>
                                    <span>包装：裸装</span>
                                </div>
                                <div class="item-price">
                                    价格：<strong>19.88元</strong>
                                </div>
                            </div>
                        </div>
                        <div class="clear"></div>
                        <div class="item-comment">
                            <textarea placeholder="请写下对宝贝的感受吧，对他人帮助很大哦！"></textarea>
                        </div>
                        <div class="filePic">
                            <input type="file" class="inputPic" allowexts="gif,jpeg,jpg,png,bmp" accept="image/*">
                            <span>晒照片(0/5)</span>
                            <img src="../images/image.jpg" alt="">
                        </div>
                        <div class="item-opinion">
                            <li><i class="op1"></i>好评</li>
                            <li><i class="op2"></i>中评</li>
                            <li><i class="op3"></i>差评</li>
                        </div>
                    </div>
                    <div class="info-btn">
                        <div class="am-btn am-btn-danger">发表评论</div>
                    </div>
                    <script type="text/javascript">
                        $(document).ready(function () {
                            $(".comment-list .item-opinion li").click(function () {
                                $(this).prevAll().children('i').removeClass("active");
                                $(this).nextAll().children('i').removeClass("active");
                                $(this).children('i').addClass("active");

                            });
                        })
                    </script>


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