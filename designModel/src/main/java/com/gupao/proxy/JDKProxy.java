package com.gupao.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Spencer Zhang
 * @ClassName JDKProxy
 * @Description JDK动态代理,代理的类需继承接口
 * @Date 2019/03/22
 */
public class JDKProxy implements InvocationHandler {

    private Object tar;

    /**
     * 获得代理的类的接口的实例
     * @param tar 代理的类
     * @return 代理的类接口的实例
     */
    public Object getInstance(Object tar) {
        this.tar = tar;
        Class clz = this.tar.getClass();
        return Proxy.newProxyInstance(
                clz.getClassLoader(),
                clz.getInterfaces(),
                this
                );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(tar, args);
        after();
        return obj;
    }

    public void before() {
        System.out.println("before...");
    }

    public void after() {
        System.out.println("after...");
    }
}
