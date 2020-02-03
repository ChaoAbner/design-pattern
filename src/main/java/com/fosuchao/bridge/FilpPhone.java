package com.fosuchao.bridge;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/3 16:44
 */
public class FilpPhone extends Phone {

    public FilpPhone(Brand brand) {
        super(brand);
    }

    public void call() {
        System.out.print("翻盖手机 -> ");
        super.call();
    }
}
