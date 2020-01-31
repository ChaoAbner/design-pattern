package com.fosuchao.factory.factorymethod;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/30 19:37
 */
public class UnicomSender implements Sender {

    public void mail() {
        System.out.println("unicom send mail message");
    }
}
