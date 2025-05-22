package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "STUDENT")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "STUDENT_ID")
    private long studentID;
    @Column(name = "FRIST_NAME",length = 20)
    private String firstName;
    @Column(name = "LAST_NAME",length = 20)
    private String lastName;
    @Column(name = "AGE")
    private int age;
    @Column(name = "GRADE")
    private int grade;
    @Column(name = "ADDRESS")
    private String address;
}
