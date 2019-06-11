package com.ennoblesoft.demo.repository;

import com.ennoblesoft.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query(value = "SELECT s from Student s where s.name LIKE CONCAT('%', :name, '%') ")
    List<Student> findByName(@Param("name") String name);
}
