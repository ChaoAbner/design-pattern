package com.fosuchao.state;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/8 21:23
 */
public class BookState extends State {

    @Override
    public void action(Context context) {
        System.out.println("买家订购了一个商品");
        context.setState(DealStateEnum.WAIT_PAID);
        current(context);
    }
}
