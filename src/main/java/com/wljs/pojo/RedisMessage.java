package com.wljs.pojo;

/**
 * @program: send_message_redis
 * @description: 发送给redis数据类
 * @author: lsl
 * @create: 2019-10-15 17:18
 **/
public class RedisMessage {
    private String eventType;
    private String eventTime;

    public RedisMessage(String eventType, String eventTime) {
        this.eventType = eventType;
        this.eventTime = eventTime;
    }

    public RedisMessage() {
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    @Override
    public String toString() {
        return "RedisMessage{" +
                "eventType='" + eventType + '\'' +
                ", eventTime='" + eventTime + '\'' +
                '}';
    }
}
