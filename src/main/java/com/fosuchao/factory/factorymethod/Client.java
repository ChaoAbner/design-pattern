package com.fosuchao.factory.factorymethod;

/**
 * @Description: 简单工厂（方法形式）
 * @Auther: Joker Ye
 * @Date: 2020/1/30 19:46
 */
public class Client {
    public static void main(String[] args) {
        SmsFactory smsFactory = new SmsFactory();
        MailFactory mailFactory = new MailFactory();

        smsFactory.produce().send();
        mailFactory.produce().send();

    }
}
