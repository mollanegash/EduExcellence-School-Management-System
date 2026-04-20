package com.schoolmanagment.repo;

import org.springframework.data.jpa.repository.JpaRepository; // Use JpaRepository
import org.springframework.stereotype.Repository;
import com.schoolmanagment.model.Student;

@Repository // Uncomment this so Spring can find it
public interface StuRepository extends JpaRepository<Student, Long> {
    // The second parameter MUST be Long
}