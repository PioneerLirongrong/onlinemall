package com.onlinemall.nettyservice.handler;


import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpRequestDecoder;
import io.netty.handler.codec.http.HttpResponseEncoder;

/**
 * http请求的初始handler
 * @author lr
 */
public class ChannelOriginalHanndler extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        // server端发送的是httpResponse，所以要使用HttpResponseEncoder进行编码
        socketChannel.pipeline().addLast("encoder", new HttpResponseEncoder());
        // server端接收到的是httpRequest，所以要使用HttpRequestDecoder进行解码
        socketChannel.pipeline().addLast("decoder", new HttpRequestDecoder());
        //注册自定义的handler
        socketChannel.pipeline().addLast(new HttpServerHanndler());
    }
}
