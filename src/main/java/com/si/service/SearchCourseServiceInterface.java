package com.si.service;

import java.util.List;

import com.si.model.Course;

public interface SearchCourseServiceInterface {

	List<Course> getCourseById(int estRegNo);

}