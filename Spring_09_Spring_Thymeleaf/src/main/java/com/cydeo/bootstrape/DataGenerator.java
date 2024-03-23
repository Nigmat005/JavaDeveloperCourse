package com.cydeo.bootstrape;

import com.cydeo.model.Student;
import com.github.javafaker.Faker;

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


}
