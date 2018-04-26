<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head lang="en">
    <meta charset="UTF-8">
    <title>更新密码</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>

    <link rel="stylesheet" href="../AmazeUI-2.4.2/assets/css/amazeui.min.css"/>
    <link href="../css/dlstyle.css" rel="stylesheet" type="text/css">
    <script src="../AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
    <script src="../AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>
    <script src="../onlinemalljs/user/forgetpassword.js"></script>

</head>

<body>

<div class="login-boxtitle">
    <a href="../home/demo.html"><img alt="" src="../images/logobig.png"/></a>
</div>

<div class="res-banner">
    <div class="res-main">
        <div class="login-banner-bg"><span></span><img src="../images/big.jpg"/></div>
        <div class="login-box">

            <div class="am-tabs" id="doc-my-tabs">
                <div class="am-tabs-bd">
                    <div class="am-tab-panel am-active">
                        <form method="post">

                            <div class="user-email">
                                <label for="email"><i class="am-icon-envelope-o"></i></label>
                                <input type="email" name="" id="email" placeholder="请输入邮箱账号/手机号">
                            </div>
                            <div class="user-pass">
                                <label for="passwordMail"><i class="am-icon-lock"></i></label>
                                <input type="password" name="" id="passwordMail" placeholder="设置新密码">
                            </div>
                            <div class="user-pass">
                                <label for="passwordRepeatMail"><i class="am-icon-lock"></i></label>
                                <input type="password" name="" id="passwordRepeatMail" placeholder="确认新密码">
                            </div>

                        </form>
                        <div class="am-cf">
                            <input type="submit" id="regisTerSubmitMail" name="" value="确认"
                                   class="am-btn am-btn-primary am-btn-sm am-fl">
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </div>

    <div class="footer ">
        <div class="footer-hd ">
            <p>
                <a href="http://www.tute.edu.cn/">天职师大</a>
                <b>|</b>
                <a href="home3.jsp">商城首页</a>
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
</body>

</html>