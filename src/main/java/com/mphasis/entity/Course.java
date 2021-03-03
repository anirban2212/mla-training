package com.mphasis.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course_table")
public class Course {
	private long course_id;
	private String course_name;
	private String course_fees;
	private String course_level;
	private int course_duration;
	@Id
	@GeneratedValue
	@Column(name="course_id_column")
	public long getCourse_id() {
		return course_id;
	}
	public void setCourse_id(long course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_fees() {
		return course_fees;
	}
	public void setCourse_fees(String course_fees) {
		this.course_fees = course_fees;
	}
	public String getCourse_level() {
		return course_level;
	}
	public void setCourse_level(String course_level) {
		this.course_level = course_level;
	}
	public int getCourse_duration() {
		return course_duration;
	}
	public void setCourse_duration(int course_duration) {
		this.course_duration = course_duration;
	}
	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", course_name=" + course_name + ", course_fees=" + course_fees
				+ ", course_level=" + course_level + ", course_duration=" + course_duration + "]";
	}
	
}