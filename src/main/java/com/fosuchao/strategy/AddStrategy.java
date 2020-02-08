package com.fosuchao.strategy;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/8 23:07
 */
public class AddStrategy implements Strategy {

    @Override
    public void doOperation(int num1, int num2) {
        System.out.println("加法结果是：" + (num1 + num2));
    }
}
