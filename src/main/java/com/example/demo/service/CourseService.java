package com.example.demo.service;

import com.example.demo.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> findAll();
    Course findById(Integer id);
    void save(Course course);
    void deleteById(Integer id);

    void updateById(Course course);
}
