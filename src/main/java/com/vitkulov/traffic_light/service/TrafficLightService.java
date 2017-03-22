package com.vitkulov.traffic_light.service;

import com.vitkulov.traffic_light.model.entity.TrafficLight;
import com.vitkulov.traffic_light.model.repository.TrafficLightRepository;
import com.vitkulov.traffic_light.model.repository.TrafficLightRepositoryImpl;

public interface TrafficLightService {

    void addNewTrafficLight(TrafficLight trafficLight);

    TrafficLight getTrafficLight(int number);
}
