package com.si.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.si.model.Contract;
import com.si.model.Course;

public class EnterCourseDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	private int getSeq(String fetchcPK) {
		int pk = (int) jdbcTemplate.queryForObject(fetchcPK, Integer.class);
		return pk;

	}

	public void enterCourse(Course course) {
		String fetchcPK = "select gr5_course_seq.nextval from dual";
		System.out.println(fetchcPK);
		course.setCourseId(getSeq(fetchcPK));
		String sql = "insert into gr5_courses(GCO_COURSE_ID,GCO_COURSE_NAME, GCO_TRAINER_NAME, GCO_TRAINER_CONTACT_NO, GCO_DOMAIN_NAME,GCO_GE_REGNO,GCO_GE_NAME) values('"+course.getCourseId()+ "','"+course.getCourseName()+"','" +course.getTrainerName()+ "','" + course.getTrainerContact() + "','"+course.getDomainName()+ "','"+course.getEstRegno()+"','"+course.getEstName()+"')";
		jdbcTemplate.update(sql);
	}

	public int checkContractNo(Contract contract) {
	
		System.out.println("check contract dao");
		List<Map<String, Object>> lst;
		lst = jdbcTemplate.queryForList("select * from gr5_contract where GOF_LETTER_NO='" +contract.getLetterNo()+ "'");
		if (lst.size() > 0) {
			return 1;
		} else {
			return 0;
		}
	}

	public void saveContractDetails(Contract contract) {
				
			String sql = "update gr5_contract set GOF_STIPEND='"+contract.getStipend()+"',GOF_START_DATE=TO_DATE('"+contract.getStartDate()+"', 'YYYY-MM-DD'),GOF_END_DATE=TO_DATE('"+contract.getEndDate()+"', 'YYYY-MM-DD'),GOF_STATUS='Offered' where GOF_LETTER_NO='"+contract.getLetterNo()+"'";
			jdbcTemplate.update(sql);

		}

	public void rejectApply(int letterNo) {
	
		String sql="update gr5_contract set GOF_STATUS='Rejected by Est' where GOF_LETTER_NO='"+letterNo+"'";    
	     jdbcTemplate.update(sql); 
		
	}

	public void acceptOffer(int letterNo) {
		String sql="update gr5_contract set GOF_STATUS='Accepted' where GOF_LETTER_NO='"+letterNo+"'";    
	     jdbcTemplate.update(sql); 
		
	}

	public void rejectOffer(int letterNo) {
		String sql="update gr5_contract set GOF_STATUS='Not Accepted' where GOF_LETTER_NO='"+letterNo+"'";    
	     jdbcTemplate.update(sql); 
				
	}
		
}
	
	

