package com.si.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.si.model.Establishment;
import com.si.service.SearchEstServiceInterface;

/**
 * 
 * @author GR5 LTI Controller to search for Establishments to apply to.
 *
 */
@Controller
public class SearchController {

	@Autowired
	private SearchEstServiceInterface eService;

	// Returns list of Establishments on basis of search terms
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

}
