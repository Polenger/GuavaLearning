package com.loikun.eventbus;

import com.google.common.eventbus.EventBus;

public class EventBusDemo {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus("loikun");

        eventBus.register(new EventListener());
        eventBus.register(new MultiEventListener());
        eventBus.register(new DeadEventListener());
        // 发布了一个事件
        eventBus.post(new OrderEvent("hello"));
        eventBus.post(new OrderEvent("world"));
        // 没有人进行处理的事件。
        eventBus.post("!");
    }
}
