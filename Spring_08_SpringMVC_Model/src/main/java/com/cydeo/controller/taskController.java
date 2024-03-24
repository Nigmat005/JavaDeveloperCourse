package com.cydeo.controller;

import com.cydeo.utils.Gender;
import com.cydeo.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        List<Task> taskList=new ArrayList<>(Arrays.asList(Mike,Tom,Ammy));
        model.addAttribute("taskObject",taskList);
        return "/task/cydeoTask";
    }
}
