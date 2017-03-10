package com.vitkulov.traffic_light.service;

import com.vitkulov.traffic_light.model.entity.TrafficLight;
import com.vitkulov.traffic_light.model.repository.TrafficLightRepository;
import com.vitkulov.traffic_light.model.repository.TrafficLightRepositoryImpl;

/**
 * Created by vitkulov on 10.03.2017.
 */
public interface TrafficLightService {

    void addNewTrafficLight(TrafficLight trafficLight);

    TrafficLight getTrafficLight(int number);
}
