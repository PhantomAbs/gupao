package com.gupao.singleton.lazy;

/**
 * @author Spencer Zhang
 * @ClassName LazySingleton
 * @Description 惰汉单例模式(需要使用时才加载)
 * Advantage: 内存占用空间小（需要使用时才去开辟内存空间）
 * Weakness: 可能存在线程安全问题（可通过双检查锁，内部类规避），效率相对低
 * 内部类的执行逻辑: 加载LazySingleton类，此时内部类未加载
 *                第一次调用getInstance静态方法时，加载内部类，
 *                实例化LazySingleton
 * @Date 2019/03/16
 */
public class LazySingleton {

    private static LazySingleton INSTANCE = null;

    //单例需私有构造函数
    private LazySingleton() {
        System.out.println("LazySingleton加载ing");
    }

    public static final LazySingleton getInstance() {
        //双检查锁
        if (null == INSTANCE) {
            synchronized (LazySingleton.class) {
                if (null == INSTANCE)
                    INSTANCE = new LazySingleton();
            }
        }
        return INSTANCE;
        /**
         * 内部类方式
         * return InstanceHolder.INSTANCE;
         */
    }

    /**
     * 内部类方式
     */
    private static class InstanceHolder {
        private static final LazySingleton INSTANCE = new LazySingleton();
    }
}
