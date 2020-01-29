package com.fosuchao.proxy.staticproxy;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/28 09:29
 */
public class Proxy implements Message{

    Target target;

    Proxy(Target target){
        this.target = target;
    }

    public void send() {
        System.out.println("代理方法开始执行");
        target.send();
        System.out.println("代理方法执行完毕");
    }
}
