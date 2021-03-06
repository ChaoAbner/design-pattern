package com.fosuchao.factory.simplefactory.method;

/**
 * @Description: 简单工厂（方法形式），
 * @Auther: Joker Ye
 * @Date: 2020/1/30 19:46
 */
public class Client {
    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        Sender telecom = senderFactory.telecom();
        Sender unicom = senderFactory.unicom();

        telecom.mail();
        unicom.mail();
    }
}
