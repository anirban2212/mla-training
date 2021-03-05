package com.mphasis.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "student")

public class Student {

	@Id
	@GeneratedValue
	private int student_id;
	@NotNull(message = "Cannot be null")
	@Size(min = 3, message = "Must be greater than 3 characters")
	private String student_fname;
	@NotNull(message = "Cannot be null")

	private String student_lname;
	@Column(unique = true)
	@NotNull(message = "Cannot be null")
	@Email(message = "Invalid Formating")
	private String student_email;
	
	@NotNull(message = "Cannot be null")
	private String student_address;
	@NotNull(message = "Cannot be null")
	private float student_grades;
	@NotNull(message = "Cannot be null")
	@Size(min = 4, message = "must be greater than 4 and lesser than 8")
	@Column(unique = true)
	private String student_username;
	@NotNull(message = "Cannot be null")
	@Size(min = 4, max = 8, message = "must be greater than 4 and lesser than 8")
	private String student_password;

	@OneToMany(mappedBy = "student")
	private Set<Enrollment> enrollment = new HashSet<Enrollment>();

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int student_id, String student_fname, String student_lname, String student_email,
			String student_address, float student_grades, String student_username, String student_password) {
		super();
		this.student_id = student_id;
		this.student_fname = student_fname;
		this.student_lname = student_lname;
		this.student_email = student_email;
		this.student_address = student_address;
		this.student_grades = student_grades;
		this.student_username = student_username;
		this.student_password = student_password;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_fname() {
		return student_fname;
	}

	public void setStudent_fname(String student_fname) {
		this.student_fname = student_fname.toUpperCase();
	}

	public String getStudent_lname() {
		return student_lname;
	}

	public void setStudent_lname(String student_lname) {
		this.student_lname = student_lname.toUpperCase();
	}

	public String getStudent_email() {
		return student_email;
	}

	public void setStudent_email(String student_email) {
		this.student_email = student_email.toUpperCase();
	}

	public String getStudent_address() {
		return student_address;
	}

	public void setStudent_address(String student_address) {
		this.student_address = student_address.toUpperCase();
	}

	public float getStudent_grades() {
		return student_grades;
	}

	public void setStudent_grades(float student_grades) {
		this.student_grades = student_grades;
	}

	public String getStudent_username() {
		return student_username;
	}

	public void setStudent_username(String student_username) {
		this.student_username = student_username.toUpperCase();
	}

	public String getStudent_password() {
		return student_password;
	}

	public void setStudent_password(String student_password) {
		this.student_password = student_password.toUpperCase();
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_fname=" + student_fname + ", student_lname="
				+ student_lname + ", student_email=" + student_email + ", student_address=" + student_address
				+ ", student_grades=" + student_grades + ", student_username=" + student_username
				+ ", student_password=" + student_password + "]";
	}

}
