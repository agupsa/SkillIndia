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

	public Object validate(Login login) {
		System.out.println("Inside validate");
		List<Map<String, Object>> lst;
			lst = jdbcTemplate.queryForList("select * from gr5_candidate where gc_reg_no='" + login.getUsername() + "'");
			if (lst.size() > 0) {
				Candidate c = new Candidate();
				String RegNo = (String) lst.get(0).get("user_id");
				String name = (String) lst.get(0).get("first_name");
				String email = (String) lst.get(0).get("email");
				String pass = (String) lst.get(0).get("password");

				c.setRegNo(Integer.parseInt(RegNo));
				c.setName(name);
				c.setUsername(email);

				if (login.getPass().equals(pass)) {
					System.out.println("Password is same");
					return c;
				}
			}
		
		return null;
	}
}
