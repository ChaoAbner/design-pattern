package com.fosuchao.adapter.objectAdapter;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/2 17:29
 */
public class Phone {
    Power5V power;

    Phone(Power5V power) {
        this.power = power;
    }

    public void charge(){
        int i = this.power.output5V();
        if(i == 5){
            System.out.println("5v电压，正常充电");
        } else {
            System.out.println("电压不匹配，无法充电");
        }
    }
}
