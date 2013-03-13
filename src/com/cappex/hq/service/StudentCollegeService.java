package com.cappex.hq.service;

import com.cappex.hq.domain.College;
import com.cappex.hq.domain.Student;

import java.util.List;

/**
 * Creator: Junho Park
 * Date: 3/12/13
 * Time: 2:12 PM
 * Contents are property of Cappex.com LLC, and strictly confidential.
 */
public interface StudentCollegeService {
	List<College> getCollegesForStudent(long studentId);
	List<Student> getStudents();
	Student getStudent(long studentId);
}
