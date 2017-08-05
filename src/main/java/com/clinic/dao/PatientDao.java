package com.clinic.dao;

import com.clinic.entity.Patient;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class PatientDao implements IPatientDao {

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @Override
    public List<Patient> getAllPatients() {
        String hql = " FROM Patient as pm ORDER BY pm.id";
        return (List<Patient>) entityManager.createQuery(hql).getResultList();
    }

}
