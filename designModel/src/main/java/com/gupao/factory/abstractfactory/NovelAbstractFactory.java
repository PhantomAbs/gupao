package com.gupao.factory.abstractfactory;

/**
 * @author Spencer Zhang
 * @ClassName NovelAbstractFactory
 * @Date 2019/03/11
 */
public class NovelAbstractFactory implements BookAbstractFactory {
    public Picture createPicture() {
        return new NovelPicture();
    }
}
