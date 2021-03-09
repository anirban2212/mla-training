package com.mphasis.tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.mphasis.dao.StudentDaoImpl;
import com.mphasis.entity.Student;

public class StudentTestCase {

Student student = new Student();
	
	@Mock
	StudentDaoImpl studentdaoimpl;

	@Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
	
	 @Test
	 public void getAllStudentTest()
	    {
	        List<Student> list = new ArrayList<Student>();
	        
	        Student stu1 = new Student(1, "Kiya", "S", "kiya@gmail.com", "Kolkata", 50, "ki", "kis");
	       
	        Student stu2 = new Student(2,"Siya","D","siya@gmail.com","Goa",80,"si","sid");
	        
	        list.add(stu1);
	        list.add(stu2);
	        
	        when(studentdaoimpl.getStudentList()).thenReturn(list);
	        
	        List<Student> sList = studentdaoimpl.getStudentList();
	         
	        assertEquals(2, sList.size());
	    }
	 
	 
	 @Test
	 public void studentLoginTest()
	    {
		 	List<Student> list = new ArrayList<Student>();
	        
	        Student stu1 = new Student(1,"Ashish","M","ashish@gmail.com","Mumbai",60,"ashi","ashish");
	      
	        list.add(stu1);
	        
	        when(studentdaoimpl.getStudentList()).thenReturn(list);
	        
	        List<Student> sList = studentdaoimpl.getStudentList();
	         
	        assertEquals(sList.get(0).getStudent_username(),list.get(0).getStudent_username());   
	        assertEquals(sList.get(0).getStudent_password(),list.get(0).getStudent_password());   
	        assertEquals(sList.toString(),list.toString());
	    }

}