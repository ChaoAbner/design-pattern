package com.fosuchao.decorator;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/4 16:11
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("开始画圆形");
    }
}
