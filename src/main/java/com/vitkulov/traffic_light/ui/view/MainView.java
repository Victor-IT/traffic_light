package com.vitkulov.traffic_light.ui.view;

import com.vitkulov.traffic_light.ui.controller.MainController;

public interface MainView {

    void setController(MainController controller);

    void programTrafficLight(int number);
}
