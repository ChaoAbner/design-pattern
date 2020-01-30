package com.fosuchao.factory.simplefactory.staticmethod;

import com.fosuchao.factory.simplefactory.ordinary.Sender;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/30 19:38
 */
public class SenderFactory {

   public static Sender produceMail(){
       return new MailSender();
   }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
