package com.fosuchao.factory.absfactory;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/31 11:22
 */
public class Client {
    public static void main(String[] args) {
        AbsFactory telecomFactory = new TelecomFactory();
        AbsFactory unicomFactory = new UnicomFactory();

        SendMessage telecom = new SendMessage(telecomFactory);
        SendMessage unicom = new SendMessage(unicomFactory);

        telecom.send();
        unicom.send();
    }
}
