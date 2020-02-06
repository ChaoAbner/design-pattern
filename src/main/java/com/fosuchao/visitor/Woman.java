package com.fosuchao.visitor;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/6 19:10
 */
public class Woman extends Person {

    public Woman(String name) {
        super(name);
    }

    @Override
    protected void accept(Action action) {
        action.getWomanResult(this);
    }
}
