package com.cydeo.bootstrape;

import com.cydeo.model.Car;
import com.cydeo.model.Student;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataGenerator {
    public static Faker javaFaker;
    public static List<Student> students;
    public static List<Student> createStudent(){
        return students;
    };


    static {
        javaFaker = new Faker();
        students = List.of(
                new Student(javaFaker.name().firstName(), javaFaker.name().lastName(), javaFaker.number().numberBetween(18, 60), javaFaker.address().state())
                , new Student(javaFaker.name().firstName(), javaFaker.name().lastName(), javaFaker.number().numberBetween(18, 60), javaFaker.address().state())
                , new Student(javaFaker.name().firstName(), javaFaker.name().lastName(), javaFaker.number().numberBetween(18, 60), javaFaker.address().state())
                , new Student(javaFaker.name().firstName(), javaFaker.name().lastName(), javaFaker.number().numberBetween(18, 60), javaFaker.address().state())

        );
    }

    public static List<Car> createCar(){
       List<Car> cars= Arrays.asList(
               new Car("Audi","Q7",2022),
               new Car("Benz","GLC",2020),
               new Car("BMW","X5",2021)
       );
       return cars;
    };


}
