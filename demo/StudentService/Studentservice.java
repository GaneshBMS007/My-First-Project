package com.example.demo.StudentService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Student.studentDetails;
   
import com.example.demo.StudentRepository.StudentRepo;

@Service 
public  class Studentservice {
    @Autowired
	StudentRepo repository;
	
	public String addStudent(studentDetails student)
	{
		repository.save(student);
		return "add"; 
	}
	public List<studentDetails> getStudent()
	{
		return repository.findAll();
	}
	public  Optional<studentDetails> getStudentById(int id)
	{
		return repository.findById(id);
	}

}