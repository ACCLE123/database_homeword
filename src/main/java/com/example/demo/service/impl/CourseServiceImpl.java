package com.example.demo.service.impl;

import com.example.demo.entity.Course;
import com.example.demo.mapper.CourseMapper;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> findAll() {
        return courseMapper.selectAllCourses();
    }

    @Override
    public Course findById(Integer id) {
        return courseMapper.selectCourseById(id);
    }

    @Override
    public void save(Course course) {
        courseMapper.insertCourse(course);
    }

    @Override
    public void deleteById(Integer id) {
        courseMapper.deleteCourse(id);
    }

    @Override
    public void updateById(Course course) {
        courseMapper.updateCourse(course);
    }
}
