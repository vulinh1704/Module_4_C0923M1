package com.codegym.orm.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "Không được để trống")
    @Size(min = 3, max = 20, message = "Tên phải chứa 3 - 20 ký tự")
    private String name;
//    @NotEmpty(message = "Không được để trống")
    @Min(value = 18, message = "Ít nhất 18 tủi")
    private Integer age;
    private double score;

    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$",message = "Phải theo ding dang test@gmail.com")
    private String email;

    @ManyToOne
    private ClassRoom classRoom;
    public Student() {
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public Student(Long id, String name, Integer age, double score, String email, ClassRoom classRoom) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
        this.email = email;
        this.classRoom = classRoom;
    }

    public Student(Long id, String name, int age, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public Student(Long id, String name, Integer age, double score, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
        this.email = email;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
//    public Student(Long id, String name, int age, double score, ClassRoom classRoom) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.score = score;
//        this.classRoom = classRoom;
//    }
//
//
//    public ClassRoom getClassRoom() {
//        return classRoom;
//    }
//
//    public void setClassRoom(ClassRoom classRoom) {
//        this.classRoom = classRoom;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
