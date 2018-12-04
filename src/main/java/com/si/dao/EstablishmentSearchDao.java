package com.si.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.si.model.Address;
import com.si.model.Establishment;

public class EstablishmentSearchDao implements EstablishmentSearchDaoInterface {


	JdbcTemplate jdbcTemplate;

	//getter-setter for jdbcTemplate
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//This method Fetches search result of establishment 
	@Override
	public List<Establishment> getEstByName(String establishmentName) {
		String sql = "select * from gr5_establishment left join gr5_address on gr5_establishment.ge_regno=gr5_address.ga_ge_regno where ge_est_name='"+establishmentName+"'";
	   List<Establishment> est=jdbcTemplate.query(sql, new ResultSetExtractor<List<Establishment>>() {
	 
	     public List<Establishment> extractData(ResultSet rs) throws SQLException,
					DataAccessException {
	        	 List<Establishment> lst = new ArrayList<Establishment>();
	            while(rs.next()) {
	               Establishment e=new Establishment();
	               Address addr = new Address();
	              
	             
	                e.setEstRegNo(rs.getInt(1));
	                e.setName(rs.getString(2));
	                e.setEmail(rs.getString(3));
	               
	                e.setIndtype(rs.getString(5));
	                e.setNoOfEmp(rs.getInt(6));
	                e.setWorkdays(rs.getInt(7));
	                e.setNameOfHead(rs.getString(8));
	                e.setContactNo(rs.getLong(9));
	                addr.setAddr(rs.getString(17));
	                addr.setCity(rs.getString(18));
	                addr.setState(rs.getString(19));
	         
	            	e.setAddr(addr);
	                lst.add(e);
	            }
	 
	            return lst;
	        }
	 
	    });
	
	return est;
	}

}
