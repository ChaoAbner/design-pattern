package com.fosuchao.bulider;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/1 23:16
 */
public class CountryHouse extends Builder {
    @Override
    public void basic() {
        System.out.println("别墅构建主体结构");
    }

    @Override
    public void wall() {
        System.out.println("别墅刷墙");
    }

    @Override
    public void roofed() {
        System.out.println("别墅盖屋顶");
    }

}
