package com.mphasis.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.entity.Course;
import com.mphasis.entity.Student;
@Repository
public class CourseDaoImpl implements CourseDao{
	@Autowired
	SessionFactory sessionFactory;
		
	protected Session getSession() {
		return (Session)sessionFactory.getCurrentSession();
	}	
	@Override
	public void createCourse(Course course) {
		getSession().saveOrUpdate(course);
		System.out.println("course " + course.getCourse_name() +" introduced in system !!!");
	
		
	}

	@Override
	public List<Course> getCourseList() {
		Query query = getSession().createQuery("select me from Course me");
		List<Course> courseList=query.list();
		return courseList;
	}

	@Override
	public Course getCourse(Course course) {
		Criteria c = getSession().createCriteria(Course.class);
		c.add(Restrictions.eq("course_id",course.getCourse_id()));
		Course cs =(Course) c.uniqueResult();
		return cs;
	}

	@Override
    public List<Course> updateCourse(Course course) {
        Query query = getSession().createQuery("update  Course em set course_name=:course_name,course_fees=:course_fees,course_level=:course_level,course_duration=:course_duration where course_id=:course_id");
        query.setParameter("course_name", course.getCourse_name());
        query.setParameter("course_fees", course.getCourse_fees());
        query.setParameter("course_level", course.getCourse_level());
        query.setParameter("course_duration", course.getCourse_duration());
        query.setParameter("course_id", course.getCourse_id());
        query.executeUpdate();
        return getCourseList();
    }

	@Override
	public List<Course> deleteCourse(int course_id) {
		Query query = getSession().createQuery("delete from Course em where course_id=:course_id");
		query.setParameter("course_id", course_id);
		query.executeUpdate();
		return getCourseList();
	}

	@Override
	public List<Course> getACourse(int course_id) {
		Query query = getSession().createQuery("from Course em where em.course_id=:course_id");
		query.setParameter("course_id", course_id);
		List<Course> courseList=query.list();
		return courseList;
	}
	//for getting latest course
	@Override
	public List<Course> getNewCourse() {

		Query query = getSession().createQuery(
				"from Course order by course_id DESC");
		query.setMaxResults(1);
		List<Course> courseList = query.list();
		return courseList;
		
	}
	

}
