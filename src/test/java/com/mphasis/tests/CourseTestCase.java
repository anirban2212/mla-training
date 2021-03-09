package com.mphasis.tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.mphasis.dao.CourseDaoImpl;
import com.mphasis.entity.Course;

public class CourseTestCase {

Course course = new Course();
	
	@Mock
	CourseDaoImpl coursedaoimpl;

	@Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
	
	 @Test
	 public void getCourseListTest()
	    {
	        List<Course> list = new ArrayList<Course>();
	        
	        Course course1 = new Course(1, "JAVA", 4000, "Beginner", "2 months");
	       
	        Course course2 = new Course(2, "Spring MVC", 6000, "Beginner", "4 months");
	        
	        list.add(course1);
	        list.add(course2);
	        
	        when(coursedaoimpl.getCourseList()).thenReturn(list);
	        
	        List<Course> cList = coursedaoimpl.getCourseList();
	         
	        assertEquals(cList.toString(),list.toString());
	    }


}