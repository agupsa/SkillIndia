package com.si.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class AdminCanSetStatusDao {
	
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public AdminCanSetStatusDao() {
		super();
	}

	public int setCanStatus(int canRegno, int action) {
		String ac = (action==1)?"Verified":"Rejected";
		
		String updateq="UPDATE gr5_candidate SET gc_status='"+ac+"' WHERE gc_reg_no="+canRegno;
		System.out.println("Updating");
		return jdbcTemplate.update(updateq);
		
	}
	

}
