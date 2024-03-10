package com.cydeo.Bean_Annotation;

import com.cydeo.Bean_Annotation.Car;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

//@Data
@Getter
@Setter
@ToString
@Data
public class Person {
    private String name;
    private Car car;
//    @Autowired
//    public Person(Car car) {
//        this.car = car;
//    }
}
