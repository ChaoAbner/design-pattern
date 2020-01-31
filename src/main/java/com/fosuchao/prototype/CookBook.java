package com.fosuchao.prototype;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/31 11:46
 */
public class CookBook implements Cloneable{
    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
