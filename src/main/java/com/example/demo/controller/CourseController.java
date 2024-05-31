package com.example.demo.controller;

import com.example.demo.entity.Result;
import com.example.demo.entity.Course;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public Result<List<Course>> findAll() {
        List<Course> courses = courseService.findAll();
        return Result.success(courses);
    }

    @GetMapping("/{id}")
    public Result<Course> findById(@PathVariable Integer id) {
        Course course = courseService.findById(id);
        if (course != null) {
            return Result.success(course);
        } else {
            return Result.failure("Course not found with id " + id);
        }
    }

    @PostMapping
    public Result<Void> save(@RequestBody Course course) {
        courseService.save(course);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result<Void> deleteById(@PathVariable Integer id) {
        courseService.deleteById(id);
        return Result.success(null);
    }

    @PutMapping()
    public Result<Void> updateById(@RequestBody Course course) {
        courseService.updateById(course);
        return Result.success();
    }
}
