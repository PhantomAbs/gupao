package com.gupao.singleton.hungry;

/**
 * @author Spencer Zhang
 * @ClassName HungrySingleton
 * @Description 饿汉单例模式(使用前已加载完毕)
 * Advantage: 线程安全（类加载时已初始化），同理 因而也是运行效率高的
 * Weakness: 占用内存空间（不论该类使用与否都提前在内存中开辟空间）
 * @Date 2019/03/12
 */
public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    //单例需私有构造函数
    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
