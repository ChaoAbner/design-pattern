package com.fosuchao.state;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/8 21:16
 */
public class SendState extends State {

    @Override
    public void action(Context context) {
        System.out.println("卖家已发货");
        context.setState(DealStateEnum.WAIT_RECEIVE);
        current(context);
    }

}
