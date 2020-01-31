package com.fosuchao.prototype;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/31 11:48
 */
public class Client {
    public static void main(String[] args) {
        CookBook cookBook = new CookBook();
        Sheep sheep = new Sheep("white", cookBook);
        // 浅拷贝
//        Sheep clone1 = (Sheep) sheep.clone();
//        Sheep clone2 = (Sheep) sheep.clone();
//        System.out.println(sheep);
//        System.out.println(clone1);
//        System.out.println(sheep == clone1);
//        System.out.println(clone1 == clone2);
//        System.out.println(clone2.hashCode());
//
//        System.out.println(sheep.getCookbook().hashCode());       // 相等
//        System.out.println(clone2.getCookbook().hashCode());

        // clone的深拷贝
//        Sheep deepSheep1 = (Sheep) sheep.deepClone();
//        Sheep deepSheep2 = (Sheep) sheep.deepClone();
//        System.out.println(sheep == deepSheep1);
//        System.out.println(deepSheep2 == deepSheep1);
//
//        System.out.println(deepSheep1.getCookbook().hashCode());    // 不相等
//        System.out.println(deepSheep2.getCookbook().hashCode());


        // 序列化实现深拷贝
        Sheep clone1 = (Sheep) sheep.deepCloneBySerialize();
        Sheep clone2 = (Sheep) sheep.deepCloneBySerialize();

        System.out.println(clone1 == clone2);
        System.out.println(clone1.getCookbook().hashCode());
        System.out.println(clone2.getCookbook().hashCode());
    }
}
