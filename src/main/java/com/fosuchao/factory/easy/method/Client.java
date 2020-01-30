package com.fosuchao.factory.easy.method;

/**
 * @Description: 简单工厂（方法形式），
 * @Auther: Joker Ye
 * @Date: 2020/1/30 19:46
 */
public class Client {
    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        senderFactory.produceMail().send();
        senderFactory.produceSms().send();
    }
}
