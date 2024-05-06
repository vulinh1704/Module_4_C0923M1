package com.codegym.demospringboot.controller;

import com.codegym.demospringboot.model.Student;
import com.codegym.demospringboot.service.IClassRoomService;
import com.codegym.demospringboot.service.IStudentService;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @Autowired
    private IClassRoomService classRoomService;

    @GetMapping("")
    public ResponseEntity<List<Student>> getAll() {
        List<Student> list = studentService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<String> add(@RequestBody Student student) {
        studentService.save(student);
        String message = "Add success";
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<String> edit(@PathVariable Long id, @RequestBody Student student) {
        student.setId(id);
        studentService.save(student);
        String message = "Edit success";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        studentService.remove(id);
        String message = "Deleted success";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }


    @GetMapping("{id}")
    public ResponseEntity<Student> findById(@PathVariable Long id) {
        Student student = studentService.findById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }


    @GetMapping("/search")
    public ResponseEntity<List<Student>> search(@RequestParam("name") String name) {
        List<Student> list = studentService.findByNameContaining(name);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/classes/{id}")
    public ResponseEntity<List<Student>> search(@PathVariable Long id) {
        List<Student> list = studentService.findByClassRoom_Id(id);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
