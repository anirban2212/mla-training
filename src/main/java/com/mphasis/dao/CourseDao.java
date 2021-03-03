package com.mphasis.dao;

	import java.util.List;

	import com.mphasis.entity.Course;
	import com.mphasis.entity.Student;

	public interface CourseDao {
		public void createCourse(Course course);
		public List<Course> getCourseList();
		public Course getCourse(Course course);
		public List<Course> updateCourse(Course course);
		List<Course> deleteCourse(long course_id);
		List<Course> getACourse(long course_id);
		
		
	}

