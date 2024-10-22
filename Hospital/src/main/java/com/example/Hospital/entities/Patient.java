package com.example.Hospital.entities;

import lombok.Data;

@Data
public class Patient {
    private int id;
    private String name;
    private String disease;
    private Integer age;
    private Integer doctorId;

}
