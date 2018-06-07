#在线商城的使用说明
##项目源代码Git地址
```
  https://github.com/PioneerLirongrong/onlinemall.git
```
##环境的搭建
```
　1.准备２个Tomcat(下载地址:http://mirrors.tuna.tsinghua.edu.cn/apache/tomcat/tomcat-7/v7.0.88/bin/apache-tomcat-7.0.88.tar.gz) 
  2.解压下载好的Tomcat,一个用来部署Web服务(tomcat1)，一个用来当做CDN服务器(tomcat2),修改两个tomcat的config目录下的server.xml的配置文件,修改里面的端口,删除掉webapps目录下的所有东西
  3.将onlinemall.war的包改名为ROOT.war放入tomcat1的webapps目录
  4.在tomcat2的目录下新建resource目录,放入项目的图片
  5.分别进入两个tomcat的bin目录,执行脚本startup.sh,启动tomcat服务器
  6.启动netty后台的jar(java -jar onlinemall.jar >> netty.log 2>&1 &)
  7.导入数据,执行onlinemall中的sql文件
```
