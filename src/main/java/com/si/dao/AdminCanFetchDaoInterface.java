package com.si.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.si.model.Candidate;

public interface AdminCanFetchDaoInterface {

	public JdbcTemplate getJdbcTemplate();

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate);

	public List<Candidate> getUnverifiedCan();

	public String getFilePath(int canRegNo, int fileId);

}