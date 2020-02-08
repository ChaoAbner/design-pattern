package com.fosuchao.state;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/8 21:21
 */
public class PaidState extends State {

    @Override
    public void action(Context context) {
        System.out.println("买家成功付款");
        context.setState(DealStateEnum.WAIT_SEND);
        current(context);
    }

}
