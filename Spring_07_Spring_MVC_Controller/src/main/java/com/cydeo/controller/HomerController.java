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
// if name is not giving in @RequestMapping annotation, it will add "/" by default and will still run whatever is returned
    @RequestMapping
    public String defaultPage(){
        return "welcomePage.html";
    }
}
