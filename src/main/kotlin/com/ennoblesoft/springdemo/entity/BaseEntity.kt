package com.ennoblesoft.springdemo.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import com.google.gson.GsonBuilder
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp

import javax.persistence.*
import java.io.Serializable
import java.util.Date

@MappedSuperclass
open class BaseEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false)
        var id: Long? = null,

        @JsonIgnore
        @CreationTimestamp
        var createdAt: Date? = null,

        @JsonIgnore
        @UpdateTimestamp
        var updatedAt: Date? = null

) : Serializable {
    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}