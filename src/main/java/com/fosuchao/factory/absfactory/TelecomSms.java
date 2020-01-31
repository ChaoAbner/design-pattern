package com.fosuchao.factory.absfactory;


/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/31 10:30
 */
public class TelecomSms implements Sms {
    public void send() {
        System.out.println("telecom send sms message");
    }
}
