package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class configurationAny {
    @Bean(name = "string")
    String string(){
        return "developer";
    }

    @Bean(name = "string2")
    String string2(){
        return "Time to learn how to deal with same object in container";
    }


    // usage of primary annotation
    @Bean
    @Primary
    Integer integer(){
        return 1000000;
    }

    @Bean(name = "integer2")
    Integer integer2(){
        return 100;
    }
}
