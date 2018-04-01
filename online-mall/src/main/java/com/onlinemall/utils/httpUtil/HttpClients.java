package com.onlinemall.utils.httpUtil;


import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

/**
 * http客户端，请求netty后台
 * @author lrr
 */
public class HttpClients {
    public static Logger logger = Logger.getLogger(HttpClients.class);
    public static String send(String url,String jsonString,String encoding) throws Exception {
        String body = "";
        CloseableHttpClient client = org.apache.http.impl.client.HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);
        httpPost.setEntity(new StringEntity(jsonString,encoding));
        logger.info("{前台的URL:"+url+" "+"传给后台的消息:"+jsonString+"}");
        httpPost.setHeader("Content-type","application/json");
        CloseableHttpResponse response = client.execute(httpPost);
        HttpEntity entity = response.getEntity();
        if(entity != null){
            body = EntityUtils.toString(entity,encoding);
        }
        EntityUtils.consume(entity);
        response.close();
        return body;
    }
}
