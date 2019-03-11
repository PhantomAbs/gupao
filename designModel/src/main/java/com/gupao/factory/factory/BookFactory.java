package com.gupao.factory.factory;

import com.gupao.factory.Book;

/**
 * @author Spencer Zhang
 * @ClassName BookAbstractFactory
 * @Description 书工厂类
 * @Date 2019/03/11
 */
public interface BookFactory<T extends Book> {

    T create();
}
