package com.fosuchao.singleton.type04;

/**
 * @Description: 懒汉式（线程安全，同步方法）
 * 提供一个静态方法，加锁处理，解决线程安全问题
 * 优缺点：
 * 加上锁使方法同步，但是每次调用getInstance()方法都会进行同步，导致效率低下
 * @Auther: Joker Ye
 * @Date: 2020/1/29 12:44
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton{
    private static Singleton instance;

    private Singleton(){}

    public synchronized static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
