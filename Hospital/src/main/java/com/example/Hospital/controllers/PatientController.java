package com.example.Hospital.controllers;

import com.example.Hospital.Service.PatientService;
import com.example.Hospital.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/patients")
public class PatientController {

//    HashMap<Integer, Patient> patients = new HashMap<>();
//    @GetMapping("/hello-world")
//    public String helloworld(){
//        return "Hello world from PatientController";
//    }
//    @PostMapping("")
//    public String addPatient(@RequestBody Patient patient){
//
//        int key = patient.getId();
//        patients.put(key, patient);
//        return "patient added successfully";
//    }
//        @GetMapping("/all")
//         public List<Patient> getAll(){
//        return new ArrayList<>(patients.values());
//    }
//    @GetMapping("{patientId}")
//    public Patient getPatient(@PathVariable int patientId){
//        return patients.get(patientId);
//    }
//    @GetMapping("")
//    public Patient getPatientbyQuery(@RequestParam int patientId){
//        return patients.get(patientId);
//    }
    // crud *

    @Autowired
    private PatientService patientService;

    @GetMapping("/all")
    public List<Patient> getAllPatient(){
        return patientService.getAllPatients();
    }
    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable int id){
        return patientService.getPatientById(id);
    }
    @PostMapping
    public Patient addpatient(@RequestBody Patient patient){
        return patientService.addPatient(patient);
    }

    @PutMapping
    public Patient updatepatient(@RequestBody Patient patient){
        return patientService.updatePatient(patient);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable int id){
        patientService.deletePatient(id);
    }

}




















