package com.fosuchao.template;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/5 20:55
 */
public class Client {
    public static void main(String[] args) {
        Game game = new BasketballGame();
        game.play();
        System.out.println("切换游戏");
        game = new FootBallGame();
        game.play();
    }
}
