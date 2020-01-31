package com.fosuchao.factory.simplefactory.staticmethod;

import com.fosuchao.factory.simplefactory.ordinary.Sender;
import com.fosuchao.factory.simplefactory.ordinary.TelecomSender;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/30 19:38
 */
public class SenderFactory {

   public static Sender unicom(){
       return new UnicomSender();
   }

    public static Sender telecom(){
        return new TelecomSender();
    }
}
