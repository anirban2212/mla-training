package com.mphasis.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "course")
public class Course {
	@Id
	@GeneratedValue
	private int course_id;
	@NotNull(message="cannot be null")
	private String course_name;
	@NotNull(message="cannot be null")
	private float course_fees;
	@NotNull(message="cannot be null")
	private String course_level;
	@NotNull(message="cannot be null")
	private String course_duration;
	
	@OneToMany(mappedBy = "course")
	private Set<Enrollment> enrollment =new HashSet<Enrollment>();
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int course_id, String course_name, float course_fees, String course_level, String course_duration) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_fees = course_fees;
		this.course_level = course_level;
		this.course_duration = course_duration;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name.toUpperCase();
	}
	public float getCourse_fees() {
		return course_fees;
	}
	public void setCourse_fees(float course_fees) {
		this.course_fees = course_fees;
	}
	public String getCourse_level() {
		return course_level;
	}
	public void setCourse_level(String course_level) {
		this.course_level = course_level.toUpperCase();
	}
	public String getCourse_duration() {
		return course_duration;
	}
	public void setCourse_duration(String course_duration) {
		this.course_duration = course_duration.toUpperCase();
	}
	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", course_name=" + course_name + ", course_fees=" + course_fees
				+ ", course_level=" + course_level + ", course_duration=" + course_duration + "]";
	}
	
}