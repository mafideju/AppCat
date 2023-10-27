package org.mars.geodatarest.service;

import org.mars.geodatarest.entity.City;
import org.mars.geodatarest.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService implements CityServicePlan {

    private CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public Optional<City> findById(int cityId) {
        return cityRepository.findById(cityId);
    }

    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }

    @Override
    public void deleteById(int cityId) {
        cityRepository.deleteById(cityId);
    }


}
