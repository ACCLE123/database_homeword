package com.example.demo.entity;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Student {
    private Integer id;
    private String name;
}
