package com.demo.DemoApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.DemoApplication.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
