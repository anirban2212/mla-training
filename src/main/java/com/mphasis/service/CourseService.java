package com.mphasis.service;


	import java.util.List;

	import com.mphasis.entity.Course;
	import com.mphasis.entity.Student;

	public interface CourseService{
		public void createCourse(Course course);
		public List<Course> getCourseList();
		public Course getCourse(Course course);
		public List<Course> updateCourse(Course course);
		public List<Course> deleteCourse(long course_id);
		List<Course> getACourse(long course_id);
		
		
	}


