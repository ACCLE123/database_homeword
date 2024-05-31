package com.example.demo.mapper;

import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {
    Student selectStudentById(Integer id);
    List<Student> selectAllStudents();
    void insertStudent(Student student);
    void updateStudent(Student student);

    void deleteStudent(Integer id);
}
