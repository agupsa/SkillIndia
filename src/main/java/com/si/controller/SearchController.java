package com.si.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.si.service.SearchEstService;
import com.si.model.Establishment;

@Controller
public class SearchController {
	
	@Autowired
	private SearchEstService eService;

	
	@RequestMapping("/searchEst{establishmentName}")
	public ModelAndView viewSingleList(HttpServletRequest request,HttpServletResponse response)
	{   String establishmentName=request.getParameter("establishmentName");
	    System.out.println(establishmentName);
		ModelAndView mv=new ModelAndView("estDisplay");
		List<Establishment> estList=eService.getEstByName(establishmentName);
		System.out.println(estList);
		mv.addObject("estList", estList);
		return mv;
	}
}
