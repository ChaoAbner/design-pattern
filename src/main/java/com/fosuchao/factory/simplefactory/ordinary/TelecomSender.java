package com.fosuchao.factory.simplefactory.ordinary;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/30 19:37
 */
public class TelecomSender implements Sender {

    public void mail() {
        System.out.println("Telecom send mail message");
    }
}
