package org.mafideju.worldinfo.dao.implementation;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.mafideju.worldinfo.dao.type.CityService;
import org.mafideju.worldinfo.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CityRepository implements CityService {

    private EntityManager entityManager;

    @Autowired
    public CityRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(City city) {
        entityManager.persist(city);
    }

    @Override
    public City findById(Integer id) {
        return entityManager.find(City.class, id);
    }

    @Override
    public List<City> findAll() {
        TypedQuery<City> query = entityManager.createQuery("FROM City", City.class);
//        order by countryCode
        return query.getResultList();
    }

    @Override
    public List<City> findByCity(String city) {
        TypedQuery<City> query = entityManager.createQuery("FROM City WHERE name=:cityName", City.class);
        query.setParameter("cityName", city);

        return query.getResultList();
    }

    @Override
    @Transactional
    public City updateCity(City city) {
//        City newCity = entityManager.find(City.class, 1);
//        city.setName("São Bernardo do Campo");
//        city.setCountryCode("BRA");
//        city.setDistrict("ABC Paulista");

        return entityManager.merge(city);
    }

    @Override
    @Transactional
    public void deleteCity(Integer id) {
        City city1 = entityManager.find(City.class, id);
        entityManager.remove(city1);
    }
}
