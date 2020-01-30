package com.fosuchao.factory.easy.ordinary;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/30 19:37
 */
public class SmsSender implements Sender {
    public void send() {
        System.out.println("send sms message");
    }
}
