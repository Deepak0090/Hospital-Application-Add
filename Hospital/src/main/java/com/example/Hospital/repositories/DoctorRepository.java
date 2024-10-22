package com.example.Hospital.repositories;


import com.example.Hospital.entities.Doctor;
import org.springframework.stereotype.Repository;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class DoctorRepository {
      private HashMap<Integer, Doctor>  doctorHashMap = new HashMap<>();
      private int idCounter=1;
      public List<Doctor> getAllDoctor(){
          return new ArrayList<>(doctorHashMap.values());
      }
      public Doctor getDoctorById(int id){
          return doctorHashMap.get(id);
      }

      public Doctor addDoctor(Doctor doctor){
          doctor.setId(idCounter++);
          doctorHashMap.put(doctor.getId(), doctor);
          return doctor;
      }
      public Doctor updateDoctor(Doctor doctor){
          return doctorHashMap.put(doctor.getId(),doctor);
      }
      public Doctor deleteDoctor(int id){
          return doctorHashMap.remove(id);
      }

    }

