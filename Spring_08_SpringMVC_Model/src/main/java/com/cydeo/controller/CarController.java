package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class CarController {

   @RequestMapping("/info") //localhost:8080/car/info?make=honda
   public String carInfo(
           @RequestParam String make,
           @RequestParam String carModel,
           @RequestParam Integer year
           ,Model model){ // variable name myst be same as requester Parameter name

       model.addAttribute("make",make);
       model.addAttribute("carModel",carModel);
       model.addAttribute("year",year);
       System.out.println("Make is: "+make+"\nModel is: "+carModel+"\nYear is: "+year);
       return "car/car-info";
    }

    @RequestMapping("/infoOptional")  // localhost:8080/car/InfoOptional?carMake="Toyota"&carModel="Camry"&producedYear="2015"
    public String carInfoOptional(
            @RequestParam(value = "carMake",required = false,defaultValue = "Tesla") String make,
            @RequestParam (value = "carModel",required = false,defaultValue = "ModelY")String carModel,
            @RequestParam(value = "producedYear",required = false,defaultValue = "2024") Integer year
            ,Model model){ // variable name myst be same as requesr Parameter name

        model.addAttribute("make",make);
        model.addAttribute("carModel",carModel);
        model.addAttribute("year",year);
        System.out.println("Make is: "+make+"\nModel is: "+carModel+"\nYear is: "+year);
        return "car/car-info";
    }

    @RequestMapping("/carInfo/{carMake}/{carModel}/{producedYear}") // localhost:8080/car/carInfo/Tesla/ModelY/2025
    public String getCarInfo(
            // for pathParameter it ,unlike the requestParameter, can NOT be empty.
            @PathVariable(value = "carMake") String make,
            @PathVariable (value = "carModel")String carModel,
            @PathVariable(value = "producedYear") Integer year
            ,Model model){ // variable name myst be same as request Parameter name

        model.addAttribute("make",make);
        model.addAttribute("carModel",carModel);
        model.addAttribute("year",year);
        System.out.println("Make is: "+make+"\nModel is: "+carModel+"\nYear is: "+year);
        return "car/car-info";
    }
}
