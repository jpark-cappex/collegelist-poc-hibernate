package com.cappex.hq.persistence;

import com.cappex.hq.domain.College;
import com.cappex.hq.domain.Student;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Creator: Junho Park
 * Date: 3/12/13
 * Time: 2:14 PM
 * Contents are property of Cappex.com LLC, and strictly confidential.
 */

@Repository
@Transactional
public class StudentCollegeDaoImpl implements StudentCollegeDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session currentSession() {
		return sessionFactory.getCurrentSession();
	}

	public List<College> getCollegesForStudent(long studentId) {
		return currentSession().createCriteria(College.class).list();
	}

	public List<Student> getStudents() {
		return currentSession()
				.createCriteria(Student.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
				.addOrder(Order.asc("firstName"))
				.list();
	}
}