package com.fosuchao.state;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/8 21:18
 */
public class Context {
    private DealStateEnum state;

    public void setState(DealStateEnum state) {
        this.state = state;
    }

    public String CurrentState() {
        return state.getState();
    }
}
