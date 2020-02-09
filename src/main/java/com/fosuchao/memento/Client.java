package com.fosuchao.memento;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/9 23:37
 */
public class Client {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Memento m1 = new Memento("副本1通过");
        Memento m2 = new Memento("打副本2的boss");
        Memento m3 = new Memento("副本2通过");
        Originator player = new Originator();
        careTaker.add(player.saveStateToMemento());
    }
}
