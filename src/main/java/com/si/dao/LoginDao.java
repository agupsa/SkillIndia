package com.si.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.si.model.Candidate;
import com.si.model.Establishment;
import com.si.model.Login;

public class LoginDao implements LoginDaoInterface {

	private JdbcTemplate jdbcTemplate;

	public LoginDao() {
		super();
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Object userLoginValidation(Login login) {
		System.out.println("Inside User validate");
		List<Map<String, Object>> lst;
		lst = jdbcTemplate.queryForList("select * from gr5_candidate where gc_username='" + login.getUsername() + "'");
		if (lst.size() > 0) {
			for (Map<String, Object> canMap : lst) {
				Candidate c = new Candidate();
				String pass = (String) canMap.get("gc_pass");
				if (login.getPass().equals(pass)) {
					System.out.println("Password is same");
					c.setStatus((String) canMap.get("gc_status"));
					c.setName((String) canMap.get("gc_name"));
					c.setUsername((String) canMap.get("gc_username"));
					
					
					
					
					switch (c.getStatus().toLowerCase()) {
					case "awaiting verification":
						break;
					case "apprenticeship confirm":
					case "awaiting contract verification":
					case "accepted offer letter":
					case "offer recieved":
					case "applied":
					case "verified": c.setCanRegNo((Integer)canMap.get("gc_reg_no"));

					}
					return c;
				}
				

			}

		}

		return null;
	}

	@Override
	public Object estLoginValidation(Login login) {
		// TODO Auto-generated method stub
		System.out.println("Inside Establishment validate");
		List<Map<String, Object>> lst;
		lst = jdbcTemplate.queryForList("select * from gr5_establishment where ge_email='" + login.getUsername() + "'");
		if (lst.size() > 0) {
			for (Map<String, Object> estMap : lst) {
				Establishment e = new Establishment();
				String pass = (String) estMap.get("ge_pass");
				if (login.getPass().equals(pass)) {
					System.out.println("Password is same");
					e.setStatus((String) estMap.get("ge_status"));
					e.setName((String) estMap.get("ge_est_name"));
					e.setEmail((String) estMap.get("ge_email"));
					e.setIndtype((String) estMap.get("ge_industry_type"));
					e.setNoOfEmp((Integer) estMap.get("ge_no_of_emp"));
					e.setNameOfHead((String) estMap.get("ge_name_of_head"));
					e.setContactNo((long) estMap.get("ge_contact_no"));
					switch (e.getStatus().toLowerCase()) {
					case "awaiting verification":
						break;
					case "apprenticeship confirm":
					case "awaiting contract verification":
					case "accepted offer letter":
					case "offer recieved":
					case "applied":
					case "verified": e.setEstRegNo((Integer)estMap.get("ge_regno"));
					e.setBankName((String) estMap.get("ge_bank_name"));
					e.setIFSC((String) estMap.get("ge_IFSC_code"));
					e.setAccountNo((Long) estMap.get("ge_account_no"));

					}
					return e;
				}
				

			}

		}

		return null;
	}
	
	
	
	
}
