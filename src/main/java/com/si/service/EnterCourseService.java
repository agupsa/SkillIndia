package com.si.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.dao.EnterCourseDao;
import com.si.model.Contract;
import com.si.model.Course;

@Service
public class EnterCourseService {

	@Autowired
	EnterCourseDao ecdao;

	public void enterCourse(Course course) {
		
		ecdao.enterCourse(course);		
	}

	public int checkContractNo(Contract contract) {
		
		return ecdao.checkContractNo(contract);
	}

	public void saveContractDetails(Contract contract) {
	     
		ecdao.saveContractDetails(contract);
		
	}

	public void rejectApply(int letterNo) {
	     
		ecdao.rejectApply(letterNo);
		
	}

	public void acceptOffer(int letterNo) {
		
		ecdao.acceptOffer(letterNo);
	}

	public void rejectOffer(int letterNo) {
				
		ecdao.rejectOffer(letterNo);
	}




}
