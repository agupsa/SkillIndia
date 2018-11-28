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
import com.si.service.CourseApplicationService;

@Controller
public class CourseApplicationController {
	@Autowired
	CourseApplicationService courseapply;
	
	
	@RequestMapping(value="/registerCourse", method= RequestMethod.POST)
    public ModelAndView courseApply(HttpServletRequest request,HttpServletResponse response, @ModelAttribute("contract") Contract contract)
	{  
       courseapply.saveApplication(contract); 
        return new ModelAndView("courseRegister");//will redirect to courseRegister request mapping  
    }  
}
