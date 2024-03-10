package com.cydeo.stereotype_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class PartTimeMentor {
    public void create(){
        System.out.println("StereoTypeAnnotation: Part Time Mentor is Created!");
    }
}
