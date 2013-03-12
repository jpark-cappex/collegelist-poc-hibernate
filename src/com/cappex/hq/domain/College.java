package com.cappex.hq.domain;

import javax.persistence.*;

/**
 * Creator: Junho Park
 * Date: 3/12/13
 * Time: 2:03 PM
 * Contents are property of Cappex.com LLC, and strictly confidential.
 */

@Entity
@Table(name = "colleges")
public class College {
	private long id;
	private String collegeName;

	@Id
	@GeneratedValue
	@Column(name="id")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name="college_name")
	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
}