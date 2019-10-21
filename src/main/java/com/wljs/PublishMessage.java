package com.wljs;

import com.wljs.pojo.RedisMessage;
import com.wljs.utill.FastJsonUtils;
import com.wljs.utill.RedisUtils;
import redis.clients.jedis.Jedis;

import java.util.Calendar;

/**
 * @program: send_message_redis
 * @description: 向redis中发送数据
 * @author: lsl
 * @create: 2019-10-15 18:37
 **/
public class PublishMessage {
    private static RedisMessage redisMessage = new RedisMessage();

    public static void main(String[] args) {
        String currentTimestamp = String.valueOf(Calendar.getInstance().getTimeInMillis());
        redisMessage.setEventType("2");
        redisMessage.setEventTime(currentTimestamp);
        String message = FastJsonUtils.getBeanToJson(redisMessage);
        Jedis jedis = RedisUtils.getResource();
        System.out.println("连接成功");
        jedis.publish("isearch:topic:dict:fullindex",message);
    }
}
