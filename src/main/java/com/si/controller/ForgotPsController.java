package com.si.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.si.model.Candidate;
import com.si.service.ForgotPsService;

@Controller
public class ForgotPsController {
	
	@Autowired
	ForgotPsService fps;

	@RequestMapping(value="/forgotPsCan",method=RequestMethod.POST)
	
	public ModelAndView forgotPassword(@ModelAttribute("candidate") Candidate can)
	{
		fps.forgotPassword(can);
				
			return new ModelAndView("PswSet","msg","Password has changed successfully");		
		
	}	
	
}
	
	
	
	

