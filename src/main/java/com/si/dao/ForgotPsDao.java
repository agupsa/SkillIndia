package com.si.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.si.model.Candidate;

public class ForgotPsDao {

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public ForgotPsDao() {
		super();
	}

	public void forgotPassword(Candidate can) {
		
		String sql="update gr5_candidate set GC_PASS='"+can.getPass()+"' where GC_USERNAME='"+can.getUsername()+"' and GC_AADHAR_NO='"+can.getAadharNo()+"'";    
	     jdbcTemplate.update(sql); 
		
	}

	
}
