package com.example.demo.student;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

    private final Integer studentId;
    private final String studentName;

    public Student(Integer studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

}
