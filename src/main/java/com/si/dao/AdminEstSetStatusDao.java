package com.si.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class AdminEstSetStatusDao implements AdminEstSetStatusDaoInterface {
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public AdminEstSetStatusDao() {
		super();
	}
	
	//Sets Status of establishment by admin
	@Override
	public int setEstStatus(int estRegno, int action) {
		String ac = (action==1)?"Verified":"Rejected";	
		return jdbcTemplate.update("UPDATE gr5_establishment SET ge_status='"+ac+"' WHERE ge_regno="+estRegno);
		
	}

}
