package com.fosuchao.factory.simplefactory.staticmethod;

import com.fosuchao.factory.simplefactory.ordinary.Sender;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/30 19:38
 */
public class UnicomSender implements Sender {


    public void mail() {
        System.out.println("unicom send mail message");
    }
}
