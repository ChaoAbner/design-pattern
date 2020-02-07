package com.fosuchao.iterator;

import java.util.ArrayList;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/7 19:47
 */
public class Client {
    public static void main(String[] args) {

        University university = new University();
        Iterator iterator = university.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
