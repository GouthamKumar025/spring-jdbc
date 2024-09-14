package com.example.SpringJDBCEx.service;

import com.example.SpringJDBCEx.repository.StudentRepository;
import com.example.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentServices {

    private StudentRepository repo;
    public StudentRepository getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepository repo) {
        this.repo = repo;
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }

    public void addStudent(Student s) {
        System.out.println("Added");
        repo.save(s);
        System.out.println(getStudents());

    }

}
