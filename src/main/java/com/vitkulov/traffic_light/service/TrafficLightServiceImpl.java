package com.vitkulov.traffic_light.service;

import com.vitkulov.traffic_light.model.entity.TrafficLight;
import com.vitkulov.traffic_light.model.repository.TrafficLightRepository;
import com.vitkulov.traffic_light.model.repository.TrafficLightRepositoryImpl;

/**
 * Created by vitkulov on 10.03.2017.
 */
public class TrafficLightServiceImpl implements TrafficLightService {
    private TrafficLightRepository repository = new TrafficLightRepositoryImpl();

    @Override
    public void addNewTrafficLight(TrafficLight trafficLight) {
        repository.save(trafficLight);
    }

    @Override
    public TrafficLight getTrafficLight(int number) {
        return repository.findByNumber(number);
    }
}
