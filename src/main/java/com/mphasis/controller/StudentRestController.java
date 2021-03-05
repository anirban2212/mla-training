package com.mphasis.controller;

import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mphasis.entity.Course;
import com.mphasis.entity.Enrollment;
import com.mphasis.entity.Student;
import com.mphasis.service.CourseService;
import com.mphasis.service.EnrollmentService;
import com.mphasis.service.StudentService;

@RestController
public class StudentRestController {
	@Autowired
	StudentService studentService;
	Student student;

	private static final Logger logger = Logger.getLogger("StudentRestController.class");

	@PostMapping("/studentLogin")
    public Student adminLogin(@RequestBody Student student) {
        studentService.studentLogin(student);
        return student;
    }
	
	@GetMapping("/allstudent")
	private ResponseEntity<List<Student>> allStudent() {
		logger.info("GETTING REQUEST FROM CLIENT TO LIST ALL StudentS");
		List<Student> li = studentService.getStudentList();
		if (li.isEmpty()) {
			return new ResponseEntity<List<Student>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Student>>(li, HttpStatus.OK);
	}

	@PostMapping("/create")
	public Student createStudent(@Valid @RequestBody Student student) {
		studentService.createStudent(student);
		return student;
	}

	@GetMapping("/search/{student_id}")
	public List<Student> searchStudent(@Valid @PathVariable("student_id") int student_id) {

		return studentService.getAStudent(student_id);
	}

	@PutMapping("/update")
	private ResponseEntity<List<Student>> updateStudent(@Valid @RequestBody Student student) {

		List<Student> li = studentService.updateStudent(student);
		if (li.isEmpty()) {
			return new ResponseEntity<List<Student>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Student>>(li, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	private ResponseEntity<List<Student>> deleteStudent(@Valid @PathVariable("id") int student_id) {

		List<Student> li = studentService.deleteStudent(student_id);
		if (li.isEmpty()) {
			return new ResponseEntity<List<Student>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Student>>(li, HttpStatus.OK);
	}

	/*
	 * @GetMapping("/allcourse") private ResponseEntity<List<Course>> allCourse() {
	 * 
	 * List<Course> li=courseService.getCourseList(); if(li.isEmpty()) { return new
	 * ResponseEntity<List<Course>>(HttpStatus.NO_CONTENT); }
	 * 
	 * return new ResponseEntity<List<Course>>(li, HttpStatus.OK); }
	 * 
	 * @PostMapping("/createCourse") public Course createCourse(@RequestBody Course
	 * course) { courseService.createCourse(course); return course; }
	 * 
	 * @GetMapping("/searchCourse/{course_id}") public List<Course>
	 * searchCourse(@PathVariable("course_id") int course_id) {
	 * 
	 * return courseService.getACourse(course_id); }
	 * 
	 * @PutMapping("/updateCourse") private ResponseEntity<List<Course>>
	 * updateStudent(@RequestBody Course course) {
	 * 
	 * List<Course> li = courseService.updateCourse(course); if (li.isEmpty()) {
	 * return new ResponseEntity<List<Course>>(HttpStatus.NO_CONTENT); }
	 * 
	 * return new ResponseEntity<List<Course>>(li, HttpStatus.OK); }
	 * 
	 * @DeleteMapping("/deleteCourse/{course_id}") private
	 * ResponseEntity<List<Course>> deleteCourse(@PathVariable("course_id") int
	 * course_id) {
	 * 
	 * List<Course> li = courseService.deleteCourse(course_id); if (li.isEmpty()) {
	 * return new ResponseEntity<List<Course>>(HttpStatus.NO_CONTENT); }
	 * 
	 * return new ResponseEntity<List<Course>>(li, HttpStatus.OK); }
	 */
	// For enrollment

}
