package com.si.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.si.model.Contract;
import com.si.service.CourseApplicationService;



@Controller
public class CourseApplicationController {


	@Autowired
	CourseApplicationService courseapply;
	
/*	@RequestMapping(value="/registerCourse", method= RequestMethod.POST)
    public ModelAndView courseApply(HttpServletRequest request,HttpServletResponse response, @ModelAttribute("contract") Contract contract)
	{   System.out.println("mapping");
	    boolean result;
	    ModelAndView modelAndView = null;
	    int canRegNo = contract.getCanRegNo();
	  int courseId=contract.getCourseId();
	  result =courseapply.isValidCourse(canRegNo, courseId);
		//courseapply.saveApplication(contract); 
        return new ModelAndView("courseRegister");//will redirect to courseRegister request mapping  
    }  */
	
	//Apply for course controller
	@RequestMapping(value = "/registerCourse", method = RequestMethod.POST)
	public ModelAndView courseApply(HttpServletRequest req, HttpServletResponse res, @ModelAttribute("contract") Contract contract) {

		/*
		 *Checks if candidate is registered already with the course or not
		 *If registered he's not allowed to do so again
		 *If not he can apply for the course
		 */	
			
			boolean i = courseapply.checkCourse(contract);
	
			System.out.println(i);
			if (i==false) {
				//if new registration
				courseapply.saveApplication(contract);
				return new ModelAndView("courseRegister","message", "Course Application is Successful!");
			} 
			else 
			{   //if already registered
				return new ModelAndView("courseRegister", "message", "Already registered for course..Cannot apply again");
				
			}
	}

	
	
	

}
