package com.si.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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

	/*public Course getCourse(int courseId){  
		System.out.println(courseId);
	    String sql="select * from gr5_courses where gco_course_id='" +courseId+ "'";  
	    Course c=jdbcTemplate.queryForObject(sql, new Object[]{courseId},new BeanPropertyRowMapper<Course>(Course.class));
	    System.out.println(c.getCourseId());
	    return c;
	}*/
	
	public Course getCourse(int courseId)
	{     
		System.out.println(courseId);
		   String SQL = "select * from gr5_courses where gco_course_id='"+courseId+"'";
		      Course c = jdbcTemplate.query(SQL, new ResultSetExtractor<Course>(){
		         
		         public Course extractData(ResultSet rs) throws SQLException, DataAccessException {
		            
		            Course co = new Course();  
		            while(rs.next()){  
		             Course cou=new Course();
		               cou.setCourseId(rs.getInt(1));
		               cou.setCourseName(rs.getString(2));
		               cou.setTrainerName(rs.getString(3));
		               cou.setTrainerContact(rs.getLong(4));
		               cou.setEstRegno(rs.getInt(6));
		               cou.setEstName(rs.getString(7));
		               System.out.println(cou);
		               return cou;
		               
		            }  
		            return co;  
		         }    	  
		      });
		   return c;
		}

/*	public void saveApplication(Contract contract) {
		
	    String sql="insert into gr5_contract(GOF_GC_REG_NO,GOF_GE_REGNO,GOF_GE_EST_NAME,GOF_GCO_COURSE_ID) values('"+contract.getCanRegNo()+"',"+contract.getEstRegNo()+",'"+contract.getEstName()+"','"+contract.getCourseId()+"')";  
	   jdbcTemplate.update(sql);  
	}*/

	public void saveCourseApply(Contract contract) {
		String sql="insert into gr5_contract(GOF_GC_REG_NO, GOF_GE_REGNO, GOF_GE_EST_NAME, GOF_GCO_COURSE_ID) values('"+contract.getCanRegNo()+"',"+contract.getEstRegNo()+",'"+contract.getEstName()+"','"+contract.getCourseId()+"')";  
		   jdbcTemplate.update(sql);  
		
	}  
}
