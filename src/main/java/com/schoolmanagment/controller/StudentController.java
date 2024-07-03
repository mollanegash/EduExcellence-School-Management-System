package com.schoolmanagment.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

import com.schoolmanagment.model.Student;
import com.schoolmanagment.repo.StuRepository;
import com.schoolmanagment.service.StudentService;

/*The design is complete, and it's time to implement. Using Java, Spring Boot, Spring Web, Spring
Data JPA, and H2(in-memory database), implement a microservice(studentms) to manage
students with all CRUD operations.
1. An API to fetch all students
2. An API to fetch a single student
3. An API to create a new student
4. An API to delete a student
5. An API to update a student
Hint: Service registry/discovery, load balancing, circuit breaker.*/
@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	StuRepository strepo;

	@GetMapping("/students")
	// An API to fetch all students
	private List<Student> getAllStudents() {
		return studentService.getAllStudents();

	}
		/*link
	@GetMapping("/students")
	private List<Student> allSudents() {
	  return (List<Student>) strepo.findAll();
	}


	@GetMapping("/employees")
	CollectionModel<EntityModel<Student>> allStudents() {

	  List<EntityModel<Student>> students = strepo.findAll().streams();
	      .map(employee -> EntityModel.of(employee,
	          linkTo(methodOn(EmployeeController.class).one(employee.getId())).withSelfRel(),
	          linkTo(methodOn(EmployeeController.class).all()).withRel("employees")))
	      .collect(Collectors.toList());

	  return CollectionModel.of(students, linkTo(methodOn(EmployeeController.class).all()).withSelfRel());
	}*/
	
	@GetMapping("/students/{id}")
	// An API to fetch a single student
	private Student getStudent(@PathVariable("id") int id) {
		// Student st =strepo.findAll()

		return studentService.getstudentById(id);
		// return strepo.findById(id).orElseThrow(()-> new
		// StudentNotFoundException(id));

	}

	/*
	 * Introducing Spring HATEOAS, a Spring project aimed at helping you write
	 * hypermedia-driven outputs. To upgrade your service to being RESTful,add this
	 * to your build:
	 
	@GetMapping("/students/{id}")
	private EntityModel<Student> getOne(@PathVariable int id) {

		Student student = strepo.findById(id) //
				.orElseThrow()->new StudentNotFoundException(id);

		return EntityModel.of(employee, //
				linkTo(methodOn(EmployeeController.class).one(id)).withSelfRel(),
				linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));
	}*/


	@PostMapping("/students")
	// An API to create a new student
	private void addStudentById(@RequestBody Student student) {
		studentService.saveOrUpdateStudent(student);

	}
	//An API to delete a student

	@DeleteMapping("students/{id}")
	private void deleteStudenet(@PathVariable("id") int id) {
		studentService.deleteById(id);

	}
	
	//An API to update a student

	@PutMapping("/students/{id}")
	private Student putData(@RequestBody Student newStudent,@PathVariable("id")int id) {
		return studentService.saveOrUpdateStudent(newStudent);
		
		
	}
}
