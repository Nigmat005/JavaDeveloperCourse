package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
@RequestMapping("/student")
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


    @RequestMapping(value = "/Id")
    public String studentID(Model model) {
//        Random random=new Random();
//        int IdNum=random.nextInt(1000);
//        model.addAttribute("studentID",IdNum);
        double random=Math.random();
        int min=0; int max=1000;
        int IdNum=(int)(random*(max-min+1)+min);
        model.addAttribute("studentID",IdNum);
        return "student/studentId";
    }


    @RequestMapping(value = "/task") //  /localhost:8080/student/task
    public String studentID2( Model model) {
        Student student=new Student(1,"Mike", "Smith");
        model.addAttribute("student",student);
        return "student/studentId";
    }
}
