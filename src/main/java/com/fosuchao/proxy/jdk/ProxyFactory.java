package com.fosuchao.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/28 10:02
 */
public class ProxyFactory {
    Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 给目标对象生成一个代理对象
    public Object getProxyInstance(){
        /**
         *     public static Object newProxyInstance(ClassLoader loader,
         *                                           Class<?>[] interfaces,
         *                                           InvocationHandler h) {}
         * 参数说明
         * loader: 目标对象的类加载器，
         * interfaces: 目标对象实现的接口类型，使用泛型方法确认类型
         * InvocationHandler: 执行目标方法，将会把当前的目标对象的方法作为参数传入
         * @Param []
         * @return java.lang.Object
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("动态代理开始");
                        // 通过反射来调用目标方法
                        Object invoke = method.invoke(target, args);
                        System.out.println("动态代理");
                        return invoke;
                    }
                });
    }
}
