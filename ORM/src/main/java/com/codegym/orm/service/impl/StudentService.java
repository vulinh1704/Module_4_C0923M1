package com.codegym.orm.service.impl;

import com.codegym.orm.model.Student;
import com.codegym.orm.repository.IStudentRepository;
import com.codegym.orm.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return null;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public List<Student> findAllByAge(int from, int to) {
        return null;
    }
}
