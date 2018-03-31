package com.onlinemall.nettyservice.service;

import com.onlinemall.nettyservice.handler.ChannelOriginalHanndler;
import com.onlinemall.nettyservice.handler.HttpServerHanndler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.apache.log4j.Logger;

/**
 * netty后台启动程序
 * @author lr
 */
public class HttpNettyServer {
    private static Logger log = Logger.getLogger(HttpServerHanndler.class);
    public void lunch(int port){
        System.out.println("服务正在启动！！！");
        EventLoopGroup bossGroup  = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        ChannelFuture future = null;
        ServerBootstrap bootstrap = new ServerBootstrap();
        try{
            bootstrap.group(bossGroup,workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .option(ChannelOption.SO_BACKLOG,1024)
                    .option(ChannelOption.TCP_NODELAY,true)
                    .option(ChannelOption.SO_REUSEADDR,true)
                    .childHandler(new ChannelOriginalHanndler());
            future = bootstrap.bind(port).sync();
            future.channel().closeFuture().sync();
        }catch (Exception e){
            log.error("{netty后台启动报错}");
        }finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }
    public static void main(String[] args) {
        /**
         * 测试目前在本地启动，本机为测试环境，部署服务器后用脚本启动整个后台
         */
        HttpNettyServer httpNettyServer = new HttpNettyServer();
        httpNettyServer.lunch(20000);
    }
}
