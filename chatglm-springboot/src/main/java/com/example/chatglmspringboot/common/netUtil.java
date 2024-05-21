package com.example.chatglmspringboot.common;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class netUtil {
    public String getConnnum(String url) {
        String body = "";
        //System.out.println(szString);
        //URL url = new URL("localhost/XNet/getPoint");
        try {
            // 创建httpclient对象.
            CloseableHttpClient client = HttpClients.createDefault();
            // 创建post方式请求对象
            HttpPost httpPost = new HttpPost(url);
            // 设置参数到请求对象中
            //httpPost.setEntity(new StringEntity(szString, "UTF-8"));
            // 设置header信息
            // 指定报文头【Content-type】、【User-Agent】
            httpPost.setHeader("Content-type", "application/json;charset=UTF-8");
            //自定义头部信息
            //httpPost.addHeader("aaa", aaa);
            // 执行请求操作，并拿到结果（同步阻塞）
            System.out.println(httpPost.getURI());
            CloseableHttpResponse response = client.execute(httpPost);
            // 获取结果实体
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                // 按指定编码转换结果实体为String类型
                body = EntityUtils.toString(entity, "UTF-8");
                return body;
            }
            //EntityUtils.consume(entity);
            // 释放链接
            response.close();
            //return body;
        } catch (Exception e1) {
            e1.printStackTrace();
            //return "";
        }
        finally {
            //System.out.println("connected fail");
        }
    return "error";
    }
}
