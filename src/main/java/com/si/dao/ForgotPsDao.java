package com.si.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.si.model.Candidate;
import com.si.model.Establishment;

public class ForgotPsDao {

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public void forgotPassword(Candidate can) {
		
		String sql="update gr5_candidate set GC_PASS='"+can.getPass()+"' where GC_USERNAME='"+can.getUsername()+"' and GC_AADHAR_NO='"+can.getAadharNo()+"'";    
	     jdbcTemplate.update(sql); 
		
	}

	public void forgotPasswordEst(Establishment est) {
	
		String sql="update gr5_establishment set GE_PASS='"+est.getPass()+"' where GE_EMAIL='"+est.getEmail()+"' and GE_TIN='"+est.getTin()+"'";    
	     jdbcTemplate.update(sql); 
	}

	
}
