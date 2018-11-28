package com.si.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.dao.CourseApplicationDao;
import com.si.model.Contract;
import com.si.model.Course;

@Service
public class CourseApplicationService {

	@Autowired
    CourseApplicationDao cadao;
	
	public void saveApplication(Contract contract) {
	
	 cadao.saveApplication(contract);
	}

}
