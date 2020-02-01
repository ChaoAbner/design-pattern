package com.fosuchao.bulider;

// 产品抽象类
public abstract class Builder {
    House house = new House();

    void basic(){};

    void wall(){};

    void roofed(){};

    House delivery(){
        return house;
    };
}
