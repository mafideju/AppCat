package org.mars.geodata.repository;

import org.mars.geodata.entity.City;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CityDAO {

    List<City> findAll();
    City findById(int cityId);

    City save(City city);

    void deleteById(int cityId);
}
