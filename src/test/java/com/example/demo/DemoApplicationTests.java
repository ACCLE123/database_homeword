package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.concurrent.Callable;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    void contextLoads() {
        System.out.println("hello world");
    }

    @Test
    void func1() {
        List<Student> all = studentRepository.findAll();
        System.out.println(all);
    }

}
