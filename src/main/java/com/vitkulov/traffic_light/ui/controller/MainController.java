package com.vitkulov.traffic_light.ui.controller;

import com.vitkulov.traffic_light.model.entity.TrafficLight;
import com.vitkulov.traffic_light.service.TrafficLightService;
import com.vitkulov.traffic_light.ui.view.MainView;

/**
 * Created by vitkulov on 10.03.2017.
 */
public class MainController {
    private TrafficLightService service;
    private MainView mainView;

    public MainController(TrafficLightService service) {
        this.service = service;
    }

    public void setMainView(MainView view) {
        this.mainView = view;
    }

    public void setRedTime(int number, int time) {
        service.getTrafficLight(number).setRedTime(time);
    }

    public void setYellowTime(int number, int time) {
        service.getTrafficLight(number).setYellowTime(time);
    }

    public void setGreenTime(int number, int time) {
        service.getTrafficLight(number).setGreenTime(time);
    }

    public void turnOnTrafficLight(int number) {
        TrafficLight trafficLight = service.getTrafficLight(number);
        try {
            System.out.println("Горит Зеленый! " + trafficLight.getGreenTime() + " сек.");
            Thread.sleep(trafficLight.getGreenTime() * 1000);
            System.out.println("Горит Желтый! " + trafficLight.getYellowTime() + " сек.");
            Thread.sleep(trafficLight.getYellowTime() * 1000);
            System.out.println("Горит Красный! " + trafficLight.getRedTime() + " сек.");
            Thread.sleep(trafficLight.getRedTime() * 1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
