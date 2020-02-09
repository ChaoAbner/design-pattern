package com.fosuchao.memento;

/**
 * @Description: 备忘录
 * @Auther: Joker Ye
 * @Date: 2020/2/9 23:30
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
