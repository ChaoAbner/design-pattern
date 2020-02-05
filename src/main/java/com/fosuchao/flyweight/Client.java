package com.fosuchao.flyweight;

/**
 * @Description: 享元模式
 * @Auther: Joker Ye
 * @Date: 2020/2/5 20:21
 */
public class Client {
    public static void main(String[] args) {
        User mike = new User("Mike", 18);
        User lili = new User("Lili", 20);

        Server webside = ServerFactory.getInstance("cloud", "网站");
        Server database = ServerFactory.getInstance("visual", "数据库");
        webside.use(mike);
        webside.use(lili);
        database.use(mike);
        database.use(lili);


    }
}
