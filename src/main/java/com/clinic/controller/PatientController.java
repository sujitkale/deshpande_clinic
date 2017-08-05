package com.clinic.controller;

import com.clinic.entity.Patient;
import com.clinic.service.IPatientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class PatientController {
    @Autowired
    private IPatientService patientService;
    
    @GetMapping("patients")
    public ResponseEntity<List<Patient>> getAllPatients() {
        List<Patient> patients =  patientService.getAllPatients();
        return new ResponseEntity<>(patients, HttpStatus.OK);
    }
}
