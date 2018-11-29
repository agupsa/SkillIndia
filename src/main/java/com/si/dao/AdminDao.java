package com.si.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.si.model.Login;

public class AdminDao {

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

	public Boolean adminLogin(Login login) {
		// TODO Add Logger
		System.out.println("inside admin logindao: "+login);
		if (login.getUsername().equals("admin")) {
			if (login.getPass().equals("pass")) {
				System.out.println("Dao logged in");
				return true;
			}
		}
		System.out.println("Dao not logged in");
		return false;
	}

}
