package com.gupao.factory.simplefactory;

import com.gupao.factory.Book;
import com.gupao.factory.Comic;

/**
 * @author Spencer Zhang
 * @ClassName BookSimpleFactory
 * @Description 简单工厂类
 * @See Book
 * @Date 2019/03/11
 */
public class BookSimpleFactory {

    public static <T extends Book> Book create(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
