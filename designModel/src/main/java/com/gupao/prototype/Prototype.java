package com.gupao.prototype;

/**
 * @author Spencer Zhang
 * @ClassName Prototype
 * @Description 原型模式:
 *              浅克隆: 复制对象时直接复制对象字段中引用类型的指针
 *              深克隆: 复制对象时直接复制对象字段的值（引用类型则
 *                     创建给对象赋值）
 * @Date 2019/03/20
 */
public class Prototype implements Cloneable {

    private String name;
    private int count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    protected Object clone() {
        Prototype p = new Prototype();
        p.setName(this.name);
        p.setCount(this.count);
        return p;
    }
}
