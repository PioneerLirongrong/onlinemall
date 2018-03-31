package com.onlinemall.utils.httpUtil;


import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;

/**
 * Created by yh on 17-2-7.
 */
public class HttpClients {

    public static String send(String url,String jsonString,String encoding) throws Exception {
        String body = "";
        CloseableHttpClient client = org.apache.http.impl.client.HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);
        httpPost.setEntity(new StringEntity(jsonString,encoding));
        System.out.println("url="+url);
        System.out.println("jsonString="+jsonString);
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
