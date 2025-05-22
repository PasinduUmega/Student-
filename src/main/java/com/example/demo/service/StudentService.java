package com.example.demo.service;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentDao studentDao;

    public ResponseEntity<Student> saveStudent(Student student){
        student = studentDao.save(student);

        if (false) {
            throw new RuntimeException("Student save request failed");
        } else {
            return ResponseEntity.ok(student);
        }
    }
    public ResponseEntity<List<Student>> getAllStudents(){
        List<Student> studentList = studentDao.findAll();
        return ResponseEntity.ok(studentList);
    }

}



