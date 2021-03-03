package com.mphasis.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.mphasis.entity.Course;
import com.mphasis.entity.Student;
import com.mphasis.service.CourseService;
import com.mphasis.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService studentService;
	Student student;
	@Autowired
	CourseService courseService;
	Course course;
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register() {
		return new ModelAndView("register");
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView signin() {
		return new ModelAndView("login");
	}
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView signup(@RequestParam("txtfname") String fname,
			@RequestParam("txtlname") String lname,
			@RequestParam("txtemail") String email,
			@RequestParam("txtusername") String username,
			@RequestParam("txtpwd") String password)
		{
		System.out.println(fname+lname+email+username+password);
		
		student = new Student();
		student.setStudent_fname(fname);
		student.setStudent_lname(lname);
		student.setStudent_email(email);
		student.setStudent_username(username);
		student.setStudent_password(password);
		studentService.createStudent(student);
		System.out.println("passed " + student.getStudent_fname() + "details to empservice.");		
		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public ModelAndView signIn(@RequestParam("txtemail") String email) {
		student=new Student();
		student.setStudent_email(email);
		Student ed=studentService.getStudent(student);
	
		
		if(ed==null)
		{
			ModelAndView mv=new ModelAndView("login");
			mv.addObject("msg", "student not found");
			return mv;	
		}else
		{
			return allStudent();
		}
				
	}
	
	public ModelAndView allStudent() {
		
		List<Student> li=studentService.getStudentList();
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("stulist", li);
		return mv;	
	}
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView getAstudent(@RequestParam("txteid") String student_id)
	{
		int id=Integer.parseInt(student_id);
		List<Student> li=studentService.getAStudent(id);
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("stulist", li);
		return mv;				
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteStudent(Student stu)
	{
		List<Student> li=studentService.deleteStudent(stu.getStudent_id());
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("stulist", li);
		return mv;				
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editStu() {		
		return new ModelAndView("edit");
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView update(@ModelAttribute Student student) {
		System.out.println("From update " + student);
		studentService.updateStudent(student);
		return allStudent();

	}
	///////////COURSE CONTROLLER
public ModelAndView allCourse() {
		
		List<Course> list=courseService.getCourseList();
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("courselist", list);
		return mv;	
	}
@RequestMapping(value = "/course", method = RequestMethod.GET)
public ModelAndView getACourse(@RequestParam("cid") String course_id)
{
	int id=Integer.parseInt(course_id);
	List<Course> list=courseService.getACourse(id);
	ModelAndView mv=new ModelAndView("course");
	mv.addObject("courselist", list);
	return mv;				
}
@RequestMapping(value = "/deleteCouse", method = RequestMethod.GET)
public ModelAndView deleteCourse(int course_id)
{
	List<Course> list=courseService.deleteCourse(course_id);
	ModelAndView mv=new ModelAndView("home");
	mv.addObject("msg","Course Deleted SUccessfully");
	mv.addObject("courselist", list);
	
	return mv;				
}	
@RequestMapping(value = "/editCourse", method = RequestMethod.GET)
public ModelAndView editCourse() {		
	return new ModelAndView("edit");
}

@RequestMapping(value = "/updateCourse", method = RequestMethod.GET)
public ModelAndView updateCourse(@ModelAttribute Course course) {
	System.out.println("From update " + course);
	studentService.updateStudent(student);
	return allCourse();

}	
}
