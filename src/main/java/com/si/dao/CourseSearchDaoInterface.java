package com.si.dao;

import java.util.List;

import com.si.model.Course;

public interface CourseSearchDaoInterface {

	//list all courses for selected establishment
	List<Course> getCourseById(int estRegNo);

}