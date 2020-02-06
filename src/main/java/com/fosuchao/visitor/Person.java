package com.fosuchao.visitor;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/6 19:08
 */
public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected abstract void accept(Action action);
}
