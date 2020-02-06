package com.fosuchao.visitor;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/6 19:10
 */
public class Man extends Person {

    public Man(String name) {
        super(name);
    }

    @Override
    protected void accept(Action action) {
        action.getManResult(this);
    }
}
