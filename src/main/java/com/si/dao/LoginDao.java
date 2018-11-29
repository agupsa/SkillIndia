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
				String pass = (String) canMap.get("gc_pass");
				if (login.getPass().equals(pass)) {
					Candidate c = new Candidate();
					System.out.println("Password is same");
					c.setStatus((String) canMap.get("gc_status"));
					c.setName((String) canMap.get("gc_name"));
					c.setUsername((String) canMap.get("gc_username"));
					/*String[] str = {"gc_photo","gc_aadhar_card","gc_edu_certi"};
					String[] paths= new String[3];
					for(int i=0;i<3;++i) {
						paths[i] = canMap.get(str[i]).toString();
					}
					c.setFilePath(paths);
					System.out.println(paths);*/
					System.out.println(c.getStatus());
					if(!(c.getStatus().equalsIgnoreCase("awaiting verification"))) {

						//objects return big decimal, need to get string from to string method 
						//instead of type casting directly to string or int or INTEGER
						c.setCanRegNo(Integer.parseInt(canMap.get("gc_reg_no").toString()));
						
					}
					
					System.out.println("test1");
					/*switch (c.getStatus().toLowerCase()) {
					case "awaiting verification":
						break;
					case "verified": c.setCanRegNo((Integer)canMap.get("gc_reg_no"));
					case "apprenticeship confirm":
					case "awaiting contract verification":
					case "accepted offer letter":
					case "offer recieved":
					case "applied":
					

					}*/
					System.out.println("yay");
					return c;
				}
				

			}

		}

		System.out.println("Why me?");
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
					e.setNoOfEmp(Integer.parseInt(estMap.get("ge_no_of_emp").toString()));
					e.setNameOfHead((String) estMap.get("ge_name_of_head"));
					e.setContactNo(Long.parseLong(estMap.get("ge_contact_no").toString()));
					if(e.getStatus().toLowerCase()!="awaiting verification") {
						 e.setEstRegNo(Integer.parseInt(estMap.get("ge_regno").toString()));
							e.setBankName((String) estMap.get("ge_bank_name"));
							e.setIFSC((String) estMap.get("ge_IFSC_code"));
							e.setAccountNo(Long.parseLong(estMap.get("ge_account_no").toString()));
						
					}
					
					
					/*switch (e.getStatus().toLowerCase()) {
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

					}*/
					System.out.println("got est");
					return e;
				}
				

			}

		}

		return null;
	}
	
	
	
	
}
