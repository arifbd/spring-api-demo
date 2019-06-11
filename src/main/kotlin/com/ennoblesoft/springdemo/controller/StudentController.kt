package com.ennoblesoft.springdemo.controller

import com.ennoblesoft.springdemo.entity.Student
import com.ennoblesoft.springdemo.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

import org.springframework.http.HttpStatus.OK

@RestController
@RequestMapping("/api/v1")
class StudentController {
    @Autowired
    internal var studentService: StudentService? = null

    @GetMapping("/student")
    operator fun get(@RequestParam("name") name: String): List<Student> {
        return studentService!![name]
    }

    @PostMapping("/student")
    @ResponseStatus(value = OK)
    fun create(@RequestBody s: Student): Student {
        return studentService!!.create(s)
    }
}
