package com.si.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.si.service.SearchCourseService;
import com.si.service.SearchEstService;
import com.si.model.Course;
import com.si.model.Establishment;
/**
 * 
 * @author GR5 LTI
 * Controller to search for Establishments to apply to.
 *
 */
@Controller
public class SearchController {

	@Autowired
	private SearchEstService eService;

	@Autowired
	private SearchCourseService cService;

	@RequestMapping("/searchEst{establishmentName}")
	public ModelAndView viewSingleList(HttpServletRequest request, HttpServletResponse response) {
		String establishmentName = request.getParameter("establishmentName");
		System.out.println(establishmentName);
		// ModelAndView mv=new ModelAndView("estDisplay");
		List<Establishment> estList = eService.getEstByName(establishmentName);
		System.out.println(estList);
		// mv.addObject("elst", estList);
		// return mv;
		return new ModelAndView("estDisplay", "elst", estList);
	}

	/*@RequestMapping("/searchCourse/{estRegNo}")
	public ModelAndView viewCourseList(@PathVariable int estRegNo, HttpServletRequest request,
			HttpServletResponse response) {
		// String s1=request.getParameter("estRegNo");
		// System.out.println(s1);
		// int estRegNo=Integer.parseInt(s1);
		System.out.println(estRegNo);
		// ModelAndView mv=new ModelAndView("estDisplay");
		List<Course> clst = cService.getCourseById(estRegNo);
		System.out.println(clst);
		// mv.addObject("elst", estList);
		// return mv;
		return new ModelAndView("courseDisplay", "clst", clst);
	}*/
}
