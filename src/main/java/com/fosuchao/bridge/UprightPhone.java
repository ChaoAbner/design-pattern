package com.fosuchao.bridge;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/3 16:45
 */
public class UprightPhone extends Phone {

    public UprightPhone(Brand brand) {
        super(brand);
    }

    public void call() {
        System.out.print("竖直手机 -> ");
        super.call();
    }

}
