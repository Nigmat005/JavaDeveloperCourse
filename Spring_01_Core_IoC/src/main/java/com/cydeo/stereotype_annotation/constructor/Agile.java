package com.cydeo.stereotype_annotation.constructor;

import org.springframework.stereotype.Component;

@Component
public class Agile {
    public void getTeachingHours(){
        System.out.println("Teaching hours is: "+200);
    }
}
