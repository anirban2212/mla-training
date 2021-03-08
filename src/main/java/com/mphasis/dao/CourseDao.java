package com.mphasis.dao;

import java.util.List;

import com.mphasis.entity.Course;
import com.mphasis.entity.Student;

public interface CourseDao {
	public void createCourse(Course course);
	public List<Course> getCourseList();
	public Course getCourse(Course course);
	public List<Course> updateCourse(Course course);
	public List<Course> deleteCourse(int course_id);
	List<Course> getACourse(int course_id);
	List<Course> getNewCourse();
	
	
}
