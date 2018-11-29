package com.si.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.si.model.Course;
import com.si.service.CourseApplicationService;
import com.si.service.SearchCourseService;

@Controller
@RequestMapping("/searchCourse")
public class CourseApplyController {

	@Autowired
	SearchCourseService scService;
	@Autowired
	CourseApplicationService caService;
	
	@RequestMapping("/{estRegNo}")
	public ModelAndView viewCourseList(@PathVariable int estRegNo, HttpServletRequest request,
			HttpServletResponse response) {
		// String s1=request.getParameter("estRegNo");
		// System.out.println(s1);
		// int estRegNo=Integer.parseInt(s1);
		System.out.println(estRegNo);
		// ModelAndView mv=new ModelAndView("estDisplay");
		List<Course> clst = scService.getCourseById(estRegNo);
		System.out.println(clst);
		// mv.addObject("elst", estList);
		// return mv;
		return new ModelAndView("courseDisplay", "clst", clst);
	}

	@RequestMapping("/apply/{courseId}")
	public ModelAndView applyCourse(@PathVariable int courseId, HttpServletRequest req, HttpServletResponse res) {
		System.out.println(courseId);
		Course course=caService.getCourse(courseId);
		System.out.println(course);
		return new ModelAndView("courseApplication","course",course);
	}
	
	
}
