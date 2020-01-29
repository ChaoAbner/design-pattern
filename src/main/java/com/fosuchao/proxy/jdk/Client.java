package com.fosuchao.proxy.jdk;

/**
 * @Description: 动态代理/jdk代理
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
