package com.fosuchao.factory.factorymethod;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/30 19:53
 */
public class TelecomFactory implements AbsFactory {

    public Sender createMail() {
        return new TelecomSender();
    }
}
