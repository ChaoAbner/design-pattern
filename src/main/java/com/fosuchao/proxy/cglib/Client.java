package com.fosuchao.proxy.cglib;

import com.fosuchao.proxy.jdk.Target;

/**
 * @Description: cglib代理
 * 1、导入cglib包
 * 2、proxyFactory实现MethodInterceptor接口，并且重写intercept方法来实现目标方法的调用和其它逻辑
 * 3、实例化Enhancer，设置父类为target，再设置回调函数。最后通过返回Enhancer.create()方法创建代理对象
 * @Auther: Joker Ye
 * @Date: 2020/1/28 10:21
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Target();
        Target proxyFactory = (Target) new ProxyFactory(target).getProxyInstance();

        proxyFactory.teach();
        proxyFactory.call("Mike");
    }
}
