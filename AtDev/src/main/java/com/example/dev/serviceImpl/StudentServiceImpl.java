package com.example.dev.serviceImpl;

import java.util.Calendar;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dev.model.Student;
import com.example.dev.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public Student getStudent(Long studId) throws Exception {

		return studentRepository.findByStudId(studId);
	}

	public void addStudent(Student student) throws Exception {
		studentRepository.save(student);
	}

	public Student update(Student student, Long studId) throws Exception {

		Student checkStudent = getStudent(studId);

		checkStudent.setPercentage(student.getPercentage());
		checkStudent.setClassName(student.getClassName());
		checkStudent.setCollegeName(student.getCollegeName());
		checkStudent.setNumber(student.getNumber());
		checkStudent.setStudentName(student.getStudentName());
		return studentRepository.save(checkStudent);

	}

	public void deleteStudent(Long studId) throws Exception {

		Student student = studentRepository.findByStudId(studId);
		studentRepository.delete(student);
	}

}
