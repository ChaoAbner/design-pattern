package com.fosuchao.state;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/8 21:22
 */
public class CommentState extends State {

    @Override
    public void action(Context context) {
        System.out.println("买家评价商品");
        context.setState(DealStateEnum.DEAL_FINISH);
        current(context);
    }

}
