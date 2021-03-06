package com.fosuchao.factory.simplefactory.ordinary;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/30 19:38
 */
public class SenderFactory {

    public Sender produce(String type){
        if("telecom".equals(type)){
            return new TelecomSender();
        } else if ("unicom".equals(type)){
            return new UnicomSender();
        } else {
            System.out.println("类型不存在");
            return null;
        }
    }
}
