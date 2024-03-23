package com.cydeo.controller;

import com.cydeo.bootstrape.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping( "/register")
    public String register(Model model){
        // bind data with Model
        model.addAttribute("student", DataGenerator.createStudent());
        return "/studentFile/registerPage";
    }
}
