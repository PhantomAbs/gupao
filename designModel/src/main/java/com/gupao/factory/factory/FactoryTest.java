package com.gupao.factory.factory;

import com.gupao.factory.Book;

/**
 * @author Spencer Zhang
 * @ClassName FactoryTest
 * @Description 测试类
 * @Date 2019/03/11
 */
public class FactoryTest {

    public static void main(String[] args) {
        BookFactory comicFactory = new ComicFactory();
        comicFactory.create().getType();

        BookFactory novelFactory = new NovelFactory();
        novelFactory.create().getType();
    }
}
