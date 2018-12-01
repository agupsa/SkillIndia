package com.si.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class AdminEstSetStatusDao {
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
	
	public int setEstStatus(int estRegno, int action) {
		String ac = (action==1)?"Verified":"Rejected";
		
		String updateq="UPDATE gr5_establishment SET ge_status='"+ac+"' WHERE ge_regno="+estRegno;
		System.out.println("Updating");
		return jdbcTemplate.update(updateq);
		
	}

}
