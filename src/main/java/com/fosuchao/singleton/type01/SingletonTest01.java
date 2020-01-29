package com.fosuchao.singleton.type01;

/**
 * @Description: 饿汉式（静态常量）
 * 步骤：
 * 1、构造器私有化（防止new）
 * 2、类的内部创建对象
 * 3、类提供一个返回对象的静态方法
 *
 * 优点：写法简单，在类装载的时候就完成了实例化。避免了线程同步的问题
 * 缺点：在类装载时就完成实例化，没有达到懒加载的效果，如果单例对象没有被使用，会造成内存浪费。
 * @Auther: Joker Ye
 * @Date: 2020/1/29 10:31
 */
public class SingletonTest01 {

    public static void main(String[] args) {
        // Singleton singleton = new Singleton();  构造函数私有化导致实例化错误

        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }

}


class Singleton{
    private Singleton(){

    }

    private static final Singleton singleton = new Singleton();

    public static Singleton getInstance(){
        return singleton;
    }
}
