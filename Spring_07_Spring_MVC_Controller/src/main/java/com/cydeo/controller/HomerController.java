package com.cydeo.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Component
public class HomerController {
   @RequestMapping("/home")
    public String home(){
        return "home.html";
    }

    @RequestMapping("/welcomePage")
    public String welcomePage(){
        return "welcomePage.html";
    }
}
