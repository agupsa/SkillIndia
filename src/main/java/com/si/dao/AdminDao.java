package com.si.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.si.model.Login;
import com.si.model.MD5;

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
			if (login.getPass().equals(MD5.getMd5("pass"))) {
				
				return true;
			}
		}
	
		return false;
	}

}
