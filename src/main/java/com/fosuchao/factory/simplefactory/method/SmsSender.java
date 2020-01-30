package com.fosuchao.factory.simplefactory.method;

import com.fosuchao.factory.simplefactory.ordinary.Sender;

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
