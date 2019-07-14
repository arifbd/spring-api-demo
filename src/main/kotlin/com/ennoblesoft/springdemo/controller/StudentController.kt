package com.ennoblesoft.springdemo.controller

import com.ennoblesoft.springdemo.entity.Student
import com.ennoblesoft.springdemo.exception.CustomException
import com.ennoblesoft.springdemo.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus.OK
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1")
class StudentController {
    @Autowired
    internal var studentService: StudentService? = null

    @GetMapping("/student")
    @Throws(CustomException::class)
    operator fun get(@RequestParam("name") name: String): List<Student>? {
        val studentList = studentService?.get(name)
        return if (studentList != null && studentList.isEmpty())
            throw CustomException("No Student Found")
        else
            studentList
    }

    @PostMapping("/student")
    @ResponseStatus(value = OK)
    fun create(@RequestBody s: Student): Student {
        return studentService!!.create(s)
    }
}
