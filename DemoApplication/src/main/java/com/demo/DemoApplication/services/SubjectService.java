package com.demo.DemoApplication.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.DemoApplication.Repository.SubjectRepository;
import com.demo.DemoApplication.entity.Subject;

@Service
public class SubjectService {
	
	@Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

}
