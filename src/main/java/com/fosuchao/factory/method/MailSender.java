package com.fosuchao.factory.method;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/30 19:38
 */
public class MailSender implements Sender {
    public void send() {
        System.out.println("send mail message");
    }
}
