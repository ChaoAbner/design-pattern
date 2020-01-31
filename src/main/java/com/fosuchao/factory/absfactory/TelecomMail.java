package com.fosuchao.factory.absfactory;


import javax.sound.midi.Soundbank;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/31 10:30
 */
public class TelecomMail implements Mail {

    public void send() {
        System.out.println("telecom send mail message");
    }
}
