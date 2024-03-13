package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
    @RequestMapping("/welcomePage")
    public String homePage(Model model) {// I want to send data to HTML(Need to use Model Interface).

        //template Engine (which is thymeleaf) A template engine is a dependency that allows you to easily get and display in
        //the view variable data that the controller sends.

        //Model Method
        String value = "Template Engine (which is thymeleaf) A template engine is a dependency that allows you to easily get and display in " +
                "the view variable data that the controller sends.";
        model.addAttribute("definition", value);
        model.addAttribute("course", "Spring_MVC");
        return "student/welcome";
    }
}
