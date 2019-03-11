package com.gupao.factory.factory;

import com.gupao.factory.Novel;

/**
 * @author Spencer Zhang
 * @ClassName NovelFactory
 * @Description 小说工厂
 * @See Novel
 * @Date 2019/03/11
 */
public class NovelFactory implements BookFactory<Novel> {
    public Novel create() {
        return new Novel();
    }
}
