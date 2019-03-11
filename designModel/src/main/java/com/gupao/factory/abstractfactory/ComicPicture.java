package com.gupao.factory.abstractfactory;

/**
 * @author Spencer Zhang
 * @ClassName ComicPicture
 * @Description 漫画图
 * @Date 2019/03/11
 */
public class ComicPicture implements Picture {
    public void info() {
        System.out.println("漫画是四格图");
    }
}
