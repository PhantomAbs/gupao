package com.gupao.decorator_observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @author Spencer Zhang
 * @ClassName GuavaEvent
 * @Description todo
 * @Date 2019/03/29
 */
public class GuavaEvent {

    @Subscribe
    public void subscribe(String msg) {
        System.out.println("订阅："+msg);
    }
}
