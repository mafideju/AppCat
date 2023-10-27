package org.mars.geodatarest.controller;

import org.mars.geodatarest.entity.City;
import org.mars.geodatarest.exception.CityNotFoundException;
import org.mars.geodatarest.service.CityServicePlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public Optional<City> getCityById(@PathVariable int cityID) {
        Optional<City> city = cityService.findById(cityID);

        if (cityID < 0) {
            throw new CityNotFoundException("Cidade não encontrada, ID -" + cityID + "- desconhecida.");
        }

        return city;
    }

    @PostMapping("/cities")
    public City save(@RequestBody City city) {
//        city.setId(0);

        return cityService.save(city);
    }

    @PutMapping("/cities")
    public City updateCity(@RequestBody City city) {

        return cityService.save(city);
    }

    @DeleteMapping("/cities/{cityId}")
    public void deleteCity(@PathVariable int cityId) {
        Optional<City> city = cityService.findById(cityId);

        if (city.isEmpty()) {
            throw new CityNotFoundException("Cidade não encontrada, ID -" + cityId + "- desconhecida.");
        }

        cityService.deleteById(cityId);
    }

}
