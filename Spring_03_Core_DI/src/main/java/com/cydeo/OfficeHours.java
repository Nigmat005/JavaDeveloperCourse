package com.cydeo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours {
    public int getHours(){
        return 5;
    }
}
