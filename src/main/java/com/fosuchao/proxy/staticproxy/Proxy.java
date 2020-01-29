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
        System.out.println("��������ʼִ��");
        target.send();
        System.out.println("������ִ�����");
    }
}
