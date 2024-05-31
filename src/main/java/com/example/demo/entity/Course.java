package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "db_course")
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private Integer weekday;
    private Integer startHour;
    private Integer startMinute;
    private Integer endHour;
    private Integer endMinute;

//    @OneToMany(mappedBy = "course")

    private Set<StudentCourse> studentCourses;
}
