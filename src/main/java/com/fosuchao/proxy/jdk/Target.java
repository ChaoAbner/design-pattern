package com.fosuchao.proxy.jdk;

import javax.sound.midi.Soundbank;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/28 10:00
 */
public class Target implements Teacher {
    public void teach() {
        System.out.println("teacher is teaching...");
    }

    public void call(String name) {
        System.out.println("teacher call" + name + "to answer the questions.");
    }
}
