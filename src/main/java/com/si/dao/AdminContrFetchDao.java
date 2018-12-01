package com.si.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.si.model.Contract;

public class AdminContrFetchDao {
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public AdminContrFetchDao() {
		super();
		
	}

	public List<Contract> getUnverifiedContr() {
		String queryuContr = "select * from gr5_contract where gco_status='Awaiting Verification'";
		List<Contract> uclst = jdbcTemplate.query(queryuContr, new ResultSetExtractor<List<Contract>>() {

			public List<Contract> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Contract> lst = new ArrayList<Contract>();
				while (rs.next()) {
					Contract c = new Contract();
					c.setLetterNo(rs.getInt(1));
					c.setCanRegNo(rs.getInt(2));
					c.setEstRegNo(rs.getInt(3));
					c.setEstName(rs.getString(4));
					c.setCourseId(rs.getInt(5));
					c.setStipend(rs.getFloat(6));
					c.setStartDate(rs.getString(7));
					c.setEndDate(rs.getString(8));
					c.setStatus(rs.getString(9));
					lst.add(c);
				}

				return lst;
			}

		});	
		return uclst;
	}

}
