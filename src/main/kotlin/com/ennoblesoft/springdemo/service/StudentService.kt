package com.ennoblesoft.springdemo.service

import com.ennoblesoft.springdemo.entity.Student
import com.ennoblesoft.springdemo.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService {
    @Autowired
    var studentRepository: StudentRepository? = null

    fun create(s: Student): Student {
        return studentRepository!!.save(s)
    }

    operator fun get(name: String): List<Student> {
        return studentRepository!!.findByName(name)
    }
}
