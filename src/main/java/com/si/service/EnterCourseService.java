package com.si.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.dao.EnterCourseDaoInterface;
import com.si.model.Contract;
import com.si.model.Course;

@Service
public class EnterCourseService implements EnterCourseServiceInterface {

	@Autowired
	EnterCourseDaoInterface ecdao;

	@Override
	public void enterCourse(Course course) {

		ecdao.enterCourse(course);
	}

	@Override
	public int checkContractNo(Contract contract) {

		return ecdao.checkContractNo(contract);
	}

	@Override
	public void saveContractDetails(Contract contract) {

		ecdao.saveContractDetails(contract);

	}

	@Override
	public void rejectApply(int letterNo) {

		ecdao.rejectApply(letterNo);

	}

	@Override
	public void acceptOffer(int letterNo) {

		ecdao.acceptOffer(letterNo);
	}

	@Override
	public void rejectOffer(int letterNo) {

		ecdao.rejectOffer(letterNo);
	}

}
