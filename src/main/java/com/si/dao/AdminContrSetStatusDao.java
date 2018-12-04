package com.si.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class AdminContrSetStatusDao implements AdminContrSetStatusDaoInterface {

	
	JdbcTemplate jdbcTemplate;

	public AdminContrSetStatusDao() {
		super();
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	//set status of contract by admin
	@Override
	public int setContrStatus(int letterNo, int action) {
String ac = (action==1)?"Approved":"Rejected";
		
		String updateq="UPDATE gr5_contract SET gof_status='"+ac+"' WHERE gof_letter_no="+letterNo;
		
		return jdbcTemplate.update(updateq);
	}
	
	
	
}
