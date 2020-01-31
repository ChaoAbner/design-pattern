package com.fosuchao.factory.absfactory;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/31 10:33
 */
public class UnicomFactory implements AbsFactory {
    public Mail createMail() {
        System.out.println("telecom create mail");
        return new UnicomMail();
    }

    public Sms createSms() {
        System.out.println("telecom create sms");
        return new UnicomSms();
    }
}
