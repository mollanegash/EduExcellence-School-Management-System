package com.schoolmanagment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolmanagment.model.Student;
import com.schoolmanagment.repo.StuRepository;

@Service
public class StudentService {
	@Autowired
	private StuRepository studentRepository;

	public List<Student> getAllStudents() {
		List<Student> Students = new ArrayList<>();
		studentRepository.findAll().forEach(student -> Students.add(student));
		
		return Students;

	}

	public Student getstudentById(int id) {
		return studentRepository.findById(id).get();

	}

	public Student saveOrUpdateStudent(Student student) {
		return studentRepository.save(student);

	}

	public void  deleteById(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);;
	}
	

	

}
