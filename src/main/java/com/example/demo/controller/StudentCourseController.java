package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.entity.Result;
import com.example.demo.entity.Student;
import com.example.demo.entity.StudentCourse;
import com.example.demo.service.StudentCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/studentCourses")
public class StudentCourseController {

    @Autowired
    private StudentCourseService studentCourseService;

    @PostMapping()
    public Result<Void> save(@RequestBody StudentCourse studentCourse) {
        studentCourseService.save(studentCourse);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result<List<Course>> findByStudentId(@PathVariable Integer id) {
        List<Course> courses = studentCourseService.findByStudentId(id);
        return Result.success(courses);
    }
}
