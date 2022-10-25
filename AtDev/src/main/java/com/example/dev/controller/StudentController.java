package com.example.dev.controller;


import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dev.model.Student;
import com.example.dev.serviceImpl.StudentService;
import com.example.dev.serviceImpl.StudentServiceImpl;

@RestController
@RequestMapping("v1/student")
public class StudentController {
	
	@Autowired 
	private StudentService studentService;
	
	@PostMapping
	public void addStud(@Validated @RequestBody Student student) throws Exception{
		studentService.addStudent(student);
	}

	@GetMapping("/{studId}")
	public Student getstudent(@PathVariable("studId") Long studId) throws Exception{
		
		return studentService.getStudent(studId);
	}
	@PutMapping("/{studId}")
	public Student update(@RequestBody Student student,@PathVariable Long studId) throws Exception{
		return studentService.update(student, studId);
	}
	
	@DeleteMapping("/{studId}")
	public void delete(@PathVariable Long studId) throws Exception{
		studentService.deleteStudent(studId);
	}

}
