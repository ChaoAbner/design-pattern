package com.fosuchao.singleton.type06;

/**
 * @Description: 双重检查
 * 提供一个静态的公有方法，加入双重检查，解决线程安全问题，同时解决懒加载问题
 * 同时保证了效率， 推荐使用
 * 加volatile的原因：
 * 先说不加volatile会发生什么，如果不加的话，当线程A进入了同步代码块，确定了instance为null，好的开始初始化
 * 但是这时初始化是分为两个过程来执行的，也就是这个new操作是无序的
 * - 1、分配一个内存空间，让instance指向它
 * - 2、在内存中创建对象
 * 虽然synchronized是互斥的，但是不代表就把整个过程执行完，中间可能释放时间片，时间片不属于锁就如上面讲的
 * 这时就会发生一个问题，A执行完后，时间片释放，当另一个线程B进入判断instance时，如果为null的话，直接返回instance，这时
 * instance可能还没被实例化，也就是null。这就会出现很多问题。
 *
 * 而加了volatile，则保证了可见性，这时要区分jdk版本了
 * 在jdk1.4及之前，volatile并不能保证new操作的有序性，但是它能保证可见性，因此在第一个判断处，读到的不是null，导致了问题。
 * 从1.5开始，加了volatile关键字的引用，它的初始化就变成了
 * - 1、在内存中创建对象
 * - 2、将instance指向这块内存
 * 这样就避免了无序性的问题
 * @Auther: Joker Ye
 * @Date: 2020/1/29 12:44
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton{
    private static volatile Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if (instance == null) {
            synchronized (Singleton.class){
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
