package com.vitkulov.traffic_light.model.repository;

import com.vitkulov.traffic_light.model.entity.TrafficLight;

import java.util.Collection;

public interface TrafficLightRepository {
    void save (TrafficLight trafficLight);

    TrafficLight findByNumber(int number);

    Collection<TrafficLight> getAllTrafficLight();
}
