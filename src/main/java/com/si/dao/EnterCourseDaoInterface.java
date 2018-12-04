package com.si.dao;

import com.si.model.Contract;
import com.si.model.Course;

public interface EnterCourseDaoInterface {

	//method will enter data of courses in database table filled form by establishment
	public void enterCourse(Course course);

	//check whether establishment entered correct contract number or not
	public int checkContractNo(Contract contract);

	//save contract details like stipend,start date, end date entered by establishment
	public void saveContractDetails(Contract contract);

	//method for rejecting candidate application by establishment
	public void rejectApply(int letterNo);

	//method for candidate to accept offer sent by establishment 
	public 	void acceptOffer(int letterNo);

	//method for candidate to reject offer sent by establishment 
	public void rejectOffer(int letterNo);

}