package com.gupao.singleton.containerSingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Spencer Zhang
 * @ClassName ContainerSingleton
 * @Description 注册式单例(容器类)
 * Advantage: 懒汉式（首次调用getBean时才会加载类）优点
 * Weakness: 虽然ConcurrentHashMap是线程安全的，但getBean方法重入时会引起线程安全问题，
 *           因而加上synchronized时，性能会有所下降
 * @Date 2019/03/13
 */
public class ContainerSingleton {

    private static Map<String, Object> container = new ConcurrentHashMap<>();

    private ContainerSingleton() {
    }

    public static Object getBean(String name) {
        synchronized (container) {
            if (!container.containsKey(name)) {
                try {
                    container.put(
                            name,
                            Class.forName(name).newInstance()
                    );
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }
        return container.get(name);
    }
}
