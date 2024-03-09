package com.cydeo.bean_annotation;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.function.Consumer;
@Data
public class FullTimeMentor  {
    @NonNull
   private final ExtraInfo extraInfo;
//    public FullTimeMentor(@NonNull ExtraInfo extraInfo) {
//        this.extraInfo = extraInfo;
//    }
    public void createAccount(){
        System.out.println("Full Time Mentor Is Created!");
    }

//    public void printExtraInfo(ExtraInfo extraInfo){
//        System.out.println("Extra info is "+extraInfo.message());
//    }
   public void printExtraInfo(){
    System.out.println("Extra info is "+extraInfo.message());
}
}
