package com.cappex.hq.domain;

import javax.persistence.*;

/**
 * Creator: Junho Park
 * Date: 3/12/13
 * Time: 2:03 PM
 * Contents are property of Cappex.com LLC, and strictly confidential.
 */

@Entity
@Table(name = "students")
public class Student {
	private long id;
	private String firstName;

	@Id
	@GeneratedValue
	@Column(name="id")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name="first_name")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}