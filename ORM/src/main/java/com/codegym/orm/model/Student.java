package com.codegym.orm.model;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private double score;

//    @ManyToOne
//    private ClassRoom classRoom;

    public Student() {
    }

    public Student(Long id, String name, int age, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
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
