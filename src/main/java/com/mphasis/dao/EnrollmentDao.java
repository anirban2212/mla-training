package com.mphasis.dao;

import java.util.List;

import com.mphasis.entity.Enrollment;

public interface EnrollmentDao {
	public void createEnrollment(Enrollment enrollment);
	public List<Enrollment> getEnrollmentList();
	public List<Enrollment> updateEnroll(Enrollment enrollment) ;
	
	public List<Enrollment> getAEnrollment(int id);
	
}