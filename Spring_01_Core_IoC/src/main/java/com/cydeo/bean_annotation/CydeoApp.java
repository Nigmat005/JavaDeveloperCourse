package com.cydeo.bean_annotation;

import lombok.ToString;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Objects;


public class CydeoApp {
    public static void main(String[] args) {
        // Create Container 1.BeanFactory 2.ApplicationContext (We use ApplicationContext over BeanFactory since ApplicationContext has all functionalities of BeanFactory)

        ApplicationContext applicationContext_Container=new AnnotationConfigApplicationContext(configuration.class,configurationAny.class);
        FullTimeMentor fullTimeMentor = applicationContext_Container.getBean(FullTimeMentor.class);
        fullTimeMentor.createAccount();

        PartTimeMentor partTimeMentor = applicationContext_Container.getBean(PartTimeMentor.class);
        partTimeMentor.createAccount();


//        applicationContext_Container.getBean(ExtraInfo.class);
//        fullTimeMentor.printExtraInfo(applicationContext_Container.getBean(ExtraInfo.class));

        fullTimeMentor.printExtraInfo();

        System.out.println(Objects.requireNonNull(applicationContext_Container.getClassLoader()).getClass().getName());

        String str = applicationContext_Container.getBean("string",String.class);
        System.out.println(str);


        String str2 = applicationContext_Container.getBean("string2",String.class);
        System.out.println(str2);

        Integer integer=applicationContext_Container.getBean(Integer.class);
        System.out.println(integer);

        Integer integer2=applicationContext_Container.getBean("integer2",Integer.class);
        System.out.println(integer2);




    }
}
