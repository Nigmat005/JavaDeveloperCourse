package com.cydeo.spring_07_spring_mvc_controller;

public class Child extends Parent{
    String name;
    Child (String name){
        this();
        this.name=name;
    }

    Child (){
        super();
    }

    public static void main(String[] args) {
        System.out.println(new Child("Nick").name);
    }
}
