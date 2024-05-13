package com.codegym.demospringboot.service.impl;

import com.codegym.demospringboot.model.Subject;
import com.codegym.demospringboot.repository.SubjectRepository;
import com.codegym.demospringboot.service.ISubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService implements ISubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public List<Subject> findAll() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject findById(Long id) {
        return null;
    }

    @Override
    public void save(Subject subject) {

    }

    @Override
    public void remove(Long id) {

    }
}
