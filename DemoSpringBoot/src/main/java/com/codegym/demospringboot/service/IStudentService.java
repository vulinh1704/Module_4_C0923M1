package com.codegym.demospringboot.service;
import com.codegym.demospringboot.model.Student;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IStudentService extends IGenerateService<Student> {
    List<Student> findAllByAge(int from, int to);

    List<Student> findByNameContaining(String name);

    Student findByIdCustom(Long id);
    List<Student> findByClassRoom_Id(Long id);
}
