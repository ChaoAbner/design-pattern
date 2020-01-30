package com.fosuchao.factory.method;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/30 19:53
 */
public class MailFactory {

    public Sender produce(){
        return new MailSender();
    }
}
