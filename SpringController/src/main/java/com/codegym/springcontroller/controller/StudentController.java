package com.codegym.springcontroller.controller;

import com.codegym.springcontroller.model.Student;
import com.codegym.springcontroller.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    //    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @GetMapping("/home")
    public ModelAndView showHome() {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("name", "Hello");
        return modelAndView;
    }


    @GetMapping("/showPathVariable/{id}") // //showPathVariable/1
    public ModelAndView showPathVariable(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("showPath");
        modelAndView.addObject("idStudent", id);
        return modelAndView;
    }


    @GetMapping("/showParam") // /showParam?name=Linh
    public ModelAndView showParam(@RequestParam String name, @RequestParam int age) {
        ModelAndView modelAndView = new ModelAndView("showParam");
        modelAndView.addObject("name", name);
        modelAndView.addObject("age", age);
        return modelAndView;
    }


    @GetMapping("/add")
    public ModelAndView showFormAdd() {
        ModelAndView modelAndView = new ModelAndView("add");
        Student student = new Student();
        modelAndView.addObject("student", student);
        return modelAndView;
    }


    @PostMapping("/add")
    public ModelAndView addStudent(@ModelAttribute Student student) {
        System.out.println(student);
        return new ModelAndView();
    }
}
