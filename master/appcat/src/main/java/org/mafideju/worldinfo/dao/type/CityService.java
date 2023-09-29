package org.mafideju.worldinfo.dao.type;

import org.mafideju.worldinfo.entity.City;

import java.util.List;

public interface CityService {

    void save(City city);
    List<City> findAll();
    List<City> findByCity(String city);

    City findById(Integer id);

    City updateCity(City city);
    void deleteCity(Integer id);
}
