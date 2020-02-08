package com.fosuchao.state;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/8 21:22
 */
public class DeliveryState extends State {

    @Override
    public void action(Context context) {
        System.out.println("买家收到了商品");
        context.setState(DealStateEnum.WAIT_COMMENT);
        current(context);
    }

}
