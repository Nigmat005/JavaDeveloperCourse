package com.cydeo.stereotype_annotation;

import com.cydeo.stereotype_annotation.constructor.Agile;
import com.cydeo.stereotype_annotation.constructor.Java;
import com.cydeo.stereotype_annotation.constructor.Selenium;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class cydeoApp {
    public static void main(String[] args) {
        ApplicationContext container=new AnnotationConfigApplicationContext(Config.class);

        FullTimeMentor fullTimeMentor=container.getBean(FullTimeMentor.class);
        fullTimeMentor.create();

        PartTimeMentor partTimeMentor=container.getBean(PartTimeMentor.class);
        partTimeMentor.create();

        Java java=container.getBean(Java.class);
        java.getTeachingHours();
        Agile agile=container.getBean(Agile.class);
        agile.getTeachingHours();
        Selenium selenium=container.getBean(Selenium.class);
        selenium.getTeachingHours();

        String s = container.getBean(String.class);
        System.out.println(s);

        String s2 = container.getBean("check_compatibility",String.class);
        System.out.println(s2);




    }
}
