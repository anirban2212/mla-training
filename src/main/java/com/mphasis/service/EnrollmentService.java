package com.mphasis.service;

import java.util.List;

import com.mphasis.entity.Enrollment;

public interface EnrollmentService {

	public List<Enrollment> getEnrollmentList();

	public List<Enrollment> updateEnrollment(Enrollment enrollment);

	public void createEnrollment(Enrollment enrollment);

	public List<Enrollment> getAEnrollment(int id);
	 public List<Enrollment> studentstatus();


}