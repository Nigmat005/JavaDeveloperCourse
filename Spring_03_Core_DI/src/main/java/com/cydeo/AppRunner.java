package com.cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppRunner {
    public static void main(String[] args) {
        ApplicationContext container=new AnnotationConfigApplicationContext(Config.class);
        Java java = container.getBean(Java.class);
//        java.getTeachingHours(container.getBean(OfficeHours.class));
      java.getTeachingHours();

    }
}
