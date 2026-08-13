package com.anudip.placement_management_system.service.impl;

import com.anudip.placement_management_system.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}
