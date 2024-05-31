package com.example.demo.service;

import com.example.demo.entity.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    List<Course> findAll();
    Optional<Course> findById(Integer id);
    Course save(Course course);
    void deleteById(Integer id);
}
