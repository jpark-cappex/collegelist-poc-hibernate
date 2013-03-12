package com.cappex.hq.service;

import com.cappex.hq.domain.College;
import com.cappex.hq.persistence.StudentCollegeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Creator: Junho Park
 * Date: 3/12/13
 * Time: 2:14 PM
 * Contents are property of Cappex.com LLC, and strictly confidential.
 */

@Service
@Transactional
public class StudentCollegeServiceImpl implements StudentCollegeService {

	@Resource
	private StudentCollegeDao studentCollegeDao;

	@Autowired
	public void setStudentCollegeDao(StudentCollegeDao studentCollegeDao) {
		this.studentCollegeDao = studentCollegeDao;
	}

	public List<College> getCollegesForStudent(long studentId) {
		return studentCollegeDao.getCollegesForStudent(studentId);
	}
}