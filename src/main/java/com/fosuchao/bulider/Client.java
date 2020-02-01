package com.fosuchao.bulider;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/1 23:27
 */
public class Client {
    public static void main(String[] args) {
        CountryHouse countryHouse = new CountryHouse();
        OrdinaryHouse ordinaryHouse = new OrdinaryHouse();
        Director director = new Director(countryHouse);
        director.build();
        director.setBuilder(ordinaryHouse);
        director.build();
    }
}
