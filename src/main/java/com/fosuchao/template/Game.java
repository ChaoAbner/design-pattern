package com.fosuchao.template;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/5 20:51
 */
public abstract class Game {
    abstract void init();

    abstract void start();

    abstract void end();

    public final void play() {
        init();
        start();
        end();
    }

}
