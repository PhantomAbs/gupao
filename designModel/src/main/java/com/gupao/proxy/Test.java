package com.gupao.proxy;

/**
 * @author Spencer Zhang
 * @ClassName Test
 * @Description 测试
 * @Date 2019/03/22
 */
public class Test implements Base {
    @Override
    public void dosomething() {
        System.out.println("test proxy...");
    }

    public static void main(String[] args) {
        JDKProxy proxy = new JDKProxy();
        Base t = (Base) proxy.getInstance(new Test());
        t.dosomething();
    }
}
