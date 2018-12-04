package com.si.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.dao.CourseSearchDaoInterface;
import com.si.model.Course;


@Service
public class SearchCourseService {

	@Autowired
    CourseSearchDaoInterface csdao;
	
	public List<Course> getCourseById(int estRegNo) {
		return csdao.getCourseById(estRegNo);
		
		
	}

	
}
