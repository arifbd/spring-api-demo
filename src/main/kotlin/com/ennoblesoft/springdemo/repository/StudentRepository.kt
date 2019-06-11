package com.ennoblesoft.springdemo.repository

import com.ennoblesoft.springdemo.entity.Student
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository : JpaRepository<Student, Long> {
    @Query(value = "SELECT s from Student s where s.name LIKE CONCAT('%', :name, '%') ")
    fun findByName(@Param("name") name: String): List<Student>
}
