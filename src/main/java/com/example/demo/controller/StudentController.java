package com.example.demo.controller;

import com.example.demo.entity.Result;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public Result<List<Student>> findAll() {
        List<Student> students = studentService.findAll();
        return Result.success(students);
    }

    @GetMapping("/{id}")
    public Result<Student> findById(@PathVariable Integer id) {
        Student student = studentService.findById(id);
        if (student != null) {
            return Result.success(student);
        } else {
            return Result.failure("Student not found with id " + id);
        }
    }

    @PostMapping
    public Result<Void> save(@RequestBody Student student) {
        studentService.save(student);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result<Void> deleteById(@PathVariable Integer id) {
        studentService.deleteById(id);
        return Result.success(null);
    }

    @PutMapping()
    public Result<Void> updateById(@RequestBody Student student) {
        studentService.updateById(student);
        return Result.success();
    }
}
