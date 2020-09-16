package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "school_table")
@Entity
public class School {
	@Id
	@Column(name = "school_id")
	private int schoolId;
	@Column(name = "school_name")
	private String schoolName;

	public School() {
		super();
	}

	public School(String schoolName) {
		super();
		this.schoolName = schoolName;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

}
