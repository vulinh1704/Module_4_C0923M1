package com.codegym.demospringboot.repository;

import com.codegym.demospringboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findAllByStatus(String status);
    Student findByName(String name);

    List<Student> findByNameContaining(String name);

    List<Student> findByAgeBetween(int from, int to);

    Student findByNameAndAgeAndScore(String name, int age, double score);

    List<Student> findByClassRoom_Id(Long id);

    @Query(value = "select * from student where id = :id", nativeQuery = true)
    Student findByIdCustom(@Param("id") Long id);
}