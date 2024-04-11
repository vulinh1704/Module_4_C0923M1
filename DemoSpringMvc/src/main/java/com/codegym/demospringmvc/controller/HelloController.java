package com.codegym.demospringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public ModelAndView showHello() {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("name", "Hello world");
        return modelAndView;
    }
}


//class Address {
//
//}
//class Student {
//    Address address; // = new Address();
//
//    Student(Address address) {
//        this.address = address;
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        // bean
//        Address a2 = new Address();
//        Student student = new Student(a2);
//    }
//}
