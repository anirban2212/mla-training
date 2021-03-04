package com.mphasis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mphasis.dao.EnrollmentDao;

import com.mphasis.entity.Enrollment;
@Service
@Transactional
public class EnrollmentServiceImpl implements EnrollmentService {
	@Autowired
	private EnrollmentDao enrollmentdao;
	
	
	@Override
	public void createEnrollment(Enrollment enrollment) {
		enrollmentdao.createEnrollment(enrollment);
	}

	
	
	@Override
	public List<Enrollment> getEnrollmentList() {
		return enrollmentdao.getEnrollmentList();
	}

	
	@Override
	public List<Enrollment> updateEnrollment(Enrollment enrollment) {
		return enrollmentdao.updateEnroll(enrollment);
	}

}

