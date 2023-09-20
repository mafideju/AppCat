package org.mafideju.worldinfo.dao.implementation;

import jakarta.persistence.EntityManager;
import org.mafideju.worldinfo.dao.type.CountryService;
import org.mafideju.worldinfo.entity.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CountryRepository implements CountryService {
    private final EntityManager entityManager;

    @Autowired
    public CountryRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Country country) {
        entityManager.persist(country);
    }
}
