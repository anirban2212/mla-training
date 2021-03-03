package com.mphasis.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
	@Entity
	@Table(name = "student_table")
	public class Student {

		
		@Id
		@GeneratedValue
		private long student_id;
		private String student_fname;
		private String student_lname;
		private  String student_email;
		private String student_address;
		private String student_grades;
		private String student_username;
		private String student_password;
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(long student_id, String student_fname, String student_lname, String student_email,
				String student_address, String student_grades, String student_username, String student_password) {
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
		public long getStudent_id() {
			return student_id;
		}
		public void setStudent_id(long student_id) {
			this.student_id = student_id;
		}
		public String getStudent_fname() {
			return student_fname;
		}
		public void setStudent_fname(String student_fname) {
			this.student_fname = student_fname;
		}
		public String getStudent_lname() {
			return student_lname;
		}
		public void setStudent_lname(String student_lname) {
			this.student_lname = student_lname;
		}
		public  String getStudent_email() {
			return student_email;
		}
		public void setStudent_email(String student_email) {
			this.student_email = student_email;
		}
		public String getStudent_address() {
			return student_address;
		}
		public void setStudent_address(String student_address) {
			this.student_address = student_address;
		}
		public String getStudent_grades() {
			return student_grades;
		}
		public void setStudent_grades(String student_grades) {
			this.student_grades = student_grades;
		}
		public String getStudent_username() {
			return student_username;
		}
		public void setStudent_username(String student_username) {
			this.student_username = student_username;
		}
		public String getStudent_password() {
			return student_password;
		}
		public void setStudent_password(String student_password) {
			this.student_password = student_password;
		}
		@Override
		public String toString() {
			return "Student [student_id=" + student_id + ", student_fname=" + student_fname + ", student_lname="
					+ student_lname + ", student_email=" + student_email + ", student_address=" + student_address
					+ ", student_grades=" + student_grades + ", student_username=" + student_username
					+ ", student_password=" + student_password + "]";
		}
		
		
	}
		
		