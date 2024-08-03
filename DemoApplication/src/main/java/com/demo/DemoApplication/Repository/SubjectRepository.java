package com.demo.DemoApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.DemoApplication.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long>{

}
