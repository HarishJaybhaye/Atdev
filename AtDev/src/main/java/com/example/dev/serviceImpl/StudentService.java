package com.example.dev.serviceImpl;

import com.example.dev.model.Student;

public interface StudentService {

	public Student getStudent(Long studId) throws Exception;
	
	public Student update(Student student, Long studId) throws Exception ;
	
	public void deleteStudent(Long studId) throws Exception;
	
	public void addStudent(Student student) throws Exception;
}
