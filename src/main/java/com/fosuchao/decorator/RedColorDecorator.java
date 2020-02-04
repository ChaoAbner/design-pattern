package com.fosuchao.decorator;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/4 16:14
 */
public class RedColorDecorator extends Decorator{

    public RedColorDecorator(Shape shape) {
        super(shape);
    }

    public void draw() {
        System.out.println("画笔颜色切换为红颜色");
        shape.draw();
    }
}
