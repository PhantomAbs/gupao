package com.gupao.factory;

/**
 * @author Spencer Zhang
 * @ClassName Novel
 * @Description 小说
 * @Date 2019/03/11
 */
public class Novel implements Book {
    public String getType() {
        String type = "novel";
        System.out.println("this is " + type);
        return type;
    }
}
