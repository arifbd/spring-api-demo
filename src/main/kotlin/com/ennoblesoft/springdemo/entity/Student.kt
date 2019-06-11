package com.ennoblesoft.springdemo.entity

import javax.persistence.Entity

@Entity
class Student(
        var name: String? = null,
        var mobile: String? = null
) : BaseEntity()
