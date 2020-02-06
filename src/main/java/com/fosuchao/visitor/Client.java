package com.fosuchao.visitor;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/6 19:23
 */
public class Client {
    public static void main(String[] args) {
        // 选手
        Man mike = new Man("Mike");
        Woman lili = new Woman("Lili");
        Man james = new Man("James");
        // 评委给评价
        ResultSet successResult = new ResultSet();
        ResultSet failResult = new ResultSet();
        ResultSet waitResult = new ResultSet();
        successResult.add(mike);
        failResult.add(lili);
        waitResult.add(james);
        successResult.display(new Success());
        failResult.display(new Fail());
        waitResult.display(new Wait());
    }
}
