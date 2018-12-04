package com.si.service;

import com.si.model.Contract;
import com.si.model.Course;

public interface CourseApplicationServiceInterface {

	Course getCourse(int courseId);

	void saveApplication(Contract contract);

	void saveCourseApply(Contract contract);

	boolean checkCourse(Contract contract);

}