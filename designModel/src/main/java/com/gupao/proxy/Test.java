package com.gupao.proxy;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Spencer Zhang
 * @ClassName Test
 * @Description 测试
 * @Date 2019/03/22
 *
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

//        byte[] bs = ProxyGenerator.generateProxyClass(
//                "$Proxy0",
//                new Class[]{Base.class});
//        try(OutputStream os = new FileOutputStream("E:\\123\\$Proxy0.class")) {
//            os.write(bs);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
