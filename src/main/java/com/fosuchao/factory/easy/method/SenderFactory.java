package com.fosuchao.factory.easy.method;

import com.fosuchao.factory.easy.ordinary.Sender;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/30 19:38
 */
public class SenderFactory {

   public Sender produceMail(){
       return new MailSender();
   }

    public Sender produceSms(){
        return new SmsSender();
    }
}
