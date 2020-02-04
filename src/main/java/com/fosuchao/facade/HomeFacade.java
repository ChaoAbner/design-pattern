package com.fosuchao.facade;

import java.util.List;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/4 17:47
 */
public class HomeFacade {
    private DvDPlayer dvDPlayer;
    private Light light;
    private Screen screen;

    public HomeFacade() {
        this.dvDPlayer = DvDPlayer.getInstance();
        this.light = Light.getInstance();
        this.screen = Screen.getInstance();
    }

    public void ready() {
        System.out.println("家庭影院模式开启");
        this.dvDPlayer.on();
        this.light.on();
        this.screen.on();
    }

    public void pause() {
        this.dvDPlayer.pause();
    }

    public void end() {
        this.dvDPlayer.off();
        this.light.off();
        this.screen.off();
        System.out.println("园厅影院模式关闭");
    }
}
