package com.gupao.decorator_observer.guava.gper;

import com.google.common.eventbus.Subscribe;

/**
 * @author Spencer Zhang
 * @ClassName Teacher
 * @Description 教师类
 * @Date 2019/04/01
 */
public class Teacher {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Subscribe
    public void getQuestionFromStu(Question q) {
        System.out.println(name+"老师收到了一条来自"+q.getGp().getName()+
                "的问题，内容："+q.getDetail()+",提问人："+q.getQuestionerName());
    }
}
