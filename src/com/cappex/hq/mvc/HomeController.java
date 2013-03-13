package com.cappex.hq.mvc;

import com.cappex.hq.service.StudentCollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Creator: Junho Park
 * Date: 3/12/13
 * Time: 2:15 PM
 * Contents are property of Cappex.com LLC, and strictly confidential.
 */

@Controller
public class HomeController {

	@Autowired
	private StudentCollegeService studentCollegeService;

	@RequestMapping({"/", "/colleges"})
	public String showCollegeList(Map<String, Object> model) {
		model.put("colleges", studentCollegeService.getCollegesForStudent(1L));
		return "home";
	}

	/*@RequestMapping("/students")
	public String showStudents(Map<String, Object> model) {
		model.put("students", studentCollegeService.getStudents());
		return "home";
	}*/
}