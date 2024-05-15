package com.codegym.demospringboot.service.impl;

import com.codegym.demospringboot.model.Student;
import com.codegym.demospringboot.model.Subject;
import com.codegym.demospringboot.repository.StudentRepository;
import com.codegym.demospringboot.repository.SubjectRepository;
import com.codegym.demospringboot.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public List<Student> findAll() {
        String status = "ACTIVE";
        return studentRepository.findAllByStatus(status);
    }

    @Override
    public Student findById(Long id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        return studentOptional.get();
    }

    @Override
    public void save(Student student) {
        // Lấy danh sách các môn học có trong Db;
        Set<Subject> subjectList = student.getSubjects();
        if (!subjectList.isEmpty()) {
            Set<Subject> managedSubject = new HashSet<>();
            for (Subject subject : subjectList) {
                if (subject.getId() != null) {
                    Optional<Subject> s = subjectRepository.findById(subject.getId());
                    managedSubject.add(s.get());
                }
            }
            student.setSubjects(managedSubject);
        }
        studentRepository.save(student);
    }

    @Override
    public void remove(Long id) {
        Student student = studentRepository.findById(id).get();
        student.setStatus("DELETED");
        studentRepository.save(student);
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
