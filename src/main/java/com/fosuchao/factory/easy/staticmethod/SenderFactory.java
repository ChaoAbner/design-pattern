package com.fosuchao.factory.easy.staticmethod;

import com.fosuchao.factory.easy.ordinary.Sender;

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
