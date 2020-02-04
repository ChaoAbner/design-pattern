package com.fosuchao.facade;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/4 17:47
 */
public class Light {
    private final static Light light = new Light();

    public void on() {
        System.out.println("打开氛围灯");
    }

    public void off() {
        System.out.println("关闭氛围灯");
    }

    public static Light getInstance() {
        return light;
    }
}
