package com.fosuchao.strategy;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/8 23:10
 */
public class Calculator {
    private Strategy strategy;

    public Calculator(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute(int num1, int num2) {
        strategy.doOperation(num1, num2);
    }
}
