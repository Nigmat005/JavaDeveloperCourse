package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configurationAny {
    @Bean
    String string(){
        return "developer";
    }


    @Bean
    Integer integer(){
        return 1000000;
    }
}
