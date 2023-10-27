package org.mars.geodatarest.repository;

import org.mars.geodatarest.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "cities")
public interface CityRepository extends JpaRepository<City, Integer> {
}
