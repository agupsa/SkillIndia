package com.si.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class AdminEstSetStatus {
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public AdminEstSetStatus() {
		super();
	}
	
	public int setEstStatus(int estRegno, int action) {
		String ac = (action==1)?"Verified":"Rejected";
		
		String updateq="UPDATE gr5_establishment SET ge_status='"+ac+"' WHERE ge_regno="+estRegno;
		System.out.println("Updating");
		return jdbcTemplate.update(updateq);
		
	}

}
