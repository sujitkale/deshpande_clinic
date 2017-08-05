package com.clinic.service;

import com.clinic.dao.IPatientDao;
import com.clinic.entity.Patient;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService implements IPatientService {

    @Autowired
    private IPatientDao patientDao;

    @Override
    public List<Patient> getAllPatients() {
        return patientDao.getAllPatients();
    }

}
