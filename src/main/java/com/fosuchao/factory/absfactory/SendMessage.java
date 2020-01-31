package com.fosuchao.factory.absfactory;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/31 11:22
 */
public class SendMessage {
    AbsFactory absFactory;

    SendMessage(AbsFactory absFactory) {
        this.absFactory = absFactory;
    }

    public void send(){
        this.absFactory.createMail().send();
        this.absFactory.createSms().send();
    }
}
