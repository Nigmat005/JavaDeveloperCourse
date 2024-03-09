package com.cydeo.bean_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configuration {

    @Bean
     FullTimeMentor fullTimeMentor(){
       return new FullTimeMentor(extraInfo());
    }


    @Bean
    public PartTimeMentor partTimeMentor(){
        return new PartTimeMentor();
    }

    @Bean
    public ExtraInfo extraInfo(){
        return new ExtraInfo();
    }

}
