package com.codegym.orm.controller;

import com.codegym.orm.model.Student;
import com.codegym.orm.service.IGenerateService;
import com.codegym.orm.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private IStudentService studentService;
    @GetMapping("")
    public ModelAndView showHome() {
        List<Student> list = studentService.findAll();
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("list", list);
        return modelAndView;
    }
}
