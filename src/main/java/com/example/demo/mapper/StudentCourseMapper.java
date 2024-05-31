package com.example.demo.mapper;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.entity.StudentCourse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentCourseMapper {
    void deleteByStudent(Integer id);
    void deleteByCourse(Integer id);

    void add(StudentCourse studentCourse);

    List<Course> findByStudentId(Integer id);
}
