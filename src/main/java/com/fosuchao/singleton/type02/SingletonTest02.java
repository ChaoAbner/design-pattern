package com.fosuchao.singleton.type02;

/**
 * @Description: 饿汉式(静态代码块)
 * 与静态常量的方法类似，只是将实例化的过程放在静态代码块
 * 静态代码块也在类加载的过程中执行，即实例化对象，所以线程安全
 * 优缺点与静态常量的方法相同
 * @Auther: Joker Ye
 * @Date: 2020/1/29 10:41
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

    }
}


class Singleton{

    private Singleton(){}

    private static Singleton instance;
    // 静态代码块实例化对象
    static {
        instance = new Singleton();
    }

    public static Singleton getInstance(){
        return instance;
    }



}
