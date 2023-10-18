package org.mars.geodata.service;

import org.mars.geodata.entity.City;

import java.util.List;

public interface CityServicePlan {

    List<City> findAll();
    City findById(int cityId);

    City save(City city);

    void deleteById(int cityId);
}
