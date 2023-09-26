package org.mafideju.worldinfo.dao.implementation;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.mafideju.worldinfo.dao.type.CityDAO;
import org.mafideju.worldinfo.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CityDAOImpl implements CityDAO {

    private EntityManager entityManager;

    @Autowired
    public CityDAOImpl(EntityManager entityManager) {
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
        return query.getResultList();
    }
}
