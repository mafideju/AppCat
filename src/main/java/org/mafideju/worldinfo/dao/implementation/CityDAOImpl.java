package org.mafideju.worldinfo.dao.implementation;

import jakarta.persistence.EntityManager;
import org.mafideju.worldinfo.dao.type.CityDAO;
import org.mafideju.worldinfo.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
}
