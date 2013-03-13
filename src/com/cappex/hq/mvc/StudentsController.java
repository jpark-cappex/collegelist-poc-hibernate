package com.cappex.hq.mvc;

import com.cappex.hq.service.StudentCollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Creator: Junho Park
 * Date: 3/13/13
 * Time: 9:47 AM
 * Contents are property of Cappex.com LLC, and strictly confidential.
 */

@Controller
@RequestMapping("/students")
public class StudentsController {

	@Autowired
	private StudentCollegeService studentCollegeService;

	@RequestMapping(method = RequestMethod.GET)
	public String getStudents(Map<String, Object> model) {
		model.put("students", studentCollegeService.getStudents());
		return "students";
	}

	@RequestMapping(value="/{id}", method= RequestMethod.GET)
	public String getStudent(@PathVariable long id, Map<String, Object> model) {
		model.put("student", studentCollegeService.getStudent(id));
		return "student";
	}
}