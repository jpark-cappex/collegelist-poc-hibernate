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
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name = "college_name")
	private String collegeName;

	/*@ManyToMany(mappedBy = "colleges", fetch = FetchType.EAGER)
	private Set<Student> students = new HashSet<Student>();*/

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	/*public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}*/
}