package com.gupao.delegate_strategy;

/**
 * @author Spencer Zhang
 * @ClassName JDPay
 * {@link Payment}
 * @Date 2019/03/27
 */
public class JDPay implements Payment {

    @Override
    public double getBalance() {
        return 50000;
    }

    @Override
    public String getName() {
        return "京东白条";
    }
}
