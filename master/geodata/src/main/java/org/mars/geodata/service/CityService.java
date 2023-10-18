package org.mars.geodata.service;

import org.mars.geodata.entity.City;
import org.mars.geodata.repository.CityDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CityService implements CityServicePlan {

    private CityDAO cityDAO;

    @Autowired
    public CityService(CityDAO cityDAO) {
        this.cityDAO = cityDAO;
    }

    @Override
    public List<City> findAll() {
        return cityDAO.findAll();
    }

    @Override
    public City findById(int cityId) {
        return cityDAO.findById(cityId);
    }

    @Transactional
    @Override
    public City save(City city) {
        return cityDAO.save(city);
    }

    @Transactional
    @Override
    public void deleteById(int cityId) {
        cityDAO.deleteById(cityId);
    }


}
