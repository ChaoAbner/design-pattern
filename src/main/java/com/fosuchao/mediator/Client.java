package com.fosuchao.mediator;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/8 19:38
 */
public class Client {
    public static void main(String[] args) {
        Country china = new Country("中国", "世界第二大经济体");
        china.trade(new Country("美国", "世界第一大经济体"));
    }
}
