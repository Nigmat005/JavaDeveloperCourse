package com.cydeo.Bean_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
        ApplicationContext container=new AnnotationConfigApplicationContext(Config.class);

        Car carBean = container.getBean(Car.class);
        Person personBean = container.getBean(Person.class);

        System.out.println(personBean);

        System.out.println(carBean);

    }
}
