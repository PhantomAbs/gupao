package com.gupao.factory.simplefactory;

import com.gupao.factory.Book;
import com.gupao.factory.Comic;

/**
 * @author Spencer Zhang
 * @ClassName BookSimpleFactoryTest
 * @Description 测试类
 * @Date 2019/03/11
 */
public class BookSimpleFactoryTest {

    public static void main(String[] args) {
        Book book = BookSimpleFactory.create(Comic.class);
        book.getType();
    }
}
