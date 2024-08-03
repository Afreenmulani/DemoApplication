package com.demo.DemoApplication.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.DemoApplication.Repository.StudentRepository;
import com.demo.DemoApplication.entity.Student;

@Service
public class StudentService {
	 @Autowired
	    private StudentRepository studentRepository;

	    public Student createStudent(Student student) {
	        return studentRepository.save(student);
	    }

	    public List<Student> getAllStudents() {
	        return studentRepository.findAll();
	    }

}
