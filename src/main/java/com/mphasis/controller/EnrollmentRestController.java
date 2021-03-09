package com.mphasis.controller;

import java.util.List;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.entity.Enrollment;
import com.mphasis.service.EnrollmentService;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
public class EnrollmentRestController {
	@Autowired
	EnrollmentService enrollmentService;
	Enrollment enrollment;
	private static final Logger logger = Logger.getLogger("StudentRestController.class");

	@GetMapping("/allEnroll")
	private ResponseEntity<List<Enrollment>> allEnroll() {
		logger.info("GETTING REQUEST FROM CLIENT TO LIST ALL ENROLLLING LIST");
		List<Enrollment> li = enrollmentService.getEnrollmentList();
		if (li.isEmpty()) {
			return new ResponseEntity<List<Enrollment>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Enrollment>>(li, HttpStatus.OK);
	}

	@PostMapping("/createEnroll")
	public Enrollment createEnroll(@RequestBody Enrollment enrollment) {
		enrollmentService.createEnrollment(enrollment);
		return enrollment;
	}

	@PutMapping("/updateEnroll")
	private ResponseEntity<List<Enrollment>> updateEnroll(@RequestBody Enrollment enrollment) {

		List<Enrollment> li = enrollmentService.updateEnrollment(enrollment);
		if (li.isEmpty()) {
			return new ResponseEntity<List<Enrollment>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Enrollment>>(li, HttpStatus.OK);
	}
	
	@GetMapping("/searchEnroll/{id}")
	public List<Enrollment> searchEnrollmentt(@PathVariable("id") int id) {

		return enrollmentService.getAEnrollment(id);
	}
	@GetMapping("/studentenrollstatus")
    public List<Enrollment> studentstatus() {
        return enrollmentService.studentstatus();
    }
	
	

}
