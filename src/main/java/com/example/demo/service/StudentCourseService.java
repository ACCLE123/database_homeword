package com.example.demo.service;

import com.example.demo.entity.Course;
import com.example.demo.entity.StudentCourse;

import java.util.List;

public interface StudentCourseService {

    void save(StudentCourse studentCourse);

    List<Course> findByStudentId(Integer id);
}
