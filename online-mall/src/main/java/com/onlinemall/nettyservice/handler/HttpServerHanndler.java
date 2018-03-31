package com.onlinemall.nettyservice.handler;


import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.*;
import io.netty.util.CharsetUtil;
import org.apache.log4j.Logger;

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
    private static String data;
    private static String flag;
    private static String classinfo;
    private static String methodname;
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (msg instanceof HttpRequest) {
            request = (HttpRequest) msg;
            uri = request.getUri();
            Log.info("{请求的URL"+uri+"}");
            String quenue = uri.substring(1, uri.length());
            Log.info("{quenue的内容"+ quenue+"}");
        }
        if (msg instanceof HttpContent) {
            HttpContent content = (HttpContent) msg;
            ByteBuf buf = content.content();
            String message = buf.toString(CharsetUtil.UTF_8);
            System.out.println(message);
            Log.info("message is" + message);
            buf.release();
//            //解析json串,找对应的反射类
//            System.out.println(JsonUtil.isJson(message));
//            Log.debug("boolean is "+ JsonUtil.isJson(message));
//            Map<String,Object> param = JsonUtil.strToMap(message);
//            Log.debug("param is "+param.toString());
//            // {"date":{"name":"aa","age":"bb"},"flag":"login"}
//            //处理类需要的前台的数据 以json的形式发送
//            data = param.get("data").toString();
//            Log.debug("is true or flase "+ JsonUtil.isJson(param.get("data").toString()));
//            Log.debug("data is "+data);
//            //反射类的映射
//            String flag1 = JsonUtil.pojoToJson(param.get("flag"));
//            Log.debug("flag1 is "+flag1);
//            flag = flag1.substring(1,flag1.length()-1);
//            Log.debug("flag is "+flag);
//            //读取配置文件得到相应的处理类及方法
//            String originalClassinfo = SetSystemProperty.getKeyValue(flag);
//            Log.debug("origin classinfo is "+originalClassinfo);
//            classinfo =originalClassinfo.substring(0,originalClassinfo.indexOf("|"));
//            Log.debug("classinfo is "+classinfo);
//            //反射的方法
//            methodname = originalClassinfo.substring(originalClassinfo.indexOf("|")+1,originalClassinfo.length());
//            Log.debug("methodname is "+methodname);
//            //核心业务的处理
//            String result = RefMethodTool.methodIvoke(data,classinfo,methodname);
            FullHttpResponse response =
                    new DefaultFullHttpResponse(HTTP_1_1, OK,
                            Unpooled.wrappedBuffer("{\"name\":\"yanghai\"}".getBytes("UTF-8")));
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
