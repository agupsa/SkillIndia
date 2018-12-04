package com.si.service;

import com.si.model.Contract;
import com.si.model.Course;

public interface EnterCourseServiceInterface {

	void enterCourse(Course course);

	int checkContractNo(Contract contract);

	void saveContractDetails(Contract contract);

	void rejectApply(int letterNo);

	void acceptOffer(int letterNo);

	void rejectOffer(int letterNo);

}