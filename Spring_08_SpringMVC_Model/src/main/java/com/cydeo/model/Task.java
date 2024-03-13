package com.cydeo.model;

import com.cydeo.utils.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task {
    private String firstName;
    private String lastName;
    private int age;
//    private String GenderType;
    private Gender GenderType;
}
