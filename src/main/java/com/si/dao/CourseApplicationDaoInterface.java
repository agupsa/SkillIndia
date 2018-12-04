package com.si.dao;

import com.si.model.Contract;
import com.si.model.Course;

public interface CourseApplicationDaoInterface {

	//get course object by course id
	Course getCourse(int courseId);

	//save data of course application in contract
	void saveApplication(Contract contract);

	//check candidate has already applied or not
	boolean checkCourse(Contract contract);

}