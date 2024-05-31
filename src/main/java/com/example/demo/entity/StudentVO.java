package com.example.demo.entity;

import lombok.Data;

@Data
public class StudentVO {
    private String studentName;
    private String courseName;
    private Integer weekday;
    private Integer startHour;
    private Integer startMinute;
    private Integer endHour;
    private Integer endMinute;
    private Integer grade;
}
