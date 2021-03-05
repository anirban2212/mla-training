package com.mphasis.controller;

import java.util.List;
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
import com.mphasis.service.CourseService;

@RestController
public class CourseRestController {
	@Autowired
	CourseService courseService;
	Course course;
	private static final Logger logger = Logger.getLogger("StudentRestController.class");

	@GetMapping("/allcourse")
	private ResponseEntity<List<Course>> allCourse() {

		List<Course> li = courseService.getCourseList();
		if (li.isEmpty()) {
			return new ResponseEntity<List<Course>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Course>>(li, HttpStatus.OK);
	}

	@PostMapping("/createCourse")
	public Course createCourse( @Valid @RequestBody Course course) {
		courseService.createCourse(course);
		return course;
	}

	@GetMapping("/searchCourse/{course_id}")
	public List<Course> searchCourse(@Valid @PathVariable("course_id") int course_id) {

		return courseService.getACourse(course_id);
	}

	@PutMapping("/updateCourse")
	private ResponseEntity<List<Course>> updateStudent(@Valid @RequestBody Course course) {

		List<Course> li = courseService.updateCourse(course);
		if (li.isEmpty()) {
			return new ResponseEntity<List<Course>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Course>>(li, HttpStatus.OK);
	}

	@DeleteMapping("/deleteCourse/{course_id}")
	private ResponseEntity<List<Course>> deleteCourse(@Valid @PathVariable("course_id") int course_id) {

		List<Course> li = courseService.deleteCourse(course_id);
		if (li.isEmpty()) {
			return new ResponseEntity<List<Course>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Course>>(li, HttpStatus.OK);
	}
}
