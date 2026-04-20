package com.schoolmanagment.service;

import com.schoolmanagment.model.Student;
import com.schoolmanagment.repo.StuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional // Ensures data integrity
public class StudentService {

    @Autowired
    private StuRepository studentRepository;

    @Transactional(readOnly = true)
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }
    @Cacheable(value = "student-cache", key = "#id")// CRITICAL: Redis Caching
    @Transactional(readOnly = true)
    public Student getstudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Transactional // CRITICAL: Atomic Transaction management
    @CacheEvict(value = "students", key = "#student.id", allEntries = true)
    public Student saveOrUpdateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Transactional
    @CacheEvict(value = "students", key = "#id")
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }
}