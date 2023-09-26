package org.mafideju.worldinfo.dao.type;

import org.mafideju.worldinfo.entity.City;

import java.util.List;

public interface CityDAO {

    void save(City city);
    City findById(Integer id);

    List<City> findAll();
}
