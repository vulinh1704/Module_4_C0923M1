package com.codegym.demomvc.controller;

import com.codegym.demomvc.model.Student;
import com.codegym.demomvc.service.IService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private IService<Student> studentIService;

    @GetMapping("/search")
    public ModelAndView showHomeSearch(@RequestParam String nameSearch) {
        List<Student> list = this.studentIService.searchByName(nameSearch);
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("list", list);
        return modelAndView;
    }
    @GetMapping("")
    public ModelAndView showHome() {
        ModelAndView modelAndView = new ModelAndView("home");
        List<Student> list = studentIService.findAll();
        modelAndView.addObject("list", list);
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
    public String addStudent(@ModelAttribute Student student) {
        this.studentIService.add(student);
        return "redirect:/students";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showFormEdit(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("edit");
        Student student = this.studentIService.findById(id);
        modelAndView.addObject("student", student);
        return modelAndView;
    }

    @PostMapping("/edit")
    public String editStudent(@ModelAttribute Student student) {
       this.studentIService.edit(student.getId(), student);
       return "redirect:/students";
    }
}
