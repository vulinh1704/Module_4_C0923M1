package com.codegym.demomvc.service.impl;

import com.codegym.demomvc.model.Student;
import com.codegym.demomvc.service.IService;

import java.util.ArrayList;
import java.util.List;

public class StudentService  implements IService<Student> {
    private List<Student> list = new ArrayList<>();

    public StudentService() {
        list.add(new Student(1, "Linh", 18, 1.0));
        list.add(new Student(2, "Vu Linh", 19, 2.0));
    }

    @Override
    public void add(Student student) {
        list.add(student);
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        this.list.remove(index);
    }

    @Override
    public void edit(int id, Student student) {
        int index = findIndexById(id);
        this.list.set(index, student);
    }

    @Override
    public List<Student> findAll() {
        return this.list;
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < this.list.size(); i++) {
            if(id == this.list.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Student findById(int id) {
        int index = findIndexById(id);
        return this.list.get(index);
    }

    @Override
    public List<Student> searchByName(String name) {
        List<Student> newList = new ArrayList<>();
        for (Student s: list) {
            if(s.getName().toLowerCase().contains(name.toLowerCase())) {
                newList.add(s);
            }
        }
        return newList;
    }
}
