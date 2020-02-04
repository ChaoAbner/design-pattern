package com.fosuchao.facade;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/4 17:47
 */
public class Screen {
    private final static Screen screen = new Screen();

    public void on() {
        System.out.println("降下幕布");
    }

    public void off() {
        System.out.println("升起幕布");
    }

    public static Screen getInstance() {
        return screen;
    }
}
