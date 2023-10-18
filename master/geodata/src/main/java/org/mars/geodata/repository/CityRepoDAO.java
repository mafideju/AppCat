package org.mars.geodata.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.mars.geodata.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CityRepoDAO implements CityDAO {

    private EntityManager entityManager;

    @Autowired
    public CityRepoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<City> findAll() {
        TypedQuery<City> query = entityManager.createQuery("FROM City", City.class);

        List<City> cities = query.getResultList();

        return cities;
    }

    @Override
    public City findById(int cityId) {

        return entityManager.find(City.class, cityId);
    }

    @Override
    public City save(City city) {
        return entityManager.merge(city);
    }

    @Override
    public void deleteById(int cityId) {
        City city = entityManager.find(City.class, cityId);

        entityManager.remove(city);
    }

}
