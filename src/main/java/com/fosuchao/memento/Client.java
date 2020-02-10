package com.fosuchao.memento;

/**
 * @Description: 客户端
 * @Auther: Joker Ye
 * @Date: 2020/2/9 23:37
 */
public class Client {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator player = new Originator();
        player.setState("副本一通过");
        careTaker.add(player.saveStateToMemento());
        player.setState("打副本二boss");
        careTaker.add(player.saveStateToMemento());
        player.getStateFromMemento(careTaker.get(1));
        System.out.println(player.getState());
    }
}
