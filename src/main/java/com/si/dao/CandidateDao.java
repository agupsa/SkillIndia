package com.si.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import com.si.model.Candidate;

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

	public int getSeq(String fetchPK) {
		int pk = (int) jdbcTemplate.queryForObject(fetchPK, Integer.class);
		return pk;

	}
	
	
	///working with one table finally

	@Override
	public int registerCandidate(Candidate cr) {

			String fetchPK = "select gr5_candidate_seq.nextval from dual";
			cr.setRegNo(getSeq(fetchPK));
			cr.setStatus(new String("Awaiting Verification"));
			String query_candidate = "insert into gr5_candidate values" + "(" + cr.getRegNo() + ",'" + cr.getName() + "','"
					+ cr.getGender() + "', null,'" + /* TODO Add dob here */ cr.getUsername() + "','" + cr.getPass()
					+ "'," + cr.getContactNo() + "," + cr.getAadharNo() + ",'" + cr.getFatherName() + "','"
					+ cr.getQualification() + "','" + cr.getCollegeName() + "'," + cr.getMarks()
					+/*TODO add docs path here*/ ", null, null, null,'" + cr.getStatus() + "')";
			int i = jdbcTemplate.update(query_candidate);

			/*
			 * String queryforAddress = "insert into address values (address_seq.nextval,'"
			 * + cr.getAddr().getPincode() + "','" + cr.getAddr().getCity() + "','" +
			 * cr.getAddr().getState() + "','" + cr.getUserId() + "',null)"; int x =
			 * jdbcTemplate.update(queryforAddress);
			 * 
			 * if (x > 0) { System.out.println("inserted in address table"); } else {
			 * System.out.println("Error in address table"); }
			 * 
			 * String query_education_details =
			 * "insert into education_details values(education_details_seq.nextval,'" +
			 * cr.getEducation().getQualification() + "','" +
			 * cr.getEducation().getInstituteName() + "','" + cr.getUserId() + "')";
			 * 
			 * int x1 = jdbcTemplate.update(query_education_details);
			 * 
			 * if (x1 > 0) {
			 * 
			 * System.out.println("inserted in education table"); } else {
			 * System.out.println("Error in education table"); }
			 */

			System.out.println("INSERTED RECORD: "+ cr.getRegNo()+ "\t" + cr.getAadharNo() + " " + cr.getContactNo());
			
			return i;


	}

}
