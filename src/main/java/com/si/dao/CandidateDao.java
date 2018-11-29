package com.si.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.si.model.Address;
import com.si.model.Candidate;


/*
 * Data access object that stores candidate data in table gr5_candidate and gr5_address
 */
public class CandidateDao implements CandidateDaoInteface {

	private JdbcTemplate jdbcTemplate;

	public CandidateDao() {
		super();
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	
	/*
	 * Method to fetch sequence from db, for primary key
	 */
	@Override
	public int getSeq(String fetchPK) {
		int pk = (int) jdbcTemplate.queryForObject(fetchPK, Integer.class);
		return pk;

	}
	
	

	/*
	 * Method to save data
	 */
	@Override
	public int registerCandidate(Candidate c) {

		String[] paths = c.getFilePath();
		int i=0,x=0;
			
			c.setStatus(new String("Awaiting Verification"));
			String query_candidate = "insert into gr5_candidate values" + "(" + c.getCanRegNo() + ",'" + c.getName() + "','"
					+ c.getGender() + "', null,'" + /* TODO Add dob here */ c.getUsername() + "','" + c.getPass()
					+ "'," + c.getContactNo() + "," + c.getAadharNo() + ",'" + c.getFatherName() + "','"
					+ c.getQualification() + "','" + c.getCollegeName() + "'," + c.getMarks()
					+ ",'" + paths[0] + "','" + paths[1] + "','" + paths[2] + "','" + c.getStatus() + "')";
			i = jdbcTemplate.update(query_candidate);
			if(i>0) {
				
				String fetchaPK = "select gr5_address_seq.nextval from dual";
				Address tempaddr = c.getAddr();
				tempaddr.setAddId(getSeq(fetchaPK));
				c.setAddr(tempaddr);
				String queryforAddress = "insert into gr5_address values ("+c.getAddr().getAddId()+",'"
						  + c.getAddr().getAddr() + "','" + c.getAddr().getState() + "','" +
						  c.getAddr().getCity() + "'," + c.getAddr().getPincode() + "," + c.getCanRegNo()+",null)"; 
				x = jdbcTemplate.update(queryforAddress);
						 
				
				
				
			}else {
				//TODO rollback candidate save
			}

			//TODO replace with logger
			System.out.println("INSERTED RECORD: "+ c.getCanRegNo()+ "\t" + c.getAadharNo() + " " + c.getContactNo());
			
			return x;


	}

}
