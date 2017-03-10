package com.vitkulov.traffic_light.model.repository;

import com.vitkulov.traffic_light.model.entity.TrafficLight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by vitkulov on 10.03.2017.
 */
public class TrafficLightRepositoryImpl implements TrafficLightRepository {

    private List<TrafficLight> trafficLightList = new ArrayList<>();

    @Override
    public void save(TrafficLight trafficLight) {
        trafficLightList.add(trafficLight);
    }

    @Override
    public TrafficLight findByNumber(int number) {
        for (TrafficLight trafficLight : trafficLightList) {
            if (trafficLight.getNumber() == number) {
                return trafficLight;
            }
        }

        return null;
    }

    @Override
    public Collection<TrafficLight> getAllTrafficLight() {
        return trafficLightList;
    }

}
