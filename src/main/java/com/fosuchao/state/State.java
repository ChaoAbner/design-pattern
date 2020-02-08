package com.fosuchao.state;

public abstract class State {
    abstract void action(Context context);

    void current(Context context) {
        System.out.println("当前状态：" + context.CurrentState());

    }
}
