package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/user")
    public String userInfo(){
        return "user/userInfo.html"; // go to folder static and look over there, that's why you have to add fold of user in path
    }
}
