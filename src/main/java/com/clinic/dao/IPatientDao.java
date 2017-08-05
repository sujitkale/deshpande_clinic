package com.clinic.dao;

import com.clinic.entity.Patient;
import java.util.List;

/**
 *
 * @author 32863
 */
public interface IPatientDao {
    
    List<Patient> getAllPatients();
    
}
