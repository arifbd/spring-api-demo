package com.ennoblesoft.demo.service;

import com.ennoblesoft.demo.entity.Student;
import com.ennoblesoft.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    public StudentRepository studentRepository;

    public Student create(Student s) {
        return studentRepository.save(s);
    }

    public List<Student> get(String name) {
        return studentRepository.findByName(name);
    }
}
