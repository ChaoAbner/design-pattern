package com.fosuchao.proxy.jdk;

/**
 * @Description: ��̬����/jdk����
 *
 * @Auther: Joker Ye
 * @Date: 2020/1/28 09:52
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Target();
        ProxyFactory proxyFactory = new ProxyFactory(target);
        Teacher proxyInstance = (Teacher) proxyFactory.getProxyInstance();

        proxyInstance.teach();
        proxyInstance.call("Mike");

    }
}
