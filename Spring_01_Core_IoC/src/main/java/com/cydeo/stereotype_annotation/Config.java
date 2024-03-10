package com.cydeo.stereotype_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.cydeo.stereotype_annotation")
public class Config {

    @Bean
    @Primary
    String string1(){
       return "Try if @Bean would work with @component, seems like it does work";
    }

    @Bean(name = "check_compatibility")
    String string2(){
        return "Try we would meeting same situation using @Bean without having name for same object";
    }

}
