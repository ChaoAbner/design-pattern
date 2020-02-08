package com.fosuchao.state;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/8 21:24
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("购物开始");
        Context context = new Context();
        new BookState().action(context);
        new PaidState().action(context);
        new SendState().action(context);
        new DeliveryState().action(context);
        new CommentState().action(context);
    }
}
