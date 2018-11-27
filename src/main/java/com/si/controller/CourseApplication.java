package com.si.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.si.model.Course;
import com.si.service.CourseApplicationService;

public class CourseApplication {
	
	@Autowired  
    CourseApplicationService cService;//will inject dao from xml file  
	
	 /* It displays object data into form for the given id.  
     * The @PathVariable puts URL data into variable.*/  
    @RequestMapping(value="/apply/{courseId}")  
    public ModelAndView edit(@PathVariable int courseId){  
        Course course=cService.getCourse(courseId);  
        return new ModelAndView("courseApplication","course",course);  
    }  

    
}
