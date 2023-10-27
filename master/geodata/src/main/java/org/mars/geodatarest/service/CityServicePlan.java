package org.mars.geodatarest.service;

import org.mars.geodatarest.entity.City;

import java.util.List;
import java.util.Optional;

public interface CityServicePlan {

    List<City> findAll();
    Optional<City> findById(int cityId);

    City save(City city);

    void deleteById(int cityId);
}
