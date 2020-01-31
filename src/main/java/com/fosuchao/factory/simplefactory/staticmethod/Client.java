package com.fosuchao.factory.simplefactory.staticmethod;

import com.fosuchao.factory.simplefactory.ordinary.Sender;

/**
 * @Description: 简单工厂（静态方法形式），使用静态方法直接调用
 * @Auther: Joker Ye
 * @Date: 2020/1/30 19:46
 */
public class Client {
    public static void main(String[] args) {
        Sender telecom = SenderFactory.telecom();
        Sender unicom = SenderFactory.unicom();

        telecom.mail();
        unicom.mail();
    }
}
