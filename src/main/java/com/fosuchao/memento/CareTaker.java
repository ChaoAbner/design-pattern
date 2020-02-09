package com.fosuchao.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 备忘录管理者
 * @Auther: Joker Ye
 * @Date: 2020/2/9 23:29
 */
public class CareTaker {
    private List<Memento> list = new ArrayList<Memento>();

    public void add(Memento memento) {
        list.add(memento);
    }

    public Memento get(int index) {
        return list.get(index);
    }
}
