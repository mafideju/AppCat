package org.mars.geodatarest.repository;

import org.mars.geodatarest.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {
}
