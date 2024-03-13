package com.cydeo.controller;

import com.cydeo.utils.Gender;
import com.cydeo.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cydeoTask")
public class taskController {
    @RequestMapping("/task")
    public String task(Model model){
//        Task Mike=new Task("Mike", "Smith", 45,Gender.MALE.getGenderType()  );
//        Task Tom=new Task("Tom", "Hanks", 65,Gender.MALE.getGenderType()  );
//        Task Ammy=new Task("Ammy", "Bryan", 25,Gender.FEMALE.getGenderType()  );


        Task Mike=new Task("Mike", "Smith", 45,Gender.MALE);
        Task Tom=new Task("Tom", "Hanks", 65,Gender.MALE);
        Task Ammy=new Task("Ammy", "Bryan", 25,Gender.FEMALE);
        model.addAttribute("Mike",Mike);
        model.addAttribute("Tom",Tom);
        model.addAttribute("Ammy",Ammy);
        return "/task/cydeoTask";
    }
}
