package com.mphasis.dao;
import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.mphasis.entity.Student;
@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	SessionFactory sessionFactory;
		
	protected Session getSession() {
		return (Session)sessionFactory.getCurrentSession();
	}	

	public List<Student> studentLogin(Student student)
    {
        Criteria c = getSession().createCriteria(Student.class);
        Criterion criterion=Restrictions.eq("student_email",student.getStudent_email());
        Criterion criterion2=    Restrictions.eq("student_password",student.getStudent_password());
        Criterion criterion3=Restrictions.and(criterion,criterion2);
        c.add(criterion3);
        return c.list();
    }    
	
	@Override
	public void createStudent(Student student) {
		
		getSession().saveOrUpdate(student);
		System.out.println("student " + student.getStudent_fname()+student.getStudent_lname() +" stored in the DB !!!");
	}

	@Override
	public List<Student> getStudentList() {
		Query query = getSession().createQuery("select me from Student me");
		List<Student> stuList=query.list();
		return stuList;
	}

	@Override
	public Student getStudent(Student student) {
		Criteria c = getSession().createCriteria(Student.class);
		c.add(Restrictions.eq("student_email",student.getStudent_email()));
		Student e =(Student) c.uniqueResult();
		return e;
	}

	@Override
	public List<Student> updateStudent(Student student) {
		Query query = getSession().createQuery("update Student set student_fname=:student_fname,student_lname=:student_lname, student_email=:student_email,student_address=:student_address,student_grades=:student_grades,student_username=:student_username,student_password=:student_password where student_id=:student_id ");
		query.setParameter("student_fname", student.getStudent_fname());
		query.setParameter("student_lname",student.getStudent_lname());
		query.setParameter("student_email",student.getStudent_email());
		query.setParameter("student_address",student.getStudent_address());
		query.setParameter("student_grades",student.getStudent_grades());
		query.setParameter("student_username",student.getStudent_username());
		query.setParameter("student_password",student.getStudent_password());
		query.setParameter("student_id", student.getStudent_id());
		int rowsAffected = query.executeUpdate();
		System.out.println(rowsAffected + " updated... ");
		if (rowsAffected > 0) {
		System.out.println("Updated " + rowsAffected + " rows.");
		}

		return getStudentList();

	}

	@Override
	public List<Student> deleteStudent(int student_id) {
		Query query = getSession().createQuery("delete from Student sm where student_id=:student_id");
		query.setParameter("student_id",student_id );
		query.executeUpdate();
		return getStudentList();
		
	}

	@Override
	public List<Student> getAStudent(int student_id) {
		Query query = getSession().createQuery("from Student sm where sm.id=:student_id");
		query.setParameter("student_id", student_id);
		List<Student> stuList=query.list();
		return stuList;
	}
	
	
	public Student studentLogin(String student_email,String student_password) {
	    
	    Criteria cr = getSession().createCriteria(Student.class);
	    cr.add(Restrictions.eq("student_email", student_email));
	    cr.add(Restrictions.eq("student_password", student_password));
	    Student student=(Student) cr.uniqueResult();
	    return student;
	}

	
	
}