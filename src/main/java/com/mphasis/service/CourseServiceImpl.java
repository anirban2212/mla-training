package com.mphasis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mphasis.dao.CourseDao;
import com.mphasis.entity.Course;
@Service 
@Transactional
public class CourseServiceImpl implements CourseService {
@Autowired
private CourseDao courseDao;
	@Override
	public void createCourse(Course Course) {
		courseDao.createCourse(Course);
		
	}

	@Override
	public List<Course> getCourseList() {
		return courseDao.getCourseList();
	}

	@Override
	public Course getCourse(Course Course) {
		return courseDao.getCourse(Course);
	}

	@Override
	public List<Course> updateCourse(Course Course) {
		return courseDao.updateCourse(Course);
	}

	@Override
	public List<Course> deleteCourse(int course_id) {
		return courseDao.deleteCourse(course_id);
	}

	@Override
	public List<Course> getACourse(int course_id) {
		return courseDao.getACourse(course_id);
	}
	@Override
	public List<Course> getNewCourse(){
		return courseDao.getNewCourse();
		}

}
