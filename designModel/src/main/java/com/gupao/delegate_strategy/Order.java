package com.gupao.delegate_strategy;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Spencer Zhang
 * @ClassName Order
 * @Description 订单类
 * @Date 2019/03/27
 */
public class Order {

    public static final String ALI = "ALI";

    public static final String JD = "JD";

    private double amount;

    private static Map<String, Payment> cach = new ConcurrentHashMap();

    static {
        cach.put(ALI, new AliPay());
        cach.put(JD, new JDPay());
    }

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void pay(String key) {
        Payment payment = cach.get(key);
        if(Objects.isNull(payment)) {
            System.out.println("无此支付方式");
            return;
        }
        payment.pay(amount);
    }

}
