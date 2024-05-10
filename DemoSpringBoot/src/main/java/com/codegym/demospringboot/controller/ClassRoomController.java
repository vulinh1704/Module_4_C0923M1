package com.codegym.demospringboot.controller;

import com.codegym.demospringboot.model.ClassRoom;
import com.codegym.demospringboot.model.Student;
import com.codegym.demospringboot.service.IClassRoomService;
import com.codegym.demospringboot.service.IStudentService;
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
@RequestMapping("/classRooms")
public class ClassRoomController {


    @Autowired
    private IClassRoomService classRoomService;

    @GetMapping("")
    public ResponseEntity<List<ClassRoom>> getAll() {
        List<ClassRoom> list = classRoomService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
