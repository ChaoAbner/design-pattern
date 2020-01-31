package com.fosuchao.factory.simplefactory.ordinary;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/30 19:38
 */
public class UnicomSender implements Sender {

    public void mail() {
        System.out.println("Unicom send mail message");
    }
}
