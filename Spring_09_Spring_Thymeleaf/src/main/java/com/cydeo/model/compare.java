package com.cydeo.model;

import com.cydeo.bootstrape.DataGenerator;
import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class compare {

    public static Comparator<Student> compareStudent() {
        Comparator<Student> com = (Student student1, Student student2) -> {
            if (student1.getAge() > student1.getAge()) {
                return 1;
            } else {
                return -1;
            }
        };
        return com;
    }

    public static void main(String[] args) {
//        Comparator<Student> com=(Student s1,Student s2)->{
//            if(s1.getAge()>s2.getAge()){
//                return 1;
//            }
//            else {
//                return -1;
//            }
//        };
        Faker javaFaker =new Faker();
       List<Student> students = Arrays.asList(
               new Student(javaFaker.name().firstName(), javaFaker.name().lastName(), 39, javaFaker.address().state())
               , new Student(javaFaker.name().firstName(), javaFaker.name().lastName(), 27, javaFaker.address().state())
               , new Student(javaFaker.name().firstName(), javaFaker.name().lastName(), 25, javaFaker.address().state())
               , new Student(javaFaker.name().firstName(), javaFaker.name().lastName(),18, javaFaker.address().state())

       );

        System.out.println("Unsorted");
        for(Student eachStudent: students){
            System.out.println(eachStudent);
        }
        System.out.println("sorted");
        Collections.sort(students, compareStudent());
        for(Student eachStudent: students){
            System.out.println(eachStudent);
        }
    }
}
