package com.si.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class AdminContrSetStatusDao {

	
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

	public int setContrStatus(int letterNo, int action) {
String ac = (action==1)?"Approved":"Rejected";
		
		String updateq="UPDATE gr5_contract SET gof_status='"+ac+"' WHERE gof_letter_no="+letterNo;
		System.out.println("Updating");
		return jdbcTemplate.update(updateq);
	}
	
	
	
}
