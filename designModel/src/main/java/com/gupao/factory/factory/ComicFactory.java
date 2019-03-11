package com.gupao.factory.factory;

import com.gupao.factory.Comic;

/**
 * @author Spencer Zhang
 * @ClassName ComicFactory
 * @Description 漫画工厂类
 * @See Comic
 * @Date 2019/03/11
 */
public class ComicFactory implements BookFactory<Comic> {
    public Comic create() {
        return new Comic();
    }
}
