package com.si.dao;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 
 * @author GR5 LTI
 * Sets status of candidate on basis of admin click action
 *
 */

public class AdminCanSetStatusDao implements AdminCanSetStatusInterface {
	
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

	//Sets Status of candidate
	@Override
	public int setCanStatus(int canRegno, int action) {
		String ac = (action==1)?"Verified":"Rejected";
		return jdbcTemplate.update("UPDATE gr5_candidate SET gc_status='"+ac+"' WHERE gc_reg_no="+canRegno);
		
	}
	

}
