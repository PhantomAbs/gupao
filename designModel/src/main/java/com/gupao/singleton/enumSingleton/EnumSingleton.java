package com.gupao.singleton.enumSingleton;

/**
 * @author Spencer Zhang
 * @ClassName enumSingleton
 * @Description 注册式单例（采用枚举类）
 *              由于枚举类不能由反射实例化，并且编译后的枚举类是采用饿汉模式保证单例
 * @Date 2019/03/13
 */
public enum EnumSingleton {
    INSTANCE;
    private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
