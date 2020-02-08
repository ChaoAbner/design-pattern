package com.fosuchao.observer;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/8 20:26
 */
public class BaiduWeather implements Observer{
    private WeatherSubject weatherSubject;

    public BaiduWeather(WeatherSubject weatherSubject) {
        this.weatherSubject = weatherSubject;
        this.weatherSubject.register(this);
    }

    @Override
    public void update() {
        System.out.println("百度天气更新如下");
        System.out.println("=======");
        System.out.print("温度：" + weatherSubject.getTempurature());
        System.out.print(" 湿度：" + weatherSubject.getHumidity());
        System.out.println(" 气压：" + weatherSubject.getPressure());
        System.out.println("=======");
    }

    @Override
    public void access() {
        System.out.println("百度接入了" + weatherSubject.getSubject() + "接口");
    }
}
