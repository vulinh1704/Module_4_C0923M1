package com.codegym.orm.service;

import com.codegym.orm.model.Student;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IStudentService extends IGenerateService<Student> {
    List<Student> findAllByAge(int from, int to);

    List<Student> findByNameContaining(String name);

    Student findByIdCustom(@Param("id") Long id);
}
