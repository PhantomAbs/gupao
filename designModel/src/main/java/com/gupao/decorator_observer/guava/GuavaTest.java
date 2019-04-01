package com.gupao.decorator_observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * @author Spencer Zhang
 * @ClassName GuavaTest
 * @Description GuavaAPI test
 * @Date 2019/03/29
 */
public class GuavaTest {

    public static void main(String[] args) {
        EventBus bus = new EventBus();//事件总线
        GuavaEvent event = new GuavaEvent();
        bus.register(event);//注册要监听的事件
        bus.post("2333");
    }
}
