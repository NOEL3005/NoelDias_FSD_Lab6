package com.greatlearning.Student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.Student.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
