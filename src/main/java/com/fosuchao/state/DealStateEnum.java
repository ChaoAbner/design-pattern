package com.fosuchao.state;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/8 21:02
 */
public enum  DealStateEnum {
    WAIT_PAID("等待支付"),
    WAIT_SEND("等待发货"),
    WAIT_RECEIVE("等待收货"),
    WAIT_COMMENT("等待评价"),
    DEAL_FINISH("交易完成");

    private String state;

    DealStateEnum(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
