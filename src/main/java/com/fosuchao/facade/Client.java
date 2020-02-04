package com.fosuchao.facade;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/4 17:54
 */
public class Client {
    public static void main(String[] args) {
        HomeFacade homeFacade = new HomeFacade();
        homeFacade.ready();
        homeFacade.pause();
        homeFacade.end();
    }
}
