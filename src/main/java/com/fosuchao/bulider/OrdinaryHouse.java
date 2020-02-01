package com.fosuchao.bulider;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/1 23:15
 */
public class OrdinaryHouse extends Builder {
    @Override
    public void basic() {
        System.out.println("普通房子构建主体结构");
    }

    @Override
    public void wall() {
        System.out.println("普通房子刷墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子盖屋顶");
    }
}
