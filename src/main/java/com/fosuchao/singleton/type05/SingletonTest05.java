package com.fosuchao.singleton.type05;

/**
 * @Description: 懒汉式（线程安全，同步代码块）
 * 锁住整个代码块
 * 不推荐使用
 * @Auther: Joker Ye
 * @Date: 2020/1/29 12:44
 */
public class SingletonTest05 {
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

    public static Singleton getInstance(){
        if (instance == null) {
            synchronized (Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }
}
