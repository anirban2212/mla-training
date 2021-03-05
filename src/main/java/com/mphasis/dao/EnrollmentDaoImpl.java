package com.mphasis.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.entity.Enrollment;
import com.mphasis.entity.Student;

@Repository
public class EnrollmentDaoImpl implements EnrollmentDao {
	@Autowired
	SessionFactory sessionFactory;

	protected Session getSession() {
		return (Session) sessionFactory.getCurrentSession();
	}

	@Override
	public void createEnrollment(Enrollment enrollment) {
		System.out.println("Ennnnnnnnrooooollll" + enrollment);
		getSession().save(enrollment);
		System.out.println("Student Id: " + enrollment.getStudent().getStudent_id() + " got enrolled with Course Id: "
				+ enrollment.getCourse().getCourse_id());

	}

	@Override
	public List<Enrollment> getEnrollmentList() {
		org.hibernate.Query query = getSession().createQuery("select me from Enrollment me");
		List<Enrollment> enrollList = query.list();
		return enrollList;
	}

	@Override
	public List<Enrollment> updateEnroll(Enrollment enrollment) {
		Query query = getSession().createQuery("update  Enrollment em set sc_status=:sc_status where id=:id");

		query.setParameter("sc_status", enrollment.getSc_status());
		query.setParameter("id", enrollment.getId());
		query.executeUpdate();
		return getEnrollmentList();
	}

	@Override
	public List<Enrollment> getAEnrollment(int id) {
		Query query = getSession().createQuery("from Enrollment sm where sm.student_id=:id");
		query.setParameter("student_id", id);
		List<Enrollment> enrollList = query.list();
		return enrollList;
	}

}
