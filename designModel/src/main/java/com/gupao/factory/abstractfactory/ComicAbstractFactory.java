package com.gupao.factory.abstractfactory;

/**
 * @author Spencer Zhang
 * @ClassName ComicAbstractFactory
 * @Date 2019/03/11
 */
public class ComicAbstractFactory implements BookAbstractFactory {
    public Picture createPicture() {
        return new ComicPicture();
    }
}
