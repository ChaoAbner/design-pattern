package com.fosuchao.observer;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/8 20:31
 */
public class Client {
    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();

        new TencentWeather(weatherSubject);
        new BaiduWeather(weatherSubject);

        weatherSubject.setState(30f, 79f, 82f);
        weatherSubject.setState(31f, 68f, 77f);
    }
}
