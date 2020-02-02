package com.fosuchao.adapter.objectAdapter;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/2 17:29
 */
public class PowerAdapter implements Power5V{
    Power220V power220V;

    public PowerAdapter(Power220V power220V) {
        this.power220V = power220V;
    }

    @Override
    public int output5V() {
        if(this.power220V == null) {
            this.power220V = new Power220V();
        }
        return this.power220V.getOutput220V() / 44;
    }
}
