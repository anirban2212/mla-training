package com.mphasis.service;

import java.util.List;

import com.mphasis.entity.Course;

public interface CourseService {
	public void createCourse(Course Course);
	public List<Course> getCourseList();
	public Course getCourse(Course Course);
	public List<Course> updateCourse(Course Course);
	public List<Course> deleteCourse(int course_id);
	List<Course> getACourse(int course_id);
	List<Course> getNewCourse();
}
