package com.fosuchao.facade;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/4 17:47
 */
public class DvDPlayer {
    private final static DvDPlayer dvdplayer = new DvDPlayer();

    public void on() {
        System.out.println("开启音响播放");
    }

    public void pause() {
        System.out.println("暂停音响播放");
    }

    public void off() {
        System.out.println("关闭音响");
    }

    public static DvDPlayer getInstance() {
        return dvdplayer;
    }

}
