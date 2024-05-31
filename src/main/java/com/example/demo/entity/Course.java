package com.example.demo.entity;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Course {
    @Id
    private Integer id;
    private String name;
    private Integer weekday;
    private Integer startHour;
    private Integer startMinute;
    private Integer endHour;
    private Integer endMinute;
}
