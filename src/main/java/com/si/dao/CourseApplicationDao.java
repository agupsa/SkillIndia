package com.si.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

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

	/*
	 * public Course getCourse(int courseId){ System.out.println(courseId); String
	 * sql="select * from gr5_courses where gco_course_id='" +courseId+ "'"; Course
	 * c=jdbcTemplate.queryForObject(sql, new Object[]{courseId},new
	 * BeanPropertyRowMapper<Course>(Course.class));
	 * System.out.println(c.getCourseId()); return c; }
	 */

	public Course getCourse(int courseId) {
		System.out.println(courseId);
		String SQL = "select * from gr5_courses where gco_course_id='" + courseId + "'";
		Course c = jdbcTemplate.query(SQL, new ResultSetExtractor<Course>() {

			public Course extractData(ResultSet rs) throws SQLException, DataAccessException {

				Course co = new Course();
				while (rs.next()) {
					Course cou = new Course();
					cou.setCourseId(rs.getInt(1));
					cou.setCourseName(rs.getString(2));

					cou.setEstRegno(rs.getInt(6));
					cou.setEstName(rs.getString(7));
					System.out.println(cou);
					return cou;

				}
				return co;
			}
		});
		System.out.println("last :" + c.getCourseId() + "\t" + c.getCourseName());
		return c;
	}

	private int getSeq(String fetchcPK) {
		int pk = (int) jdbcTemplate.queryForObject(fetchcPK, Integer.class);
		return pk;

	}

	public void saveApplication(Contract contract) {
		String fetchcPK = "select gr5_contract_seq.nextval from dual";
		System.out.println(fetchcPK);
		contract.setLetterNo(getSeq(fetchcPK));
		String sql = "insert into gr5_contract(GOF_LETTER_NO,GOF_GC_REG_NO, GOF_GE_REGNO, GOF_GE_EST_NAME, GOF_GCO_COURSE_ID,GOF_STATUS) values('"+ contract.getLetterNo() + "','"+ contract.getCanRegNo()+"'," + contract.getEstRegNo() + ",'" + contract.getEstName() + "','"+ contract.getCourseId() + "','Applied')";
		jdbcTemplate.update(sql);
	}

	public void saveCourseApply(Contract contract) {
		String sql = "insert into gr5_contract(GOF_GC_REG_NO, GOF_GE_REGNO, GOF_GE_EST_NAME, GOF_GCO_COURSE_ID) values('"
				+ contract.getCanRegNo() + "'," + contract.getEstRegNo() + ",'" + contract.getEstName() + "','"
				+ contract.getCourseId() + "')";
		jdbcTemplate.update(sql);

	}

	//check candidate has already applied or not
	public int checkCourse(Contract contract) {
		System.out.println("check dao");
		List<Map<String, Object>> lst;
		lst = jdbcTemplate.queryForList("select * from gr5_contract where GOF_GC_REG_NO='" + contract.getCanRegNo()
				+ "' and GOF_GCO_COURSE_ID='" + contract.getCourseId() + "'");
		if (lst.size() > 0) {
			return 1;
		} else {
			return 0;
		}

	}
}
