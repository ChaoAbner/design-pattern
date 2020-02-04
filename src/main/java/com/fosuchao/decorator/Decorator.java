package com.fosuchao.decorator;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/4 16:13
 */
public class Decorator implements Shape{
    Shape shape;

    public Decorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
