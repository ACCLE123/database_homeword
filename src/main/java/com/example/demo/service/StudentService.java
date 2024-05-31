package com.example.demo.service;

import com.example.demo.entity.Result;
import com.example.demo.entity.Student;
import com.example.demo.entity.StudentVO;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> findAll();
    Student findById(Integer id);
    void save(Student student);
    void deleteById(Integer id);

    void updateById(Student student);

    List<StudentVO> findAllCourse();
}
