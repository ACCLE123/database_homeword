package com.example.demo.service.impl;

import com.example.demo.entity.Course;
import com.example.demo.entity.StudentCourse;
import com.example.demo.mapper.StudentCourseMapper;
import com.example.demo.service.StudentCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentCourseServiceImpl implements StudentCourseService {
    @Autowired
    private StudentCourseMapper studentCourseMapper;

    @Override
    public void save(StudentCourse studentCourse) {
        studentCourseMapper.add(studentCourse);
    }

    @Override
    public List<Course> findByStudentId(Integer id) {
        return studentCourseMapper.findByStudentId(id);
    }
}
