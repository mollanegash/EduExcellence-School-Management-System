package com.schoolmanagment.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoolmanagment.model.Student;

//@Repository
public interface StuRepository extends CrudRepository<Student, Integer>{

}
