package com.fosuchao.adapter.classAadpter;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/2 16:42
 */
public class PowerAdapter extends Power220V implements Power5V {

    @Override
    public int output5V() {
        int output = getOutput220V();

        return output / 44;
    }
}
