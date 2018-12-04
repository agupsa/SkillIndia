package com.si.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.dao.CourseApplicationDaoInterface;
import com.si.model.Contract;
import com.si.model.Course;

@Service
public class CourseApplicationService implements CourseApplicationServiceInterface {

	@Autowired
	CourseApplicationDaoInterface cadao;

	
	@Override
	public Course getCourse(int courseId) {

		return cadao.getCourse(courseId);

	}

	@Override
	public void saveApplication(Contract contract) {
		cadao.saveApplication(contract);

	}

	@Override
	public void saveCourseApply(Contract contract) {
		cadao.saveApplication(contract);
	}

	@Override
	public boolean checkCourse(Contract contract) {

		return cadao.checkCourse(contract);
	}

}
