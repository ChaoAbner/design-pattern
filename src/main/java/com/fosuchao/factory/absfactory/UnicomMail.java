package com.fosuchao.factory.absfactory;


/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/31 10:30
 */
public class UnicomMail implements Mail {
    public void send() {
        System.out.println("unicom send mail message");
    }
}
