package com.fosuchao.template;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/5 20:53
 */
public class BasketballGame extends Game {

    @Override
    void init() {
        System.out.println("篮球游戏初始化中");
    }

    @Override
    void start() {
        System.out.println("篮球游戏进行中");
    }

    @Override
    void end() {
        System.out.println("篮球游戏结束，欢迎下次再玩");
    }
}
