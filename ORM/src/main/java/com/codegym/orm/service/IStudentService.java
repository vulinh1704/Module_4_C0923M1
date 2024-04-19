package com.codegym.orm.service;

import com.codegym.orm.model.Student;

import java.util.List;

public interface IStudentService extends IGenerateService<Student> {
    List<Student> findAllByAge(int from, int to);
}
