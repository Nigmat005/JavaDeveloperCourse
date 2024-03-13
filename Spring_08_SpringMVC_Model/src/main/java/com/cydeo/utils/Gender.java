package com.cydeo.utils;

import lombok.Data;
import lombok.Getter;

@Getter
public enum Gender {
    MALE("MALE",1),FEMALE("FEMALE",2);
    public String genderType;
    public int indicator;
    Gender(String genderType,int indicator){
        this.genderType=genderType;
        this.indicator=indicator;
    }
}
