package com.gupao.factory;

/**
 * @author Spencer Zhang
 * @ClassName Comic
 * @Description 漫画
 * @Date 2019/03/11
 */
public class Comic implements Book {
    public String getType() {
        String type = "comic";
        System.out.println("this is " + type + " book");
        return type;
    }
}
