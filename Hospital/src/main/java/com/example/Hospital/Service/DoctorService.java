package com.example.Hospital.Service;


import com.example.Hospital.entities.Doctor;
import com.example.Hospital.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAllDoctor(){
        return doctorRepository.getAllDoctor();
    }
    public Doctor getDoctorById(int id){
        return doctorRepository.getDoctorById(id);
    }
    public Doctor saveDoctor(Doctor doctor){
        return doctorRepository.addDoctor(doctor);
    }
    public Doctor updateDoctor(Doctor doctor){
        return doctorRepository.updateDoctor(doctor);
    }
    public void deletDoctor(int id){
        doctorRepository.deleteDoctor(id);
    }

}
