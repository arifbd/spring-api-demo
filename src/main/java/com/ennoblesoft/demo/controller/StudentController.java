package com.ennoblesoft.demo.controller;

import com.ennoblesoft.demo.entity.Student;
import com.ennoblesoft.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/student")
    public List<Student> get(@RequestParam("name") String name) {
        return studentService.get(name);
    }

    @PostMapping("/student")
    @ResponseStatus(value = OK)
    public Student create(@RequestBody Student s) {
        return studentService.create(s);
    }
}
