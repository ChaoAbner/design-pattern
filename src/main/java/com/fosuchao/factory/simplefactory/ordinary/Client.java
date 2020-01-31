package com.fosuchao.factory.simplefactory.ordinary;

/**
 * @Description: 简单工厂（普通形式），需要传入字符串判断
 * @Auther: Joker Ye
 * @Date: 2020/1/30 19:40
 */
public class Client {
    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        Sender telecom = senderFactory.produce("telecom");
        telecom.mail();
        Sender unicom = senderFactory.produce("unicom");
        unicom.mail();

    }
}
