package com.mphasis.service;

import java.util.List;

import com.mphasis.entity.Student;

public interface StudentService {
	public void createStudent(Student student);
	public List<Student> getStudentList();
	public Student getStudent(Student student);
	public List<Student> updateStudent(Student student);
	public List<Student> deleteStudent(long student_id);
	List<Student> getAStudent(long student_id);
}
