package com.si.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.si.model.Establishment;

public class EstablishmentSearchDao {


	JdbcTemplate jdbcTemplate;

	//getter-setter for jdbcTemplate
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Establishment> getEstByName(String establishmentName) {
		String sql = "select * from gr5_establishment where ge_est_name='"+establishmentName+"'";
	   List<Establishment> est=jdbcTemplate.query(sql, new ResultSetExtractor<List<Establishment>>() {
	 
	     public List<Establishment> extractData(ResultSet rs) throws SQLException,
					DataAccessException {
	        	 List<Establishment> lst = new ArrayList<Establishment>();
	            while(rs.next()) {
	               Establishment e=new Establishment();
	                //contact.setId(rs.getInt("contact_id"));
	             
	                e.setEstRegNo(rs.getInt(1));
	                e.setName(rs.getString(2));
	                e.setEmail(rs.getString(3));
	                /*e.setPass(rs.getString(4));*/
	                e.setIndtype(rs.getString(5));
	                e.setNoOfEmp(rs.getInt(6));
	                e.setWorkdays(rs.getInt(7));
	                e.setNameOfHead(rs.getString(8));
	                e.setContactNo(rs.getLong(9));
	                /*e.setBankName(rs.getString(10));
	                e.setIFSC(rs.getString(11));
	                e.setAccountNo(rs.getLong(12));
	                e.setStatus(rs.getString(13));*/
	              //e.setAddr(rs.getClass(Address));
	               // e.setCourses((Courses) rs.getObject(14));
	                lst.add(e);
	            }
	 
	            return lst;
	        }
	 
	    });
	   System.out.println(est);
	return est;
	}

}
