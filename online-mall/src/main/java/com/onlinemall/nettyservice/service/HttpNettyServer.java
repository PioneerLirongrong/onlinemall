package com.onlinemall.nettyservice.service;

import com.onlinemall.nettyservice.handler.ChannelOriginalHanndler;
import com.onlinemall.nettyservice.handler.HttpServerHanndler;
import com.onlinemall.utils.properties.EnvironmentUtil;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.apache.log4j.Logger;

/**
 * netty后台启动程序
 *
 * @author lrr
 */
public class HttpNettyServer {
    private static Logger log = Logger.getLogger(HttpServerHanndler.class);
    private static EnvironmentUtil env = null;
    private static String HOST = "";
    private static Integer PORT = 20000;

    static {
        env = new EnvironmentUtil("netty.properties");
        HOST = env.getPropertyValue("NETTY_SERVER");
        PORT = Integer.valueOf(env.getPropertyValue("NETTY_PORT"));
    }

    public static void lunch() {
        System.out.println("服务正在启动！！！");
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        ChannelFuture future = null;
        ServerBootstrap bootstrap = new ServerBootstrap();
        try {
            bootstrap.group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .option(ChannelOption.SO_BACKLOG, 1024)
                    .option(ChannelOption.TCP_NODELAY, true)
                    .option(ChannelOption.SO_REUSEADDR, true)
                    .childHandler(new ChannelOriginalHanndler());
            future = bootstrap.bind(HOST, PORT).sync();
            log.info("netty后台服务启动成功!!!");
            future.channel().closeFuture().sync();
        } catch (Exception e) {
            log.error("{netty后台启动报错}");
        } finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }

    public static void main(String[] args) {
        /**
         * 测试目前在本地启动，本机为测试环境，部署服务器后用脚本启动整个后台
         */
        lunch();
    }
}
