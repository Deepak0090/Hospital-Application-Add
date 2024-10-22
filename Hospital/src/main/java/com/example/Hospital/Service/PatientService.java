package com.example.Hospital.Service;

import com.example.Hospital.entities.Doctor;
import com.example.Hospital.entities.Patient;
import com.example.Hospital.repositories.DoctorRepository;
import com.example.Hospital.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Patient> getAllPatients(){
        return patientRepository.getAllPatients();
    }
    public Patient getPatientById(int id){
        return patientRepository.getPatientbyId(id);
    }
    public Patient addPatient(Patient patient){
        Doctor doctor = doctorRepository.getDoctorById(patient.getDoctorId());
        if (doctor==null) return null;

        Patient patientEntity = patientRepository.addPatient(patient);
        if (doctor.getPatients()==null){
            doctor.setPatients(new ArrayList<Patient>());
            doctor.getPatients().add(patientEntity);
        }else{
            doctor.getPatients().add(patientEntity);
        }
        doctorRepository.updateDoctor(doctor);
        return patientEntity;
    }
    public Patient updatePatient(Patient patient){

        return patientRepository.updatePatient(patient);

    }
      public Patient patchpatient(Patient patient){
        Patient oldPatient = patientRepository.getPatientbyId(patient.getId());

        if (oldPatient==null) return null;

        if(patient.getName()!= null){
            oldPatient.setName(patient.getName());
        }
        if (patient.getAge() != null){
            oldPatient.setAge(patient.getAge());
        }
        if (patient.getDisease()!=null){
            oldPatient.setDisease(patient.getDisease());
        }
        return patientRepository.updatePatient(oldPatient);
      }
//      public Patient putPatint(Patient patient){
//         // need to do the code
//      }
    public Patient deletePatient(Integer id){
        return patientRepository.deletePatient(id);
    }
}
