package com.fosuchao.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/8 20:19
 */
public class WeatherSubject {
    private static final String SUBJECT = "天气";
    private Float tempurature;
    private Float humidity;
    private Float pressure;
    private List<Observer> observers;

    WeatherSubject() {
        init();
    }

    private void init() {
        this.tempurature = 0f;
        this.humidity = 0f;
        this.pressure = 0f;
        this.observers = new ArrayList<>();
    }

    public void setState(float tempurature, float humidity,
                         float pressure) {
        System.out.println("更新总台天气");
        setHumidity(humidity);
        setTempurature(tempurature);
        setPressure(pressure);
        notiryAll();
    }

    public void notiryAll() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void register(Observer observer) {
        observers.add(observer);
        observer.access();
    }

    public Float getTempurature() {
        return tempurature;
    }

    public void setTempurature(Float tempurature) {
        this.tempurature = tempurature;
    }

    public Float getHumidity() {
        return humidity;
    }

    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }

    public Float getPressure() {
        return pressure;
    }

    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    public String getSubject() {
        return SUBJECT;
    }
}
