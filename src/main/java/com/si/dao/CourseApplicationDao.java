package com.si.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.si.model.Contract;
import com.si.model.Course;

public class CourseApplicationDao {

	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Course getCourse(int courseId) {
		String sql = "select * from gr5_courses where gco_course_id=?";
		return jdbcTemplate.queryForObject(sql, new Object[] { courseId },
				new BeanPropertyRowMapper<Course>(Course.class));
	}

	public void saveApplication(Contract contract) {

		String sql = "insert into gr5_contract(GOF_GC_REG_NO,GOF_GE_REGNO,GOF_GE_EST_NAME,GOF_GCO_COURSE_ID) values('"
				+ contract.getCanRegNo() + "'," + contract.getEstRegNo() + ",'" + contract.getEstName() + "','"
				+ contract.getCourseId() + "')";
		jdbcTemplate.update(sql);
	}

}
