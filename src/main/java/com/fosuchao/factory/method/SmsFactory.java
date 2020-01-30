package com.fosuchao.factory.method;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/30 19:38
 */
public class SmsFactory {

    public Sender produce(){
        return new SmsSender();
    }
}
