package com.example.tutorial2.student;

import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

    public List<Student> getStudentList() {
        List<Student> students = new java.util.ArrayList<>();
        students.add(new Student("daisuke", 21));
        return students;
    }
}
