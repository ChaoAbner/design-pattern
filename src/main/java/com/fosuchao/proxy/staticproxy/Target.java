package com.fosuchao.proxy.staticproxy;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/28 09:30
 */
public class Target implements Message {
    public void send() {
        System.out.println("目标的send方法");
    }
}
