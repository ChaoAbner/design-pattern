package com.fosuchao.composite;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/5 18:16
 */
public abstract class Component {

    public void add(Component component) {

    }

    public void remove(Component component) {

    }

    // 打印自己的所有下级部门，抽象方法，给子类实现
    protected abstract void print();

}
