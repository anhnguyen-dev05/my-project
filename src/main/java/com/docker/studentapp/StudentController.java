package com.docker.studentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo studentRepo;

    @RequestMapping("/getStudents")
    public List<Student> getStudent() {



        
        return studentRepo.findAll();
    }

    @RequestMapping("/addStudent")
    public Student addStudent() {
        Student student = new Student();
        student.setAge(21);
        student.setName("Daniel");
        return studentRepo.save(student);
    }
}
