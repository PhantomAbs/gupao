package com.gupao.factory.abstractfactory;

/**
 * @author Spencer Zhang
 * @ClassName AbstractFactoryTest
 * @Description 测试
 * @Date 2019/03/11
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        BookAbstractFactory factory = new ComicAbstractFactory();
        factory.createPicture().info();

        factory = new NovelAbstractFactory();
        factory.createPicture().info();
    }
}
