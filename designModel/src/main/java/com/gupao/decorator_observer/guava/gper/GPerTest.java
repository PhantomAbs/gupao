package com.gupao.decorator_observer.guava.gper;

import com.google.common.eventbus.EventBus;

/**
 * @author Spencer Zhang
 * @ClassName GPerTest
 * @Description todo
 * @Date 2019/04/01
 */
public class GPerTest {

    public static void main(String[] args) {
        EventBus bus = new EventBus();

        Teacher teacher = new Teacher("Tom");
        bus.register(teacher);

        Question q = new Question(
                "小明",
                "问题1",
                GPer.getInstance());
        bus.post(q);
    }

}
