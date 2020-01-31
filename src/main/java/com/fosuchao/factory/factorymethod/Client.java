package com.fosuchao.factory.factorymethod;

/**
 * @Description: 简单工厂（方法形式）
 * @Auther: Joker Ye
 * @Date: 2020/1/30 19:46
 */
public class Client {
    public static void main(String[] args) {
        AbsFactory unicomFactory = new UnicomFactory();
        AbsFactory telecomFactory = new TelecomFactory();

        Sender unicomMail = unicomFactory.createMail();
        Sender telecomMail = telecomFactory.createMail();

        unicomMail.mail();
        telecomMail.mail();
    }
}
