package com.cydeo.controller;

import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
        return "/mentor/mentor-register";
    }
}
