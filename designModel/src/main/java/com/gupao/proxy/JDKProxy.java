package com.gupao.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Spencer Zhang
 * @ClassName JDKProxy
 * @Description JDK动态代理
 * @Date 2019/03/22
 */
public class JDKProxy implements InvocationHandler {

    private Object tar;

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
        return method.invoke(tar, args);
    }
}
