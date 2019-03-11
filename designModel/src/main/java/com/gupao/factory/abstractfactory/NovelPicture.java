package com.gupao.factory.abstractfactory;

/**
 * @author Spencer Zhang
 * @ClassName NovelPicture
 * @Description 小说图
 * @Date 2019/03/11
 */
public class NovelPicture implements Picture {
    public void info() {
        System.out.println("小说是单图");
    }
}
