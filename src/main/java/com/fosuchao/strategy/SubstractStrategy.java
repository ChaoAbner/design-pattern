package com.fosuchao.strategy;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/8 23:07
 */
public class SubstractStrategy implements Strategy {

    @Override
    public void doOperation(int num1, int num2) {
        System.out.println("减法结果是：" + (num1 - num2));
    }
}
