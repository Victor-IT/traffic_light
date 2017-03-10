package com.vitkulov.traffic_light;

import com.vitkulov.traffic_light.model.entity.TrafficLight;
import com.vitkulov.traffic_light.service.TrafficLightService;
import com.vitkulov.traffic_light.service.TrafficLightServiceImpl;
import com.vitkulov.traffic_light.ui.controller.MainController;
import com.vitkulov.traffic_light.ui.view.MainViewImpl;

/**
 * Created by vitkulov on 10.03.2017.
 */
public class RunApp {
    public static void main(String[] args) {

        // initial data
        TrafficLight trafficLight = new TrafficLight(1);
        TrafficLightService service = new TrafficLightServiceImpl();
        service.addNewTrafficLight(trafficLight);

        MainController controller = new MainController(service);
        MainViewImpl mainView = new MainViewImpl(controller);

        // program and turnOn trafficLight number 1
        mainView.programTrafficLight(1);
        mainView.turnOnTrafficLight(1);
    }
}
