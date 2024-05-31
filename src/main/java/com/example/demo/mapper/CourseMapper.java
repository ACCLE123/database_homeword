package com.example.demo.mapper;

import com.example.demo.entity.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper {
    Course selectCourseById(Integer id);
    List<Course> selectAllCourses();
    void insertCourse(Course course);
    void updateCourse(Course course);

    void deleteCourse(Integer id);
}
