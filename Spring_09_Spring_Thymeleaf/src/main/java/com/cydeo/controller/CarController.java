package com.cydeo.controller;

import com.cydeo.bootstrape.DataGenerator;
import com.cydeo.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class CarController {



//   @RequestMapping("/info") //localhost:8080/car/info?make=honda
//   public String carInfo(
//           @RequestParam String make,
//           @RequestParam String carModel,
//           @RequestParam Integer year
//           ,Model model){ // variable name myst be same as requesr Parameter name
//
//       model.addAttribute("make",make);
//       model.addAttribute("carModel",carModel);
//       model.addAttribute("year",year);
//       System.out.println("Make is: "+make+"\nModel is: "+carModel+"\nYear is: "+year);
//       return "car/car-info";
//    }

    @RequestMapping("/Home")
    public String Car(Model model){
        model.addAttribute("carObject",DataGenerator.createCar());
        return "/car/customerWelcome";
    }
//    @RequestMapping("/Info")
//    public String CarInfo(@RequestParam(value = "carMake") String make,
//                          @RequestParam(value = "carModel") String carModel,
//                          @RequestParam(value = "producedYear")int year,
//                          Model model){
//         Car car=new Car(make,carModel,year);
//         model.addAttribute("car",car);
//        System.out.println("carMake is: "+make+"\n carModel is:"+carModel+"\n producedYear is: "+year);
//
//       return "/car/car-info";

    @RequestMapping("/Info/{carMake}/{carModel}/{producedYear}")
    public String CarInfo(@PathVariable(value = "carMake") String make,
                          @PathVariable(value = "carModel") String carModel,
                          @PathVariable(value = "producedYear")int year,
                          Model model){
        Car car=new Car(make,carModel,year);
        model.addAttribute("car",car);
        System.out.println("carMake is: "+make+"\n carModel is:"+carModel+"\n producedYear is: "+year);

        return "/car/car-info";
  }
}
