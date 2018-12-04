package com.si.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.si.model.Course;

public class CourseSearchDao implements CourseSearchDaoInterface {

	JdbcTemplate jdbcTemplate;

	// getter-setter for jdbcTemplate
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	//list all courses for selected establishment
	@Override
	public List<Course> getCourseById(int estRegNo) {
		String sql = "select * from gr5_courses where gco_ge_regno='" + estRegNo + "'";
		List<Course> clst = jdbcTemplate.query(sql, new ResultSetExtractor<List<Course>>() {

			public List<Course> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Course> lst = new ArrayList<Course>();
				while (rs.next()) {
					Course c = new Course();

					c.setCourseId(rs.getInt(1));
					c.setCourseName(rs.getString(2));
					c.setTrainerName(rs.getString(3));
					c.setTrainerContact(rs.getLong(4));
					c.setDomainName(rs.getString(5));
					c.setEstRegno(rs.getInt(6));
					c.setEstName(rs.getString(7));
					lst.add(c);
				}

				return lst;
			}

		});
		
		return clst;
	}

}
