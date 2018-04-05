# onlinemall的SQL
`
mysql作为后台存储的数据，中间会用redis非关系型数据库做缓存,mysql中所有的都是innodb存储引擎
`
##户模块
###****用户表onlinemall_user****
```
create table onlinemall_user(
  userid varchar(64) comment '用户id',
  account varchar(64) comment '昵称',
  phonenumber varchar(64) comment '手机号',
  mail varchar(64) comment '邮箱',
  qqnumber varchar(64) comment 'QQ号',
  weixinnumber varchar(64) comment '微信',
  weibonumber varchar(64) comment '微博',
  password varchar(64) comment '密码',
  name varchar(64) comment '用户名',
  sex varchar(64) comment '账户安全份',
  birthday varchar(64) comment '生日',
  securitydegree int comment '账户安全份',
  securitypay varchar(1) comment '(1:启动 0:不启动)',
  securityphone varchar(1) comment '(1:启动 0:不启动)',
  securitymail varchar(1) comment '(1:启动 0:不启动)',
  realname varchar(64) comment '真实姓名',
  identitynumber varchar(64) comment '身份证号码',
  photourl1 varchar(64) comment '身份证照片正面',
  photourl2 varchar(64) comment '身份证照片背面',
  securityproblem1 varchar(64) comment '安全问题1',
  securityansower1 varchar(64) comment '安全问题答案1',
  securityproblem2 varchar(64) comment '安全问题2',
  securityansower2 varchar(64) comment '安全问题答案2',
  registertime datetime default now() comment '注册时间 默认为now',
  primary key (userid)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

```

###****用户地址表onlinemall_address****
```
create table onlinemall_address(
  id varchar(64) comment '记录id',
  userid varchar(64) comment '用户id',
  useraddress varchar(1000) comment '地址',
  primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

```
###****用户的银行卡表onlinemall_bank****
```
create table onlinemall_bank(
  id varchar(64) comment '记录id UUID',
  userid varchar(64) comment '用户id',
  bankname varchar(64) comment '银行名称',
  banktype varchar(2) comment '银行卡类型(1:信用卡 2:储蓄卡 3:借计卡)',
  banknumber varchar(64) comment '银行卡号',
  bankbindstatus varchar(2) comment '绑定状态(1:绑定 0:未绑定)',
  primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
#****用户优惠券onlinemall_user_discount***
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
###***用户收藏onlinemall_user_collect****
```
create table onlinemall_user_collect(
  id varchar(64) comment '记录ID',
  userid varchar(64) comment '用户ID',
  goodsid varchar(64) comment '商品ID',
  collectime datetime default now() comment '收藏时间',
  primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

```
###***用户的足迹onlinemall_user_record***
```
create table onlinemall_user_record(
  id varchar(64) comment '记录ID',
  userid varchar(64) comment '用户ID',
  goodsid varchar(64) comment '商品ID',
  recordtime datetime default now() comment '记录时间',
  primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
###***店铺表onlinemall_shop*****
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
###***订单交表onlinemall_order****
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
  orderstatus varchar(1) comment '订单的状态 (0:拍下商品 1:卖家发货 2:确认收货 3:交易完成 4:退款中 5:退款成功)',
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
