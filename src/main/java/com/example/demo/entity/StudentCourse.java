package com.example.demo.entity;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class StudentCourse {
    @Id
    private Integer id;
    private Integer studentId;
    private Integer courseId;
    private Integer grade;
}
