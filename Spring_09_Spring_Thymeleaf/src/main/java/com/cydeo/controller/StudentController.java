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
    @RequestMapping("/welcomePage")
    public String homePage(Model model) {// I want to send data to HTML(Need to use Model Interface).

        //template Engine (which is thymeleaf) A template engine is a dependency that allows you to easily get and display in
        //the view variable data that the controller sends.

        //Model Method
        String value = "Template Engine (which is thymeleaf) A template engine is a dependency that allows you to easily get and display in " +
                "the view variable data that the controller sends.";
        model.addAttribute("definition", value);
        model.addAttribute("course", "Spring_MVC");
        return "studentFile/welcome";
    }
}
