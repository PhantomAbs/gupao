package com.gupao.decorator_observer.guava.gper;

/**
 * @author Spencer Zhang
 * @ClassName GPer
 * @Description GP社区
 * @Date 2019/04/01
 */
public class GPer {

    private String name = "GP社区";

    private static GPer instance = null;

    private GPer() {
    }

    public static GPer getInstance() {
        if (instance == null) {
            synchronized (GPer.class) {
                if (instance == null)
                    instance = new GPer();
            }
        }
        return instance;
    }

    public String getName() {
        return name;
    }
}
