package com.gupao.delegate_strategy;

/**
 * @author Spencer Zhang
 * @ClassName AliPay
 * {@link Payment}
 * @Date 2019/03/27
 */
public class AliPay implements Payment {

    @Override
    public double getBalance() {
        return 400;
    }

    @Override
    public String getName() {
        return "支付宝";
    }

}
