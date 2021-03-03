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
		private CourseDao coursedao;
		@Override
		public void createCourse(Course course) {
			coursedao.createCourse(course);	
			
		}

		@Override
		public List<Course> getCourseList() {
			return coursedao.getCourseList();
		}

		@Override
		public Course getCourse(Course course) {
			return coursedao.getCourse(course);
		}

		@Override
		public List<Course> updateCourse(Course course) {
			return coursedao.updateCourse(course);
		}

		@Override
		public List<Course> deleteCourse(long course_id) {
			return coursedao.deleteCourse(course_id);
		}

		@Override
		public List<Course> getACourse(long course_id) {
			return coursedao.getACourse(course_id);
		}
		
	}


