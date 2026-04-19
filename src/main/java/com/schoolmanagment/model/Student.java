package com.schoolmanagment.model;

import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Version // CRITICAL: Handles Concurrency (Optimistic Locking)
    private Integer version;

    @Column(name = "student_name")
    private String studentName;

    @Column(unique = true)
    private String email;

    private String regDate;
    private String courseName;

    @Override
    public String toString() {
        return "Student [name=" + studentName + ", id=" + id + ", email=" + email + "]";
    }
}