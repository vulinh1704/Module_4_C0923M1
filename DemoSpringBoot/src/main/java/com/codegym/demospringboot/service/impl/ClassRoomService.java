package com.codegym.demospringboot.service.impl;

import com.codegym.demospringboot.model.ClassRoom;
import com.codegym.demospringboot.repository.ClassRoomRepository;
import com.codegym.demospringboot.service.IClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassRoomService implements IClassRoomService {
    @Autowired
    private ClassRoomRepository classRoomRepository;
    @Override
    public List<ClassRoom> findAll() {
        return classRoomRepository.findAll();
    }

    @Override
    public ClassRoom findById(Long id) {
        return null;
    }

    @Override
    public void save(ClassRoom classRoom) {

    }

    @Override
    public void remove(Long id) {

    }
}
