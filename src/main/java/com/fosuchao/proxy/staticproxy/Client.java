package com.fosuchao.proxy.staticproxy;

/**
 * @Description: 静态代理
 * 优点： 再不修改目标对象的前提下，能通过代理对象对目标对象的功能进行扩展
 * 缺点： 因为目标和代理对象都实现同一个接口，一旦接口方法增加，则目标对象和代理对象都要维护
 * @Auther: Joker Ye
 * @Date: 2020/1/28 09:32
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Target();
        Proxy proxy = new Proxy(target);
        proxy.send();
    }
}
