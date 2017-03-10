package com.vitkulov.traffic_light.model.repository;

import com.vitkulov.traffic_light.model.entity.TrafficLight;

import java.util.Collection;

/**
 * Created by vitkulov on 10.03.2017.
 */
public interface TrafficLightRepository {
    void save (TrafficLight trafficLight);

    TrafficLight findByNumber(int number);

    Collection<TrafficLight> getAllTrafficLight();
}
