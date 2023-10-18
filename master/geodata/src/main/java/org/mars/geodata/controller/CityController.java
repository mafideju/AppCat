package org.mars.geodata.controller;

import org.mars.geodata.entity.City;
import org.mars.geodata.exception.CityNotFoundException;
import org.mars.geodata.repository.CityDAO;
import org.mars.geodata.service.CityServicePlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CityController {

    private CityServicePlan cityService;

    @Autowired
    public CityController(CityServicePlan cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/cities")
    public List<City> findAll() {
        List<City> cities = cityService.findAll();

        return cities;
    }

    @GetMapping("/cities/{cityID}")
    public City getCityById(@PathVariable int cityID) {
        City city = cityService.findById(cityID);

        if (cityID < 0) {
            throw new CityNotFoundException("Cidade não encontrada, ID -" + cityID + "- desconhecida.");
        }

        return city;
    }

    @PostMapping("/cities")
    public City save(@RequestBody City city) {
        city.setId(0);

        return cityService.save(city);
    }

    @PutMapping("/cities")
    public City updateCity(@RequestBody City city) {

        return cityService.save(city);
    }

    @DeleteMapping("/cities/{cityId}")
    public void deleteCity(@PathVariable int cityId) {
        City city = cityService.findById(cityId);

        if (city ==  null) {
            throw new CityNotFoundException("Cidade não encontrada, ID -" + cityId + "- desconhecida.");
        }

        cityService.deleteById(cityId);
    }

}
