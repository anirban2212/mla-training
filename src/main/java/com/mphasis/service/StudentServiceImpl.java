package com.mphasis.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mphasis.dao.StudentDao;
import com.mphasis.entity.Student;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentdao;
	@Override
	public void createStudent(Student student) {
		studentdao.createStudent(student);	
		
	}

	@Override
	public List<Student> getStudentList() {
		return studentdao.getStudentList();
	}

	@Override
	public Student getStudent(Student student) {
		return studentdao.getStudent(student);
	}

	@Override
	public List<Student> updateStudent(Student student) {
		return studentdao.updateStudent(student);
	}

	@Override
	public List<Student> deleteStudent(int student_id) {
		return studentdao.deleteStudent(student_id);
	}

	@Override
	public List<Student> getAStudent(int student_id) {
		return studentdao.getAStudent(student_id);
	}
	

	
}
