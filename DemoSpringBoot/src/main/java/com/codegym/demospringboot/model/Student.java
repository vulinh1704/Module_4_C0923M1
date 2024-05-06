package com.codegym.demospringboot.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private double score;
    private String email;

    @ManyToOne
    private ClassRoom classRoom;
}
