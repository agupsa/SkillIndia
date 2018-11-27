package com.si.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.si.model.Candidate;
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
		System.out.println("Inside validate");
		List<Map<String, Object>> lst;
		lst = jdbcTemplate.queryForList("select * from gr5_candidate where gc_username='" + login.getUsername() + "'");
		if (lst.size() > 0) {
			for (Map<String, Object> canMap : lst) {
				Candidate c = new Candidate();
				String pass = (String) lst.get(0).get("pass");
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

}
