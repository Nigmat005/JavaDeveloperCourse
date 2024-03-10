package com.cydeo.Bean_Annotation;

import com.cydeo.Bean_Annotation.Car;
import com.cydeo.Bean_Annotation.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    Car car(){
       Car car=new Car();
       car.setMake("Honda");
       return car;
    }

    // Direct Wiring
//    @Bean
//    Person person(){
//        Person person=new Person();
//        person.setName("Nick");
//        person.setCar(car());
//        return person;
//    }

    @Bean
    @Autowired
    public Person person(Car car){
        Person person=new Person();
        person.setName("Nick");
        person.setCar(car);
        return person;
    }
}
