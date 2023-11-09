package com.example.springsecurity.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springsecurity.model.Student;

public interface Studentrepo extends JpaRepository<Student, Integer> {
	

}
