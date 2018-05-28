# onlinemall的SQL
`
mysql作为后台存储的数据，中间会用redis非关系型数据库做缓存,mysql中所有的都是innodb存储引擎
`
##户模块
###****用户表onlinemall_user****
```
CREATE TABLE `onlinemall_user` (
  `userid` varchar(64) NOT NULL COMMENT '用户id',
  `account` varchar(64) DEFAULT NULL COMMENT '昵称',
  `phonenumber` varchar(64) DEFAULT NULL COMMENT '手机号',
  `mail` varchar(64) DEFAULT NULL COMMENT '邮箱',
  `qqnumber` varchar(64) DEFAULT NULL COMMENT 'QQ号',
  `weixinnumber` varchar(64) DEFAULT NULL COMMENT '微信',
  `weibonumber` varchar(64) DEFAULT NULL COMMENT '微博',
  `password` varchar(64) NOT NULL COMMENT '密码',
  `password1` varchar(64) DEFAULT NULL COMMENT '密码',
  `password2` varchar(64) NOT NULL COMMENT '确认密码',
  `name` varchar(64) DEFAULT NULL COMMENT '用户名',
  `sex` varchar(1) DEFAULT NULL COMMENT '性别(1:男 0:女)',
  `birthday` varchar(64) DEFAULT NULL COMMENT '生日',
  `securitydegree` int(11) DEFAULT NULL COMMENT '账户安全份',
  `securitypay` varchar(1) DEFAULT NULL COMMENT '(1:启动 0:不启动)',
  `securityphone` varchar(1) DEFAULT NULL COMMENT '(1:启动 0:不启动)',
  `securitymail` varchar(1) DEFAULT NULL COMMENT '(1:启动 0:不启动)',
  `paypassword` varchar(64) DEFAULT NULL COMMENT '支付密码',
  `realname` varchar(64) DEFAULT NULL COMMENT '真实姓名',
  `identitynumber` varchar(64) DEFAULT NULL COMMENT '身份证号码',
  `photourl1` varchar(64) DEFAULT NULL COMMENT '身份证照片正面',
  `photourl2` varchar(64) DEFAULT NULL COMMENT '身份证照片背面',
  `securityproblem1` varchar(64) DEFAULT NULL COMMENT '安全问题1',
  `securityansower1` varchar(64) DEFAULT NULL COMMENT '安全问题答案1',
  `securityproblem2` varchar(64) DEFAULT NULL COMMENT '安全问题2',
  `securityansower2` varchar(64) DEFAULT NULL COMMENT '安全问题答案2',
  `registertime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间 默认为now',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
```

###****用户地址表onlinemall_user_address****
```
CREATE TABLE `onlinemall_user_address` (
  `id` varchar(64) NOT NULL COMMENT '记录id',
  `userid` varchar(64) DEFAULT NULL COMMENT '用户id',
  `county` varchar(64) NOT NULL COMMENT '县',
  `city` varchar(64) NOT NULL COMMENT '市',
  `province` varchar(64) NOT NULL COMMENT '省',
  `phoneNumber` varchar(64) NOT NULL COMMENT '用户手机号',
  `userName` varchar(64) NOT NULL COMMENT '收件人',
  `useraddress` varchar(1000) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

```
###****用户的银行卡表onlinemall_user_bank****
```
CREATE TABLE `onlinemall_user_bank` (
  `id` varchar(64) NOT NULL COMMENT '记录id UUID',
  `userid` varchar(64) DEFAULT NULL COMMENT '用户id',
  `bankname` varchar(64) DEFAULT NULL COMMENT '银行名称',
  `banktype` varchar(2) DEFAULT NULL COMMENT '银行卡类型(1:信用卡 2:储蓄卡 3:借计卡)',
  `banknumber` varchar(64) DEFAULT NULL COMMENT '银行卡号',
  `bankbindstatus` varchar(2) DEFAULT NULL COMMENT '绑定状态(1:绑定 0:未绑定)',
  `bankPhoneNumber` varchar(64) NOT NULL COMMENT '预留手机号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

```
###****用户积分表onlinemall_user_point****
```
create table onlinemall_user_point(
  id varchar(64) comment '记录ID',
  userid varchar(64) comment '用户ID',
  pointinfodetail varchar(64) comment '积分详情',
  pointchange varchar(10) comment '积分变动',
  pointtype varchar(2) comment '积分类别(1:支出 0:获得)',
  pointtime datetime comment '积分变动日期',
  primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
```
###***用户优惠券onlinemall_user_discount***
```
create table onlinemall_user_discount(
  id varchar(64) comment '记录ID',
  userid varchar(64) comment '用户ID',
  discountid varchar(64) comment '优惠券编号',
  discountinfodetail varchar(64) comment '优惠券详情',
  discounttype varchar(2) comment '优惠券类别',
  primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

```
###****用户红包onlinemall_user_red_envelopes****
```
create table onlinemall_user_red_envelopes(
  id varchar(64) comment '记录ID',
  userid varchar(64) comment '用户ID',
  redenvelopesinfodetail varchar(1000) comment '红包详情',
  redenvelopestype varchar(2) comment '红包类别',
  redenvelopesmoney int comment '红包剩余金额',
  redenvelopesdelinetime datetime comment '红包有效期',
  redenvelopesstatus varchar(1) comment '红包状态 1:可以用 0:不可以使用',
  primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

```
###***用户账户余额onlinemall_user_balance***
```
create table onlinemall_user_balance(
  id varchar(64) comment '记录ID',
  userid varchar(64) comment '用户ID',
  balanceinfodetail varchar(10000) comment '余额详情',
  balancenumber varchar(64) comment '剩余金额',
  balancetime datetime default now() comment '创建时间',
  primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

```
###***用户收藏onlinemall_user_collect***
```
CREATE TABLE `onlinemall_user_collect` (
  `id` varchar(64) NOT NULL COMMENT '记录ID',
  `userid` varchar(64) DEFAULT NULL COMMENT '用户ID',
  `goodsid` varchar(64) DEFAULT NULL COMMENT '商品ID',
  `queryUrl` varchar(20) DEFAULT NULL COMMENT '查询的接口URL',
  `collectime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '收藏时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

```
###***用户的足迹onlinemall_user_record***
```
CREATE TABLE `onlinemall_user_record` (
  `id` varchar(64) NOT NULL COMMENT '记录ID',
  `userid` varchar(64) DEFAULT NULL COMMENT '用户ID',
  `goodsid` varchar(64) DEFAULT NULL COMMENT '商品ID',
  `queryUrl` varchar(20) DEFAULT NULL COMMENT '接口的URL',
  `recordtime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '记录时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

```

##在线客服模块
###***咨询及意见表onlinemall_acquire_advice***
```
create table onlinemall_acquire_advice(
  id varchar(64) comment '记录ID',
  userid varchar(64) comment '用户ID',
  acquireadviceflag varchar(2) comment '类别 (1:咨询 2:意见)',
  acquireadvicetype varchar(2) comment '(1:产品问题 2:促销问题 3:支付问题 4:退款问题 5:配送问题 6:售后问题 7:发票问题 8:退换货 9:其他)',
  acquireadvicedetail varchar(10000) comment '详情',
  acquireadvicetime datetime default now() comment '时间',
  primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

```
##店铺表模块
###***店铺表onlinemall_shop***
create table onlinemall_shop(
  id varchar(64) comment '记录ID',
  shopid varchar(64) comment '店铺id',
  shopname varchar(64) comment '店铺名称',
  shopinfodetail varchar(1000) comment '店铺详情',
  shopservicedegree varchar(5) comment '服务评分',
  shoplogisticsdegree varchar(5) comment '物流评分',
  primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

##订单模块
###***订单交表onlinemall_order***
```
create table onlinemall_order(
  id varchar(64) comment '记录ID',
  orderid varchar(64) comment '订单id',
  userid varchar(64) comment '用户ID',
  goodsid varchar(64) comment '商品ID',
  shopid varchar(64) comment '店铺id',
  goodsurl varchar(64) comment '商品图片',
  ordertype varchar(2) comment '订单类型　(0:所有(待发货和已发货的排在前面) 1:待付款 2:代发货 3:待收货 4:待评价 5:退款)',
  goodsname varchar(64) comment '商品名称',
  goodsprice varchar(64) comment '商品单价',
  goodscount int comment '购买数量',
  ordertotalamount varchar(64) comment '订单的总金额',
  orderwuliutotalamount varchar(64) comment '商品的运费',
  goodsoperate varchar(1) comment '(商品操作 0:交易失败 1:交易成功)',
  ordertime datetime comment '交易时间',
  orderaddress varchar(1000) comment '订单的收货地址',
  orderstatus varchar(1) comment '订单的状态 (0:所有(待发货和已发货的排在前面) 1:待付款 2:代发货 3:待收货 4:待评价 5:退款)',
  goodsreturntime datetime comment '退款时间',
  goodsreturnnumber varchar(64) comment '退款编号',
  goodsreturnstatus varchar(2) comment '退款状态 (1:买家退款 2:银行受理 3:退款成功)',
  ordercreatetime datetime default now() comment '订单创建时间',
  orderpaytime datetime comment '订单付款时间',
  orderchengjiaotime datetime comment '订单成交时间',
  primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

```

##物流模块
###***订单物流表onelinemall_logistics***
```
create table onelinemall_logistics(
  id varchar(64) comment '记录ID',
  logisticsid varchar(64) comment '快递单号id',
  orderid varchar(64) comment '订单id',
  goodsid varchar(64) comment '商品ID',
  goodsurl varchar(64) comment '商品图片',
  logisticstatus varchar(1) comment '(0:在运输中 1:已经签收)',
  logisticscompany varchar(64) comment '承运公司',
  logisticsphone varchar(64) comment '官方电话' ,
  logisticsinfodetail varchar(10000) comment '物流详情',
  primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

```

##商品模块
###***服装类***
```
create table onlinemall_goods_clothes(
  id varchar(64) comment '记录ID',
  goodsid  varchar(64) comment '商品id',
  shop varchar(64) comment '店铺id',
  goodsname varchar(64) comment '商品的名字',
  discountid varchar(64) comment '优惠券id',
  originalprice int comment '商品的原价',
  discouuntprice int comment '商品的促销价',
  salesmonth int comment '商品月销量',
  salescount int comment '商品累计销量',
  evaluatecount int comment '商品的累计评价',
  evaluateprecent varchar(64) comment '商品好评度',
  clothestype varchar(2) comment '衣服类别 0:羽绒服 1:毛呢外套 2:棉服 3:毛衣 4:针织衫 5:连衣裙 6:风衣 7:卫衣 8:T恤 9:衬衫 10:打底衫 11:皮衣 12:皮草 13:夹克 14:西装 15:棒球服 16:牛仔外套 17:Polo衫 18:小西装 19:马夹 20:半身裙 21:连衣裙 22:包臀裙 23:A字裙 24:百褶裙 25:休闲裤 26:阔腿裤 27:牛仔裤 28:运动裤 29:小脚裤 30:连体裤 31:背带裤 32:打底裤 33:文胸 34:内裤 35:抹胸 36:背心 37:睡裙 38:睡衣 39:睡裤 40:睡袍 41:安全裤 42:袜子 43:保暖内衣 44:秋衣 45:秋裤 46:丝袜 47:塑身内衣 48:吊带裙',
  clothessex varchar(2) comment '适合的性别 0:男 1:女',
  clothesperson varchar(2) comment '适合的人群 0:婴儿 1:青少年 2:青年 3:中年 4:老年人',
  clothescolor varchar(64) comment '颜色',
  clothessize varchar(10) comment '尺码 M,L,XL,2XL,3XL,4XL',
  clothesbrand varchar(64) comment '品牌',
  clothescount varchar(64) comment '库存',
  clothesmianliao varchar(64) comment '面料',
  clothercode varchar(64) comment '衣服货号 随机',
  clothesertime datetime comment '衣服上市时间',
  producttime datetime comment '生产日期',
  productcompany varchar(64) comment '所属公司',
  productid varchar(64) comment '产品标号',
  productplace varchar(64) comment '原料产地',
  productallow varchar(64) comment '产品许可证',
  place varchar(128) comment '产地',
  url varchar(128) comment '商品图片url',
  primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
```
###***酒品类***
```
create table onlinemall_goods_drinking(
  id varchar(64) comment '记录ID',
  goodsid  varchar(64) comment '商品id',
  shop varchar(64) comment '店铺id',
  goodsname varchar(64) comment '商品的名字',
  discountid varchar(64) comment '优惠券id',
  originalprice int comment '商品的原价',
  discouuntprice int comment '商品的促销价',
  salesmonth int comment '商品月销量',
  salescount int comment '商品累计销量',
  evaluatecount int comment '商品的累计评价',
  evaluateprecent varchar(64) comment '商品好评度',
  drinkingtype varchar(2) comment '酒类型　0:白酒 1:啤酒 2:葡萄酒 3:洋酒 4:调制酒 5:暖身黄酒',
  drinkbrand varchar(64) comment '酒的品牌',
  drinkingtsize varchar(64) comment '产品规格',
  alcoholdegree int comment '酒精的含量',
  saveway varchar(128) comment '存储方法',
  delinetime int comment '保质期',
  drinkingcount int comment '库存',
  peiliao varchar(1000) comment '酒配料',
  productid varchar(64) comment '产品标号',
  useway varchar(64) comment '使用方法',
  producttime datetime comment '生产日期',
  productcompany varchar(64) comment '所属公司',
  productallow varchar(64) comment '产品许可证',
  productplace varchar(64) comment '原料产地',
  place varchar(128) comment '产地',
  url varchar(128) comment '商品图片url',
  primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

```

###***鞋子类***
```
create table onlinemall_goods_shoes(
  id varchar(64) comment '记录ID',
  goodsid  varchar(64) comment '商品id',
  shop varchar(64) comment '店铺id',
  goodsname varchar(64) comment '商品的名字',
  discountid varchar(64) comment '优惠券id',
  originalprice int comment '商品的原价',
  discouuntprice int comment '商品的促销价',
  salesmonth int comment '商品月销量',
  salescount int comment '商品累计销量',
  evaluatecount int comment '商品的累计评价',
  evaluateprecent varchar(64) comment '商品好评度',
  shoestype varchar(2) comment '0:短靴 1:棉鞋 2:雪地靴 3:过膝靴 4:切尔西靴 5:时装靴 6:单鞋 7:深口单鞋加绒单鞋 8:高跟鞋 9:内增高 10:平底鞋 11:尖头鞋 12:厚底鞋 13:休闲鞋 14:小白鞋 15:乐福鞋 16:帆布鞋 17:运动鞋 18:粗跟鞋 19:浅口单鞋 20:马丁靴 21:工装靴 22:商务鞋 23:布洛克鞋 23:英伦鞋 24:休闲皮鞋 25:板鞋',
  shoessex varchar(2) comment '适合的性别 (0:男 1:女)',
  shoesperson varchar(2) comment '适合的人群 0:婴儿 1:青少年 2:青年 3:中年 4:老年人',
  shoescolor varchar(64) comment '颜色',
  shoessize varchar(10) comment '尺码',
  shoesbrand varchar(64) comment '品牌',
  shoescount varchar(64) comment '鞋子库存',
  shoescode varchar(64) comment '鞋子货号 随机',
  shoestime datetime comment '鞋子上市时间',
  producttime datetime comment '生产日期',
  productcompany varchar(64) comment '所属公司',
  productid varchar(64) comment '产品标号',
  productplace varchar(64) comment '原料产地',
  productallow varchar(64) comment '产品许可证',
  place varchar(128) comment '产地',
  url varchar(128) comment '商品图片url',
  primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
```

###***日常用品类***
```
create table onlinemall_goods_daily_necessities(
  id varchar(64) comment '记录ID',
  goodsid  varchar(64) comment '商品id',
  shop varchar(64) comment '店铺id',
  goodsname varchar(64) comment '商品的名字',
  discountid varchar(64) comment '优惠券id',
  originalprice int comment '商品的原价',
  discouuntprice int comment '商品的促销价',
  salesmonth int comment '商品月销量',
  salescount int comment '商品累计销量',
  evaluatecount int comment '商品的累计评价',
  evaluateprecent varchar(64) comment '商品好评度',
  dailynecessitiestype varchar(2) comment '0洗发水 1护发素 2沐浴露 3洗衣液 4洗衣粉 5香皂 6肥皂 7金纺 8牙膏 9牙刷 10毛巾 11刷子 12抽纸 13卷纸 14盆 15:84消毒液 16花露水 17杯子 18碗 19排插 20台灯 21镜子 22梳子 23暖水瓶 24衣架 25垃圾桶 26风扇 27蚊帐 28洗洁精 29鞋架 30手电筒',
  dailynecessitiesbrand varchar(64) comment '日用品品牌',
  dailynecessitiescode varchar(64) comment '日常用品类货号 随机',
  producttime datetime comment '生产日期',
  productcompany varchar(64) comment '所属公司',
  productid varchar(64) comment '产品标号',
  productplace varchar(64) comment '原料产地',
  productallow varchar(64) comment '产品许可证',
  place varchar(128) comment '产地',
  url varchar(128) comment '商品图片url',
  primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

```

###***熟食类***
```
create table onlinemall_goods_cooked_food(
  id varchar(64) comment '记录ID',
  goodsid  varchar(64) comment '商品id',
  shop varchar(64) comment '店铺id',
  goodsname varchar(64) comment '商品的名字',
  discountid varchar(64) comment '优惠券id',
  originalprice int comment '商品的原价',
  discouuntprice int comment '商品的促销价',
  salesmonth int comment '商品月销量',
  salescount int comment '商品累计销量',
  evaluatecount int comment '商品的累计评价',
  evaluateprecent varchar(64) comment '商品好评度',
  cookedfoodtype varchar(2) comment '0咸鸭蛋 1皮蛋 2烤鸭酱鸭 3卤肉 4凉菜 5熟鸡 6馒头',
  cookedfoodbrand varchar(64) comment '熟食的品牌',
  saveway varchar(128) comment '存储方法',
  delinetime int comment '保质期',
  cookedfoodcount int comment '库存',
  peiliao varchar(1000) comment '熟食配料',
  productid varchar(64) comment '产品标号',
  useway varchar(64) comment '使用方法',
  producttime datetime comment '生产日期',
  productcompany varchar(64) comment '所属公司',
  productallow varchar(64) comment '产品许可证',
  productplace varchar(64) comment '原料产地',
  place varchar(128) comment '产地',
  url varchar(128) comment '商品图片url',
  primary key (id)
)ENGINE=InnoDB DEFAULT charset=utf8;

```

###***箱包类***
```
create table onlinemall_goods_bag(
  id varchar(64) comment '记录ID',
  goodsid  varchar(64) comment '商品id',
  shop varchar(64) comment '店铺id',
  goodsname varchar(64) comment '商品的名字',
  discountid varchar(64) comment '优惠券id',
  originalprice int comment '商品的原价',
  discouuntprice int comment '商品的促销价',
  salesmonth int comment '商品月销量',
  salescount int comment '商品累计销量',
  evaluatecount int comment '商品的累计评价',
  evaluateprecent varchar(64) comment '商品好评度',
  bagtype varchar(2) comment '0单肩包 1斜挎包 2手提包 3双肩包 4手拿包 5钱包 6卡包 7钥匙包 8零钱包 9真皮包 10实用大包 11商务公文包 12电脑包 13拉杆箱旅行包运动包 14胸包/腰包',
  bagsex varchar(2) comment '适合的性别 0:男 1:女',
  bagperson varchar(2) comment '适合的人群 0:婴儿 1:青少年 2:青年 3:中年 4:老年人',
  bagcolor varchar(64) comment '颜色',
  bagsize varchar(10) comment '尺码 24,26,27,32',
  bagrand varchar(64) comment '品牌',
  bagcount varchar(64) comment '库存',
  bagmianliao varchar(64) comment '面料',
  bagcode varchar(64) comment '包货号 随机',
  bagtime datetime comment '包上市时间',
  producttime datetime comment '生产日期',
  productcompany varchar(64) comment '所属公司',
  productid varchar(64) comment '产品标号',
  productplace varchar(64) comment '原料产地',
  productallow varchar(64) comment '产品许可证',
  place varchar(128) comment '产地',
  url varchar(128) comment '商品图片url',
  primary key (id)
)ENGINE=InnoDB DEFAULT charset=utf8;
```
###***生鲜类***
```
create table onlinemall_goods_freshs(
  id varchar(64) comment '记录ID',
  goodsid  varchar(64) comment '商品id',
  shop varchar(64) comment '店铺id',
  goodsname varchar(64) comment '商品的名字',
  discountid varchar(64) comment '优惠券id',
  originalprice int comment '商品的原价',
  discouuntprice int comment '商品的促销价',
  salesmonth int comment '商品月销量',
  salescount int comment '商品累计销量',
  evaluatecount int comment '商品的累计评价',
  evaluateprecent varchar(64) comment '商品好评度',
  freshstype varchar(2) comment '0芒果 1车厘子 2苹果 3橙子 4猕猴桃 5柠檬 6大闸蟹 7帝王蟹 8海参 9金枪鱼 10鲍鱼 11红虾 12牛排 13猪肉 14土鸡 15羊肉 16山药 17番薯 18土豆 19莲藕 20鸡蛋 21鸽子蛋 22鸭蛋 23咸鸭蛋 24皮蛋 25喜蛋 26烤鸭酱鸭 27卤肉 28凉菜 29熟鸡 30鱼类龙利鱼 31秋刀鱼 32三文鱼 33鳕鱼 34斑鱼 35比目鱼 36带鱼 37金枪鱼',
  freshsbrand varchar(64) comment '生鲜的品牌',
  saveway varchar(128) comment '存储方法',
  delinetime int comment '保质期',
  freshscount int comment '库存',
  peiliao varchar(1000) comment '生鲜配料',
  productid varchar(64) comment '产品标号',
  useway varchar(64) comment '使用方法',
  producttime datetime comment '生产日期',
  productcompany varchar(64) comment '所属公司',
  productallow varchar(64) comment '产品许可证',
  productplace varchar(64) comment '原料产地',
  place varchar(128) comment '产地',
  url varchar(128) comment '商品图片url',
  primary key (id)
)ENGINE=InnoDB DEFAULT charset=utf8;
```

###***文具类***
```
create table onlinemall_goods_stationery(
  id varchar(64) comment '记录ID',
  goodsid  varchar(64) comment '商品id',
  shop varchar(64) comment '店铺id',
  goodsname varchar(64) comment '商品的名字',
  discountid varchar(64) comment '优惠券id',
  originalprice int comment '商品的原价',
  discouuntprice int comment '商品的促销价',
  salesmonth int comment '商品月销量',
  salescount int comment '商品累计销量',
  evaluatecount int comment '商品的累计评价',
  evaluateprecent varchar(64) comment '商品好评度',
  stationerytype varchar(2) comment '1橡皮擦 2中性笔 3圆珠笔 4铅笔 5记号笔 6可擦笔 7橡皮 8小刀 9卷笔刀 10文具盒 11订书机 12胶水 13铅笔芯 14彩笔 15蜡笔 16毛笔 17墨水 18钢笔 19墨汁 20中性笔芯 21作业纸 22信纸 23稿纸 24A4纸 25活页笔记本 26密码本 27便利贴 28改正带',
  stationeryperson varchar(2) comment '适合的人群 0:婴儿 1:青少年 2:青年 3:中年 4:老年人',
  stationerybrand varchar(64) comment '品牌',
  stationerycount varchar(64) comment '库存',
  stationerycode varchar(64) comment '文具货号 随机',
  stationerytime datetime comment '文具上市时间',
  producttime datetime comment '生产日期',
  productcompany varchar(64) comment '所属公司',
  productid varchar(64) comment '产品标号',
  productplace varchar(64) comment '原料产地',
  productallow varchar(64) comment '产品许可证',
  place varchar(128) comment '产地',
  url varchar(128) comment '商品图片url',
  primary key (id)
)ENGINE=InnoDB DEFAULT charset=utf8;
```

###***厨房类***
```
create table onlinemall_goods_kitchen(
  id varchar(64) comment '记录ID',
  goodsid  varchar(64) comment '商品id',
  shop varchar(64) comment '店铺id',
  goodsname varchar(64) comment '商品的名字',
  discountid varchar(64) comment '优惠券id',
  originalprice int comment '商品的原价',
  discouuntprice int comment '商品的促销价',
  salesmonth int comment '商品月销量',
  salescount int comment '商品累计销量',
  evaluatecount int comment '商品的累计评价',
  evaluateprecent varchar(64) comment '商品好评度',
  kitchentype varchar(2) comment '１保温杯 ２保温壶 ３焖烧罐 ４储物罐 ５烧烤炉 ６刀具套组 ７砂锅 ８炒锅 ９汤锅煲 10烘焙 11调味瓶罐 12厨房 13小工具 14厨房置物架 15压力锅 16餐具套装 17碗 18餐盘 19茶壶 20茶杯 21茶具套装 22玻璃杯 23饭盒 24紫砂壶 25手套抹布 26围裙 27洗碗巾 28垃圾袋 29厨房用刷',
  kitchenperson varchar(2) comment '适合的人群 0:婴儿 1:青少年 2:青年 3:中年 4:老年人',
  kitchenbrand varchar(64) comment '品牌',
  kitchencount varchar(64) comment '库存',
  kitchencode varchar(64) comment '厨房货号 随机',
  kitchentime datetime comment '厨房上市时间',
  producttime datetime comment '生产日期',
  productcompany varchar(64) comment '所属公司',
  productid varchar(64) comment '产品标号',
  productplace varchar(64) comment '原料产地',
  productallow varchar(64) comment '产品许可证',
  place varchar(128) comment '产地',
  url varchar(128) comment '商品图片url',
  primary key (id)
)ENGINE=InnoDB DEFAULT charset=utf8;
```

###商品评论表online_mall_evaluate
```
create table online_mall_evaluate(
  id varchar(64) comment '记录ID',
  goodsid varchar(64) comment '商品id',
  userid  varchar(64) comment '买家id',
  account varchar(64) comment '评价人用户名(昵称)',
  type int comment '评价类别 1:匿名 2:实名',
  degree int comment '评价等级 1:好评 2:中评 3:差评)',
  time datetime comment '时间',
  content varchar(10000) comment '评价内容',
  primary key (id)
)ENGINE=InnoDB DEFAULT charset=utf8;
```
###优惠券onlinemall_goods_discount
```
create table onlinemall_goods_discount(
  id varchar(64) comment '记录ID',
  discountid varchar(64) comment '优惠券id',
  goodsid varchar(64) comment '商品id',
  discountContext varchar(128) comment '优惠券的内容',
  deadtime datetime comment '有效期',
  primary key (id)
)ENGINE=InnoDB DEFAULT charset=utf8;

```

###购物车表onlinemall_shopcar
```
CREATE TABLE `onlinemall_shopcar` (
  `id` varchar(64) NOT NULL COMMENT '记录ID',
  `userid` varchar(64) NOT NULL COMMENT '用户id',
  `goodsid` varchar(64) DEFAULT NULL COMMENT '商品id',
  `goodsname` varchar(64) DEFAULT NULL COMMENT '商品的名字',
  `originalprice` int(11) DEFAULT NULL COMMENT '商品的原价',
  `discouuntprice` int(11) DEFAULT NULL COMMENT '商品的促销价',
  `goodtype` varchar(2) DEFAULT NULL COMMENT '商品的类别',
  `goodCount` varchar(20) DEFAULT NULL COMMENT '商品数量',
  `good` varchar(64) DEFAULT NULL COMMENT '品牌',
  `url` varchar(128) DEFAULT NULL COMMENT '商品图片url',
  `queryUrl` varchar(20) DEFAULT NULL COMMENT '接口的URL',
  `registertime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间 默认为now',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
```