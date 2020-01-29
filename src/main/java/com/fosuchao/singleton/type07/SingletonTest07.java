package com.fosuchao.singleton.type07;

/**
 * @Description: 静态内部类 推荐使用
 * 静态内部类在类装载的时候不会被实例化，而是当使用到的时候，即调用getInstance()时内部类才会被装载，此时instance被实例化
 * 利用了类的装载是线程安全的特点，保证了线程安全，也实现了延迟加载
 * @Auther: Joker Ye
 * @Date: 2020/1/29 20:20
 */
public class SingletonTest07 {
    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

    }
}

class Singleton{

    // 构造器私有化
    private Singleton(){

    }

    // 静态内部类，内部创建一个静态属性
    private static class InnerSingleton{
        private static final Singleton SINGLETON = new Singleton();
    }

    public static Singleton getInstance(){
        return InnerSingleton.SINGLETON;
    }

}
