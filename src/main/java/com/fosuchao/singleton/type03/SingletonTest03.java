package com.fosuchao.singleton.type03;

/**
 * @Description: 懒汉式（线程不安全）
 * 提供一个静态方法获取instance ，当使用到的时候，才去初始化，并返回，这就是懒汉模式
 * 优缺点：
 * 1、懒加载效果，不过只能在单线程的情况下使用
 * 2、在多线程下，一个线程进入了if语句内，还没实例化的时候，另一个线程又进入了if，这样就会导致多次实例化的错误发生。
 * 3、实际开发中，不建议使用
 * @Auther: Joker Ye
 * @Date: 2020/1/29 11:47
 */
public class SingletonTest03 {

}

class Singleton{
    private static Singleton singleton;

    private Singleton(){}


    public static Singleton getInstance(){
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}