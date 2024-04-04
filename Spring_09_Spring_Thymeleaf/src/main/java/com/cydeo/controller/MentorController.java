package com.cydeo.controller;

import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping(value = "/mentor")
public class MentorController {

    @GetMapping(value = "/register")
    public String showForm(Model model){
        List<String> batchList= Arrays.asList("JD1","JD2","JD6","EU1","EU2","B18","B20");
        model.addAttribute("batch",batchList);
        model.addAttribute("mentor",new Mentor());
//        when load form page, all getter methods will be called, and when click submit button, all setter method will be called
//        model.addAttribute("mentor",new Mentor("Nick","Smith","123456789@gmail.com","Male","JD6",true,"Infosys"));
        return "/mentor/mentor-register";
    }
//    @PostMapping(value = "/confirm")
//    public String showForm2(Model model){
//
//        return "/mentor/mentor-confirm";
//    }


//    @PostMapping(value = "/register")
//    public String showForm2(@ModelAttribute("mentor") Mentor mentor,Model model){
//        System.out.println(mentor);
//        model.addAttribute("newMentor",mentor);
//        return "/mentor/mentor-confirm";
//    }

    @PostMapping(value = "/register")
    public String showForm2(@ModelAttribute("mentor") Mentor mentor,Model model){
        System.out.println(mentor);
        model.addAttribute("newMentor",mentor);
        return "redirect:/mentor/register";
    }

}
