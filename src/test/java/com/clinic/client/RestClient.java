package com.clinic.client;

import com.clinic.entity.Patient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestClient {
    public void getAllPatients() {
	HttpHeaders headers = new HttpHeaders();
	headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
	String url = "http://localhost:8080/user/patients";
        HttpEntity<String> requestEntity = new HttpEntity<>(headers);
        ResponseEntity<Patient[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Patient[].class);
        Patient[] patients = responseEntity.getBody();
        for(Patient patient : patients) {
              System.out.println("Id:"+patient.getId()+", Fname:"+patient.getFname()
                      +", Lname: "+patient.getLname() + ", Gender:"+patient.getGender());
        }
    }
}
