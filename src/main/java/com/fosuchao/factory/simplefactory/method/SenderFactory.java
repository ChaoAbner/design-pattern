package com.fosuchao.factory.simplefactory.method;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/30 19:38
 */
public class SenderFactory {

   public Sender telecom(){
       return new TelecomSender();
   }

    public Sender unicom(){
        return new UnicomSender();
    }
}
