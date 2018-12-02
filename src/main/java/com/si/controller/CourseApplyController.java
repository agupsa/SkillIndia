package com.si.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.si.model.Contract;
import com.si.model.Course;
import com.si.service.CourseApplicationService;
import com.si.service.SearchCourseService;

@Controller
@SessionAttributes({"clst","course"})
public class CourseApplyController {

	@Autowired
	SearchCourseService scService;
	@Autowired
	CourseApplicationService caService;

	// search course by establishment reg no
	@RequestMapping("/searchCourse/{estRegNo}")
	public ModelAndView viewCourseList(@PathVariable("estRegNo") int estRegNo) {

		System.out.println(estRegNo);
		ModelAndView mv = new ModelAndView("redirect:../courseDisplay.jsp");
		List<Course> clst = scService.getCourseById(estRegNo);
		System.out.println(clst);
		mv.addObject("clst", clst);
		return mv;
	}

	@RequestMapping("/apply/{courseId}")
	public ModelAndView applyCourse(@PathVariable("courseId") int courseId) {
		System.out.println(courseId);
		Course course = caService.getCourse(courseId);
		System.out.println(course);
		return new ModelAndView("redirect:../courseApplication.jsp", "course", course);
	}

	@RequestMapping(value = "/applicationSave", method = RequestMethod.POST)
	public ModelAndView courseApplication(@ModelAttribute("cont") Contract contract) {
		boolean check = caService.checkCourse(contract);
		
		System.out.println(check);
		if (check==false) {
			//if new registration
			caService.saveApplication(contract);
			return new ModelAndView("courseRegister","message", "Course Application is Successful!");
		} 
		else
		{   //if already registered
			return new ModelAndView("courseRegister", "message", "Already registered for course..Cannot apply again");
			
		}
	}

}
