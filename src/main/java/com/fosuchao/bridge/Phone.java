package com.fosuchao.bridge;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/3 16:37
 */
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void call() {
        this.brand.call();
    }

}
