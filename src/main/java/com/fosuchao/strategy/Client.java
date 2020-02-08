package com.fosuchao.strategy;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/8 23:11
 */
public class Client {
    public static void main(String[] args) {
        AddStrategy addStrategy = new AddStrategy();
        SubstractStrategy substractStrategy = new SubstractStrategy();
        MultiplyStrategy multiplyStrategy = new MultiplyStrategy();
        new Calculator(addStrategy).execute(6, 3);
        new Calculator(substractStrategy).execute(5, 3);
        new Calculator(multiplyStrategy).execute(5, 3);
    }
}
