package com.fosuchao.memento;

/**
 * @Description: 发起者，需要存档的对象
 * @Auther: Joker Ye
 * @Date: 2020/2/9 23:30
 */
public class Originator {
    private String state;

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
