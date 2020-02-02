package com.fosuchao.adapter.objectAdapter;

/**
 * @Description: 对象适配器模式
 * @Auther: Joker Ye
 * @Date: 2020/2/2 17:29
 */
public class Client {
    public static void main(String[] args) {
        PowerAdapter powerAdapter = new PowerAdapter(new Power220V());
        Phone phone = new Phone(powerAdapter);
        phone.charge();
    }
}
