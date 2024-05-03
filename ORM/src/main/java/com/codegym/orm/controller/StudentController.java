package com.codegym.orm.controller;

import com.codegym.orm.model.ClassRoom;
import com.codegym.orm.model.Student;
import com.codegym.orm.service.IClassRoomService;
import com.codegym.orm.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @Autowired
    private IClassRoomService classRoomService;
    @GetMapping("")
    public ModelAndView showHome() {
        List<Student> list = studentService.findAll();
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    @GetMapping("/add")
    public ModelAndView showFromAdd() {
        ModelAndView modelAndView = new ModelAndView("add");
        List<ClassRoom> classRooms = classRoomService.findAll();
        Student student = new Student();
        modelAndView.addObject("student", student);
        modelAndView.addObject("classRooms", classRooms);
        return modelAndView;
    }

    @PostMapping("/add")
    public String add(@ModelAttribute @Validated Student student, BindingResult bindingResult) {
        if(bindingResult.hasFieldErrors()) {
            return "add";
        }
        studentService.save(student);
        return "";
    }

    @GetMapping("/edit")
    public String edit() {
        Student student = new Student(3L,"C10", 20, 10.0);
        studentService.save(student);
        return "";
    }

    @GetMapping("/delte")
    public String remove() {
        studentService.remove(3L);
        return "";
    }

    @GetMapping("/search")
    public String search() {
        String name = "in";
        List<Student> list = studentService.findByNameContaining(name);
        return "";
    }

    @GetMapping("/custom")
    public String custom() {
        Student student = studentService.findByIdCustom(1L);
        return "";
    }
}
