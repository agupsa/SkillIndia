package com.si.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class AdminContrSetStatusDao {
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public AdminContrSetStatusDao() {
		super();
	}


}
