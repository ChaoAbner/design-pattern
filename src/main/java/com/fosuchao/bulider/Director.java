package com.fosuchao.bulider;

/**
 * @Description: 指挥者，聚合具体的产品对象，并进行建造
 * @Auther: Joker Ye
 * @Date: 2020/2/1 23:22
 */
public class Director {
    private Builder builder;

    Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public House build(){
        this.builder.basic();
        this.builder.wall();
        this.builder.roofed();
        return this.builder.delivery();
    }
}
