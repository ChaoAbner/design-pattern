package com.fosuchao.bridge;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/3 16:55
 */
public class Client {
    public static void main(String[] args) {
        Brand vivoBrand = new VivoBrand();
        Brand xiaomiBrand = new XiaomiBrand();
        Phone vivoUprightPhone = new UprightPhone(vivoBrand);
        Phone xiaomiUprightPhone = new UprightPhone(xiaomiBrand);
        Phone xiaomiFilpPhone = new FilpPhone(xiaomiBrand);
        Phone vivoFilpPhone = new FilpPhone(vivoBrand);

        vivoUprightPhone.call();
        xiaomiUprightPhone.call();
        xiaomiFilpPhone.call();
        vivoFilpPhone.call();
    }
}
