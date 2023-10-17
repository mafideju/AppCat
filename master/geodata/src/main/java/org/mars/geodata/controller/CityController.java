package org.mars.geodata.controller;

import org.mars.geodata.entity.City;
import org.mars.geodata.exception.CityErrorResponse;
import org.mars.geodata.exception.CityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CityController {

    @GetMapping("/cities")
    public List<City> getCities() {
        List<City> cities = new ArrayList<>();

        cities.add(new City("São Bernardo do Campo", "BRA"));
        cities.add(new City("São Paulo", "BRA"));
        cities.add(new City("New York", "USA"));

        return cities;
    }

    @GetMapping("/cities/{cityID}")
    public City getCityById(@PathVariable int cityID) {
        List<City> city = new ArrayList<>();

        city.add(new City("São Bernardo do Campo", "BRA"));
        city.add(new City("São Paulo", "BRA"));
        city.add(new City("New York", "USA"));

        if ((cityID >= city.size()) || (cityID < 0)) {
            throw new CityNotFoundException("Cidade não encontrada, ID -" + cityID + "- desconhecida.");
        }

        return city.get(cityID);
    }

}
