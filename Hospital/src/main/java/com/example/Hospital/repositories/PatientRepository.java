package com.example.Hospital.repositories;

import com.example.Hospital.entities.Patient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class PatientRepository {
    private HashMap<Integer, Patient> petients = new HashMap<>();
    private int idCounter=1;

    public List<Patient> getAllPatients(){
        return new ArrayList<>(petients.values());
    }
    public Patient getPatientbyId(int id){
        return petients.get(id);
    }
    public Patient addPatient(Patient patient){
        patient.setId(idCounter++);
        petients.put(patient.getId(),patient);
        return patient;
    }
    public Patient updatePatient(Patient patient){
        return petients.put(patient.getId(),patient);
    }
    public Patient deletePatient(Integer id){
        return petients.remove(id);
    }
}
