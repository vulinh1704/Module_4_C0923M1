package com.codegym.orm.repository;

import com.codegym.orm.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByName(String name);

    List<Student> findByNameContaining(String name);

    List<Student> findByAgeBetween(int from, int to);

    Student findByNameAndAgeAndScore(String name, int age, double score);
    // hành động + by + tên thuộc tính + điều kiện

    @Query(value = "select * from student where id = :id", nativeQuery = true)
    Student findByIdCustom(@Param("id") Long id);
}