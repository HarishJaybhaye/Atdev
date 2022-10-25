package com.example.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dev.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	public Student findByStudId(Long studId) throws Exception;

}
