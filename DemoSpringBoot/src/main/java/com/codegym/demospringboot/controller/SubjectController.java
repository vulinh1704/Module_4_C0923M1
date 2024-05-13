package com.codegym.demospringboot.controller;

import com.codegym.demospringboot.model.ClassRoom;
import com.codegym.demospringboot.model.Subject;
import com.codegym.demospringboot.service.IClassRoomService;
import com.codegym.demospringboot.service.IStudentService;
import com.codegym.demospringboot.service.ISubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@CrossOrigin("*")
@RequestMapping("/subjects")
public class SubjectController {


    @Autowired
    private ISubjectService subjectService;

    @GetMapping("")
    public ResponseEntity<List<Subject>> getAll() {
        List<Subject> list = subjectService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}

