package com.schoolmanagment.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	private int id;
	@Column
	private String student_name;
	@Column
	private String email;
	//private String professorName;
	@Column
	private String regDate;
	@Column
	private String course_name;
	Student(){
		
	}
	
	public Student(int id, String student_name, String email, String regDate, String course_name) {
		super();
		this.id = id;
		this.student_name = student_name;
		this.email = email;
		this.regDate = regDate;
		this.course_name = course_name;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	@Override
	public String toString() {
		return "Student [name=" + student_name + ", id=" + id + ", email=" + email + ", regDate=" + regDate + "]";
	}
	

}
