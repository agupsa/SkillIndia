package com.si.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.si.dao.CourseApplicationDao;
import com.si.model.Course;

public class CourseApplicationService {

	@Autowired
    CourseApplicationDao cadao;
	
	public Course getCourse(int courseId) {
	
		return cadao.getCourse(courseId);
	}

}
