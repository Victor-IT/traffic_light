package com.vitkulov.traffic_light.ui.view;

import com.vitkulov.traffic_light.ui.controller.MainController;

/**
 * Created by vitkulov on 10.03.2017.
 */
public interface MainView {

    void setController(MainController controller);

    void programTrafficLight(int number);
}
