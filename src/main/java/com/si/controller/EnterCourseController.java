package com.si.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.si.model.Contract;
import com.si.model.Course;
import com.si.model.Establishment;
import com.si.service.EnterCourseService;

@Controller
public class EnterCourseController {

	@Autowired
	EnterCourseService ecservice;
	
	
	

	//Enter contract details controller
	@RequestMapping(value = "/sendOffer", method = RequestMethod.POST)
	public ModelAndView courseApply(HttpServletRequest req, HttpServletResponse res, @ModelAttribute("contract") Contract contract)
	{
		/*
		 *Checks if contract number is registered or not
		 *If registered enter details and send to candidate
		 *If not error
		 */	
			System.out.println(contract.getStartDate());
			int i = ecservice.checkContractNo(contract);
	
			System.out.println(i);
			if (i==1) {
				//if contract present
				ecservice.saveContractDetails(contract);
				return new ModelAndView("sendOffer","message", "Contract Data saved successfully");
			} 
			else if(i==0)
			{   //if contract not present
				return new ModelAndView("sendOffer", "message", "Check Contract Number");
				
			}
			return null;	
	}
	
	/* It will reject the candidate application by establishment*/    
    @RequestMapping(value="/reject/{letterNo}",method = RequestMethod.GET)    
    public ModelAndView rejectApply(@PathVariable int letterNo){    
    	ecservice.rejectApply(letterNo);    
    	return new ModelAndView("redirect:../establishmentlogin");  
    }     
	
    /* Candidate will accept the offer letter*/    
    @RequestMapping(value="/accept/{letterNo}",method = RequestMethod.GET)    
    public ModelAndView acceptOffer(@PathVariable int letterNo){    
    	ecservice.acceptOffer(letterNo);    
    	return new ModelAndView("redirect:../candidatelogin");  
    }    
    
    /* Candidate will  not accept the offer letter*/    
    @RequestMapping(value="/reject/{letterNo}",method = RequestMethod.GET)    
    public ModelAndView rejectOffer(@PathVariable int letterNo){    
    	ecservice.rejectOffer(letterNo);    
    	return new ModelAndView("redirect:../candidatelogin");  
    }    
}
