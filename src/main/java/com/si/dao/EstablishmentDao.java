package com.si.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.si.model.Address;
import com.si.model.Establishment;


//TODO exception and error handling


public class EstablishmentDao implements EstablishmentDaoInterface {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public EstablishmentDao() {
		super();
	}

	//This method fetches primary key for Table from sequence
	@Override
	public int getSeq(String fetchPK) {
		int pk = (int) jdbcTemplate.queryForObject(fetchPK, Integer.class);
		return pk;

	}

	//This method Saves Establishment data in establishment table and address table  
	@Override
	public void registerEstablishment(Establishment e) {
		
		String paths = e.getFilePath();		
		
		String fetchcPK = "select gr5_establishment_seq.nextval from dual";
		e.setEstRegNo(getSeq(fetchcPK));
		e.setStatus(new String("Awaiting Verification"));
		String query_establishment = "insert into gr5_establishment values" + "(" + e.getEstRegNo() + ",'" + e.getName() + "','"
				+ e.getEmail() + "','" + e.getPass() + "','" + e.getIndtype() + "'," + e.getNoOfEmp() + ","
				+ e.getWorkdays() + ",'" + e.getNameOfHead() + "'," + e.getContactNo() + ",'" + e.getBankName()
				+"','" + e.getIFSC() + "'," + e.getAccountNo() + ",'" + e.getStatus() + "','"+e.getTin()+"','" + paths+ "')";
		int i = jdbcTemplate.update(query_establishment);

		if (i > 0) {

			String fetchaPK = "select gr5_address_seq.nextval from dual";
			Address tempaddr = e.getAddr();
			tempaddr.setAddId(getSeq(fetchaPK));
			e.setAddr(tempaddr);
			String queryforAddress = "insert into gr5_address values (" + e.getAddr().getAddId() + ",'"
					+ e.getAddr().getAddr() + "','" + e.getAddr().getState() + "','" + e.getAddr().getCity() + "',"
					+ e.getAddr().getPincode() + ",null," + e.getEstRegNo() + ")";
			int x = jdbcTemplate.update(queryforAddress);

		}

		//TODO Exception EstablishmentRegDao
	}

}
