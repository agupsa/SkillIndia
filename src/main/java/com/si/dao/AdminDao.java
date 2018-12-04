package com.si.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.si.model.Login;

public class AdminDao implements AdminDaoInterface {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public AdminDao() {
		super();
	}

	//checks username and password for admin login
	@Override
	public Boolean adminLogin(Login login) {
		if (login.getUsername().equals("admin")) {
			if (login.getPass().equals("pass")) {
				
				return true;
			}
		}
	
		return false;
	}

}
