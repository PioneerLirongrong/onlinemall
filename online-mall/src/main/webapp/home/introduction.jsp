<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

    <title>商品页面</title>

    <link href="../AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css"/>
    <link href="../AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css"/>
    <link href="../basic/css/demo.css" rel="stylesheet" type="text/css"/>
    <link type="text/css" href="../css/optstyle.css" rel="stylesheet"/>
    <link type="text/css" href="../css/style.css" rel="stylesheet"/>
    <script type="text/javascript" src="../basic/js/jquery-1.7.min.js"></script>
    <script type="text/javascript" src="../basic/js/quick_links.js"></script>
    <script type="text/javascript" src="../AmazeUI-2.4.2/assets/js/amazeui.js"></script>
    <script type="text/javascript" src="../js/jquery.imagezoom.min.js"></script>
    <script type="text/javascript" src="../js/jquery.flexslider.js"></script>
    <script type="text/javascript" src="../js/list.js"></script>
    <script src="../js/jquerycookie.js"></script>
    <script src="../js/jquery.md5.js"></script>
    <script src="../js/jquery.base64.js"></script>
    <script src="../onlinemalljs/commonUtils/CommonUtil.js"></script>
    <script src="../onlinemalljs/commonUtils/CommonUserInfo.js"></script>
    <script src="../onlinemalljs/home/home.js"></script>
    <script src="../onlinemalljs/commonUtils/ShopGooDConfig.js"></script>
    <script src="../onlinemalljs/home/introduction.js"></script>
</head>
<body>
<!--顶部导航条 -->
<div class="am-container header">
    <ul class="message-r">
        <div class="topMessage home">
            <div class="menu-hd"><a href="../home/login.jsp" target="_top" class="h">商城首页</a></div>
        </div>
        <div class="topMessage my-shangcheng">
            <div class="menu-hd MyShangcheng"><a href="../person/index.jsp" target="_top"><i
                    class="am-icon-user am-icon-fw"></i>个人中心</a>
            </div>
        </div>
        <div class="topMessage mini-cart">
            <div class="menu-hd"><a id="mc-menu-hd" href="../home/shopcart.jsp" target="_top"><i
                    class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum"
                                                                                          class="h">0</strong></a></div>
        </div>
        <div class="topMessage favorite">
            <div class="menu-hd"><a href="../person/collection.jsp" target="_top"><i
                    class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a>
            </div>
        </div>
    </ul>
</div>


<div class="clear"></div>
<b class="line"></b>
<div class="listMain">

    <!--分类-->
    <div class="nav-table">
        <div class="long-title"><span class="all-goods">全部分类</span></div>
    </div>
    <ol class="am-breadcrumb am-breadcrumb-slash">
        <li><a href="#">首页</a></li>
        <li><a href="#">分类</a></li>
        <li class="am-active">内容</li>
    </ol>
    <script type="text/javascript">
        $(function () {
        });
        $(window).load(function () {
            $('.flexslider').flexslider({
                animation: "slide",
                start: function (slider) {
                    $('body').removeClass('loading');
                }
            });
        });
    </script>
    <!--放大镜-->

    <div class="item-inform" id="inform">
        <div class="clearfixLeft" id="clearcontent">
        <%--<div class="box">--%>
        <%--<div class="tb-booth tb-pic tb-s310">--%>
        <%--<a href="../images/01.jpg"><img src="../images/01_mid.jpg" alt="细节展示放大镜特效" rel="../images/01.jpg"--%>
        <%--class="jqzoom"/></a>--%>
        <%--</div>--%>
        <%--</div>--%>
        <%--<div class="clear"></div>--%>
        <%--</div>--%>
        <%--<div class="clearfixRight">--%>
        <%--<div class="tb-detail-hd">--%>
        <%--<h1>--%>
        <%--良品铺子 手剥松子218g 坚果炒货 巴西松子--%>
        <%--</h1>--%>
        <%--</div>--%>
        <%--<div class="tb-detail-list">--%>
        <%--<!--价格-->--%>
        <%--<div class="tb-detail-price">--%>
        <%--<li class="price iteminfo_price">--%>
        <%--<dt>促销价</dt>--%>
        <%--<dd><em>¥</em><b class="sys_item_price">56.90</b></dd>--%>
        <%--</li>--%>
        <%--<li class="price iteminfo_mktprice">--%>
        <%--<dt>原价</dt>--%>
        <%--<dd><em>¥</em><b class="sys_item_mktprice">98.00</b></dd>--%>
        <%--</li>--%>
        <%--<div class="clear"></div>--%>
        <%--</div>--%>
        <%--<!--销量-->--%>
        <%--<ul class="tm-ind-panel">--%>
        <%--<li class="tm-ind-item tm-ind-sellCount canClick">--%>
        <%--<div class="tm-indcon"><span class="tm-label">月销量</span><span class="tm-count">1015</span></div>--%>
        <%--</li>--%>
        <%--<li class="tm-ind-item tm-ind-sumCount canClick">--%>
        <%--<div class="tm-indcon"><span class="tm-label">累计销量</span><span class="tm-count">6015</span>--%>
        <%--</div>--%>
        <%--</li>--%>
        <%--<li class="tm-ind-item tm-ind-reviewCount canClick tm-line3">--%>
        <%--<div class="tm-indcon"><span class="tm-label">累计评价</span><span class="tm-count">640</span></div>--%>
        <%--</li>--%>
        <%--</ul>--%>
        <%--<div class="clear"></div>--%>
        <%--<div class="pay">--%>
        <%--<li>--%>
        <%--<div class="clearfix tb-btn tb-btn-buy theme-login">--%>
        <%--<a id="LikBuy" title="点此按钮到下一步确认购买信息" href="javascript:void(0)">立即购买</a>--%>
        <%--</div>--%>
        <%--</li>--%>
        <%--<li>--%>
        <%--<div class="clearfix tb-btn tb-btn-basket theme-login">--%>
        <%--<a id="LikBasket" title="加入购物车" href="javascript:void(0)"><i></i>加入购物车</a>--%>
        <%--</div>--%>
        <%--</li>--%>
        <%--<li>--%>
        <%--<div class="clearfix tb-btn tb-btn-basket theme-login">--%>
        <%--<a id="addCollect" title="添加收藏" href="javascript:void(0)"><i></i>添加收藏</a>--%>
        <%--</div>--%>
        <%--</li>--%
        <%--</div>--%>
        <%--</div>--%>
        <%--<div class="clear"></div>--%>
        <%--</div>--%>
        <%--<div class="theme-signin-right">--%>
        <%--<div class="img-info">--%>
        <%--<img src="../images/songzi.jpg"/>--%>
        <%--</div>--%>
        <%--<div class="text-info">--%>
        <%--<span class="J_Price price-now">¥39.00</span>--%>
        <%--<span id="Stock" class="tb-hidden">库存<span class="stock">1000</span>件</span>--%>
        <%--</div>--%>
        <%--</div>--%>
        <%--</form>--%>
    </div>
</div>

</dd>
</dl>
<div class="clear"></div>

</div>

<div class="clear"></div>

</div>
<!-- introduce-->

<div class="introduce">
    <div class="introduceMain">
        <div class="am-tabs" data-am-tabs>
            <ul class="am-avg-sm-3 am-tabs-nav am-nav am-nav-tabs">
                <li class="am-active">
                    <a href="#">
                        <span class="index-needs-dt-txt">宝贝详情</span></a>
                </li>
                <li>
                    <a href="#">
                        <span class="index-needs-dt-txt">全部评价</span></a>
                </li>
            </ul>

            <div class="am-tabs-bd">

                <div class="am-tab-panel am-fade am-in am-active">
                    <div class="J_Brand">
                        <div class="attr-list-hd tm-clear">
                            <h4>产品参数：</h4></div>
                        <div class="clear"></div>
                        <ul id="J_AttrUL" id="J_AttrUL">
                            <%--<li title="">产品类型:&nbsp;烘炒类</li>--%>
                            <%--<li title="">原料产地:&nbsp;巴基斯坦</li>--%>
                            <%--<li title="">产地:&nbsp;湖北省武汉市</li>--%>
                            <%--<li title="">配料表:&nbsp;进口松子、食用盐</li>--%>
                            <%--<li title="">产品规格:&nbsp;210g</li>--%>
                            <%--<li title="">保质期:&nbsp;180天</li>--%>
                            <%--<li title="">产品标准号:&nbsp;GB/T 22165</li>--%>
                            <%--<li title="">生产许可证编号：&nbsp;QS4201 1801 0226</li>--%>
                            <%--<li title="">储存方法：&nbsp;请放置于常温、阴凉、通风、干燥处保存</li>--%>
                            <%--<li title="">食用方法：&nbsp;开袋去壳即食</li>--%>
                        </ul>
                        <div class="clear"></div>
                    </div>
                    <div class="clear"></div>

                </div>

                <div class="am-tab-panel am-fade">

                    <div class="actor-new">
                        <div class="rate">
                            <strong>100<span>%</span></strong><br> <span>好评度</span>
                        </div>
                    </div>
                    <div class="clear"></div>
                    <div class="tb-r-filter-bar">
                        <ul class=" tb-taglist am-avg-sm-4">
                            <li class="tb-taglist-li tb-taglist-li-current">
                                <div class="comment-info">
                                    <span>全部评价</span>
                                    <span class="tb-tbcr-num">(32)</span>
                                </div>
                            </li>

                            <li class="tb-taglist-li tb-taglist-li-1">
                                <div class="comment-info">
                                    <span>好评</span>
                                    <span class="tb-tbcr-num">(32)</span>
                                </div>
                            </li>

                            <li class="tb-taglist-li tb-taglist-li-0">
                                <div class="comment-info">
                                    <span>中评</span>
                                    <span class="tb-tbcr-num">(32)</span>
                                </div>
                            </li>

                            <li class="tb-taglist-li tb-taglist-li--1">
                                <div class="comment-info">
                                    <span>差评</span>
                                    <span class="tb-tbcr-num">(32)</span>
                                </div>
                            </li>
                        </ul>
                    </div>
                    <div class="clear"></div>
                    <ul class="am-comments-list am-comments-list-flip">
                    </ul>
                    <div class="clear"></div>
                </div>
            </div>
        </div>
        <div class="clear"></div>
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

</div>
</div>
<!--菜单 -->
<div class=tip>
    <div id="sidebar">
        <div id="wrap">
            <div id="shopCart" class="item">
                <a id='mc-menu-hd_4' href="javascript:void(0)" onclick="getUserLoginOutStatus('4')">
                    <span class="message"></span>
                </a>
                <p>
                    购物车
                </p>
                <p class="cart_num">0</p>
            </div>
            <div id="brand" class="item">
                <a  id='mc-menu-hd_5' href="javascript:void(0)" onclick="getUserLoginOutStatus('5')">
                    <span class="wdsc"><img src="../images/wdsc.png"/></span>
                </a>
                <div class="mp_tooltip">
                    我的收藏
                    <i class="icon_arrow_right_black"></i>
                </div>
            </div>


            <div class="quick_toggle">
                <li class="qtitem">
                    <a href="#top" class="return_top"><span class="top"></span></a>
                </li>
            </div>

            <!--回到顶部 -->
            <div id="quick_links_pop" class="quick_links_pop hide"></div>

        </div>

    </div>
</div>
</body>
<script>
    function getUserLoginOutStatus(data) {
        if ('1' == data) {
            COMMONUSERINFOUTIL.getUserLoginOut(function (data) {
                if (data['status'] == "login") {
                    $('#mc-menu-hd_1').attr('href', '../person/index.jsp');
                } else {
                    alert("请登录后操作")
                    return;
                }
            })
            //href="../person/index.jsp"
        } else if ('2' == data) {
            COMMONUSERINFOUTIL.getUserLoginOut(function (data) {
                if (data['status'] == "login") {
                    $('#mc-menu-hd_2').attr('href', '../home/shopcart.jsp');
                } else {
                    alert("请登录后操作")
                    return;
                }
            })
            //href="../home/shopcart.jsp"
        } else if ('3' == data) {
            COMMONUSERINFOUTIL.getUserLoginOut(function (data) {
                if (data['status'] == "login") {
                    $('#mc-menu-hd_3').attr('href', '../person/collection.jsp');
                } else {
                    alert("请登录后操作")
                    return;
                }
            })
            //href="../person/collection.jsp"
        } else if ('4' == data) {
            COMMONUSERINFOUTIL.getUserLoginOut(function (data) {
                if (data['status'] == "login") {
                    $('#mc-menu-hd_4').attr('href', '../home/shopcart.jsp');
                } else {
                    alert("请登录后操作")
                    return;
                }
            })
        } else if ('5' == data) {
            COMMONUSERINFOUTIL.getUserLoginOut(function (data) {
                if (data['status'] == "login") {
                    $('#mc-menu-hd_5').attr('href', '../person/collection.jsp');
                } else {
                    alert("请登录后操作")
                    return;
                }
            })
        } else {
            var map = {};
            var userId = $.cookie("onlinemall_zc_userId");
            if (null == userId) {
                map['params["userid"]'] = "1bb4df95203e48ea823f18fa53c0895e";
            } else {
                map['params["userid"]'] = $.cookie("onlinemall_zc_userId");
            }
            $.ajax({
                type: "POST",
                url: "/onlinemall/loginOut.do",
                data: map,
                dataType: "JSON",
                success: function (result) {
                    if (result.code == '1') {
                        window.location.href = "../home/home3.jsp";
                    }
                },
                error: function () {
                    alert("网络异常，退出登录失败")
                }

            })
        }
    }

    function goToIntroduction() {
        var innerText = $("p").innerText;
        alert(innerText)
    }
</script>
</html>