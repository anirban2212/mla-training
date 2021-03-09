package com.mphasis.service;

import java.util.List;

import com.mphasis.entity.Student;

public interface StudentService {
	public void createStudent(Student student);
	public List<Student> getStudentList();
	public Student getStudent(Student student);
	public List<Student> updateStudent(Student student);
	
	public List<Student> getAStudent(int student_id);
	public List<Student> deleteStudent(int student_id);
	public void studentLogin(Student student);
	public Student studentLogin(String student_email,String student_password);
	
}