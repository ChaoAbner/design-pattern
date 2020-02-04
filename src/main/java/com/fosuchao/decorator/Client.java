package com.fosuchao.decorator;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/4 16:15
 */
public class Client {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        RedColorDecorator redRectangle = new RedColorDecorator(rectangle);
        RedColorDecorator redCircle = new RedColorDecorator(circle);

        circle.draw();
        redCircle.draw();
        redRectangle.draw();

    }
}
