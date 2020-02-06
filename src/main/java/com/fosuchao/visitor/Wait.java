package com.fosuchao.visitor;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/6 19:12
 */
public class Wait implements Action {

    @Override
    public void getManResult(Man person) {
        System.out.println(person.getName() + "（男性）的选拔结果是：wait");

    }

    @Override
    public void getWomanResult(Woman person) {
        System.out.println(person.getName() + "（女性）的选拔结果是：wait");
    }
}
