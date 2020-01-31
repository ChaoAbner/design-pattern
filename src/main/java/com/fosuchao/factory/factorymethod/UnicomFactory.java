package com.fosuchao.factory.factorymethod;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/30 19:38
 */
public class UnicomFactory implements AbsFactory{

    public Sender createMail() {
        return new UnicomSender();
    }
}
