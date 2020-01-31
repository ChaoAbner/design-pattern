package com.fosuchao.factory.simplefactory.method;


/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/30 19:38
 */
public class TelecomSender implements Sender {

    public void mail() {
        System.out.println("telecom send mail message");
    }
}
