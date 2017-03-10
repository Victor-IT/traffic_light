package com.vitkulov.traffic_light.model.entity;

/**
 * Created by vitkulov on 10.03.2017.
 */
public class TrafficLight {
    private int number;

    private int redTime;
    private int yellowTime;
    private int greenTime;

    public TrafficLight(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int getRedTime() {
        return redTime;
    }

    public void setRedTime(int time) {
        this.redTime = time;
    }

    public int getYellowTime() {
        return yellowTime;
    }

    public void setYellowTime(int time) {
        this.yellowTime = time;
    }

    public int getGreenTime() {
        return greenTime;
    }

    public void setGreenTime(int time) {
        this.greenTime = time;
    }
}
