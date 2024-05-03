package com.codegym.orm.service.impl;

import com.codegym.orm.model.ClassRoom;
import com.codegym.orm.repository.ClassRoomRepository;
import com.codegym.orm.service.IClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
//@Transactional
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
