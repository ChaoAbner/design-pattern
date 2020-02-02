package com.fosuchao.adapter.classAadpter;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/2 16:45
 */
public class Client {
    public static void main(String[] args) {
        PowerAdapter powerAdapter = new PowerAdapter();
        Phone phone = new Phone(powerAdapter);
        phone.charge();
    }
}
