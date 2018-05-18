package com.onlinemall.nettyservice.handler;


import com.onlinemall.utils.invoke.RefMethodTool;
import com.onlinemall.utils.json.MessageJsonUtil;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.*;
import io.netty.util.CharsetUtil;
import org.apache.log4j.Logger;
import sun.misc.MessageUtils;

import java.util.Map;

import static com.onlinemall.constants.Params.CLASSNAME;
import static com.onlinemall.constants.Params.METHODNAME;
import static io.netty.handler.codec.http.HttpHeaders.Names.CONNECTION;
import static io.netty.handler.codec.http.HttpHeaders.Names.CONTENT_LENGTH;
import static io.netty.handler.codec.http.HttpHeaders.Names.CONTENT_TYPE;
import static io.netty.handler.codec.http.HttpHeaders.Values.KEEP_ALIVE;
import static io.netty.handler.codec.http.HttpResponseStatus.OK;
import static io.netty.handler.codec.http.HttpVersion.HTTP_1_1;

/**
 * 解析前台的请求，并将前台的请求转给对应的handler处理
 *
 * @author lr
 */
public class HttpServerHanndler extends ChannelInboundHandlerAdapter {
    private static final Logger Log = Logger.getLogger(HttpServerHanndler.class);
    private HttpRequest request;
    private String uri;
    private static String classinfo;
    private static String methodname;

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (msg instanceof HttpRequest) {
            request = (HttpRequest) msg;
            uri = request.getUri();
            Log.info("{请求的URL" + uri + "}");
            String quenue = uri.substring(1, uri.length());
            Log.info("{quenue的内容" + quenue + "}");
        }
        if (msg instanceof HttpContent) {
            HttpContent content = (HttpContent) msg;
            ByteBuf buf = content.content();
            String message = buf.toString(CharsetUtil.UTF_8);
            System.out.println(message);
            Log.info("message is" + message);
            buf.release();
            classinfo = MessageJsonUtil.analysisHead(message, CLASSNAME);
            methodname = MessageJsonUtil.analysisHead(message, METHODNAME);
            Map<String, Object> body = MessageJsonUtil.analysisBody(message);
            Log.info("{反射的类:"+classinfo+"\t"+"方法名:"+methodname+"\t"+"消息为:"+body.toString()+"}");
            String result = RefMethodTool.methodIvoke(body, classinfo, methodname);
            Log.info("{netty服务成处理的结果为" + result + "}");
            FullHttpResponse response =
                    new DefaultFullHttpResponse(HTTP_1_1, OK,
                            Unpooled.wrappedBuffer(result.getBytes("UTF-8")));
            response.headers().set(CONTENT_TYPE, "application/json");
            response.headers().set(CONTENT_LENGTH, response.content().readableBytes());
            if (HttpHeaders.isKeepAlive(request)) {
                response.headers().set(CONNECTION, KEEP_ALIVE);
            }
            ctx.write(response);
            ctx.flush();
        }
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.flush();
        Log.info("{请求处理成功,给前台返回数据}");
    }
}
