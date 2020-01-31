package com.fosuchao.factory.absfactory;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/31 10:31
 */
public interface AbsFactory {
    Mail createMail();
    Sms createSms();
}
