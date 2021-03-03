package com.mphasis.controller;
import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.entity.Course;
import com.mphasis.entity.Student;
import com.mphasis.service.CourseService;
import com.mphasis.service.StudentService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class StudentRestController {
	@Autowired
	StudentService studentService;
	Student student;
	@Autowired
	CourseService courseService;
	Course course;
	private static final Logger logger = Logger.getLogger("StudentRestController.class");

	@GetMapping("/allstudent")
	private  ResponseEntity<List<Student>>  allStudent() {
		logger.info("GETTING REQUEST FROM CLIENT TO LIST ALL StudentS");
		List<Student> li=studentService.getStudentList();
		if(li.isEmpty())
		{
			return new ResponseEntity<List<Student>>(HttpStatus.NO_CONTENT);	
		}
		
		return new ResponseEntity<List<Student>>(li, HttpStatus.OK);		
	}
	@PostMapping("/create")
	public Student createStudent(@RequestBody Student student) {
		studentService.createStudent(student);
		return student;
	}

	@GetMapping("/search/{student_id}")
	public List<Student> searchStudent(@PathVariable("student_id") long student_id) {

		return studentService.getAStudent(student_id);
	}

	@PutMapping("/update")
	private ResponseEntity<List<Student>> updateStudent(@RequestBody Student student) {

		List<Student> li = studentService.updateStudent(student);
		if (li.isEmpty()) {
			return new ResponseEntity<List<Student>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Student>>(li, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	private ResponseEntity<List<Student>> deleteStudent(@PathVariable("id") int student_id) {

		List<Student> li = studentService.deleteStudent(student_id);
		if (li.isEmpty()) {
			return new ResponseEntity<List<Student>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Student>>(li, HttpStatus.OK);
	}


///////////////-------------------COURSE RESTCONTROLLER-------------------
	@GetMapping("/allcourse")
	private  ResponseEntity<List<Course>>  allCourse() {
		
		List<Course> li=courseService.getCourseList();
		if(li.isEmpty())
		{
			return new ResponseEntity<List<Course>>(HttpStatus.NO_CONTENT);	
		}
		
		return new ResponseEntity<List<Course>>(li, HttpStatus.OK);		
	}
	@PostMapping("/createCourse")
	public Course createCourse(@RequestBody Course course) {
		courseService.createCourse(course);
		return course;
	}

	@GetMapping("/searchCourse/{course_id}")
	public List<Course> searchCourse(@PathVariable("course_id") int course_id) {

		return courseService.getACourse(course_id);
	}

	@PutMapping("/updateCourse")
	private ResponseEntity<List<Course>> updateStudent(@RequestBody Course course) {

		List<Course> li = courseService.updateCourse(course);
		if (li.isEmpty()) {
			return new ResponseEntity<List<Course>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Course>>(li, HttpStatus.OK);
	}

	@DeleteMapping("/deleteCourse/{course_id}")
	private ResponseEntity<List<Course>> deleteCourse(@PathVariable("course_id") int course_id) {

		List<Course> li = courseService.deleteCourse(course_id);
		if (li.isEmpty()) {
			return new ResponseEntity<List<Course>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Course>>(li, HttpStatus.OK);
	}
}

