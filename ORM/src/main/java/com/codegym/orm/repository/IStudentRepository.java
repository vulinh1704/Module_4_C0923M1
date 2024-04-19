package com.codegym.orm.repository;

import com.codegym.orm.model.Student;

import java.util.List;

public interface IStudentRepository extends IGenerateRepository<Student> {
    List<Student> findAllByAge(int from, int to);
}
