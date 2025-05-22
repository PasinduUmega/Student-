package com.example.demo.controller;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;
    private final StudentDao studentDao;

    @PostMapping
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
    @GetMapping
      public ResponseEntity<List<Student>> getAllStudents(){
        List<Student> studentList = studentDao.findAll();
        return studentService.getAllStudents();
    }

}
