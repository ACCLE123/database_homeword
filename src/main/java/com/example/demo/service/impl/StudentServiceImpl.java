package com.example.demo.service.impl;

import com.example.demo.entity.Result;
import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAll() {
        return studentMapper.selectAllStudents();
    }

    @Override
    public Student findById(Integer id) {
        return studentMapper.selectStudentById(id);
    }

    @Override
    public void save(Student student) {
        studentMapper.insertStudent(student);
    }

    @Override
    public void deleteById(Integer id) {
        studentMapper.deleteStudent(id);
    }

    @Override
    public void updateById(Student student) {
        studentMapper.updateStudent(student);
    }
}
