package com.codegym.demospringboot.service.impl;

import com.codegym.demospringboot.model.Student;
import com.codegym.demospringboot.repository.StudentRepository;
import com.codegym.demospringboot.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        return studentOptional.get();
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void remove(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> findAllByAge(int from, int to) {
        return null;
    }

    @Override
    public List<Student> findByNameContaining(String name) {
        return studentRepository.findByNameContaining(name);
    }

    @Override
    public Student findByIdCustom(Long id) {
        return studentRepository.findByIdCustom(id);
    }

    @Override
    public List<Student> findByClassRoom_Id(Long idClass) {
        return this.studentRepository.findByClassRoom_Id(idClass);
    }
}
