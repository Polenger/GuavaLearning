package com.loikun.eventbus;

/**
 * Guava 发布-订阅模式中传递事件只是一个简单的POJO类
 */
public class OrderEvent { // 事件
    private String message;

    public OrderEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
