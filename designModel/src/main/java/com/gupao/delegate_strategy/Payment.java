package com.gupao.delegate_strategy;

/**
 * @author Spencer Zhang
 * @ClassName Payment
 * @Date 2019/03/27
 */
public interface Payment {

    double getBalance();

    String getName();

    default void pay(double amount) {
        if (getBalance() < amount)
            System.out.println("余额不足");
        else {
            System.out.println("使用"+getName());
            System.out.println("成功扣款:"+amount);
        }
    }

}
