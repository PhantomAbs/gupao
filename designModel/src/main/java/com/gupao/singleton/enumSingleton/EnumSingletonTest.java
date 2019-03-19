package com.gupao.singleton.enumSingleton;

import java.io.*;

/**
 * @author Spencer Zhang
 * @ClassName EnumSingletonTest
 * @Description 枚举类注册式单例测试类
 * @Date 2019/03/19
 */
public class EnumSingletonTest {

    public static void main(String[] args) {
        EnumSingleton instance1 = null;
        EnumSingleton instance2 = EnumSingleton.getInstance();
        instance2.setObj(new Object());

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(
                             new FileOutputStream("EnumSingletonTest.obj")
                     );//对象输出流
             ObjectInputStream ois =
                     new ObjectInputStream(
                             new FileInputStream("EnumSingletonTest.obj")
                     )
        ) {
            oos.writeObject(instance2);//写出instance2
            oos.flush();

            instance1 = (EnumSingleton) ois.readObject();//读入instance2文件流

            System.out.println("instance1:" + instance1.getObj());
            System.out.println("instance2:" + instance2.getObj());
            System.out.println(instance1.getObj() == instance2.getObj());//true
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
