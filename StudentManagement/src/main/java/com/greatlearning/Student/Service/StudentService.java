package com.greatlearning.Student.Service;

import java.util.List;

import com.greatlearning.Student.Model.Student;

public interface StudentService {
	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student thestudent);

	public void deleteById(int theId);

	

}

