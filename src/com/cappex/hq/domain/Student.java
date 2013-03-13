package com.cappex.hq.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Creator: Junho Park
 * Date: 3/12/13
 * Time: 2:03 PM
 * Contents are property of Cappex.com LLC, and strictly confidential.
 */

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name = "first_name")
	private String firstName;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "student_college",
			joinColumns = {@JoinColumn(name = "student_id")},
			inverseJoinColumns = {@JoinColumn(name = "college_id")})
	@OrderBy("collegeName")
	private Set<College> colleges = new HashSet<College>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Set<College> getColleges() {
		return colleges;
	}

	public void setColleges(Set<College> colleges) {
		this.colleges = colleges;
	}
}