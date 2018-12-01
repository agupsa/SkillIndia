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

public class AdminEstFetchDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public AdminEstFetchDao() {
		super();
	}

	public List<Establishment> getUnverifiedEst(){
		String queryuEst = "select * from gr5_establishment left join gr5_address on gr5_establishment.ge_regno=gr5_address.ga_ge_regno  where gr5_establishment.ge_status='Awaiting Verification'";
		List<Establishment> uelst = jdbcTemplate.query(queryuEst, new ResultSetExtractor<List<Establishment>>() {

			public List<Establishment> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Establishment> lst = new ArrayList<Establishment>();
				while (rs.next()) {
					Establishment e = new Establishment();
					Address addr = new Address();
					//String[] paths = new String[3];

					e.setEstRegNo(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setEmail(rs.getString(3));
					e.setIndtype(rs.getString(5));
					e.setNoOfEmp(rs.getInt(6));
					e.setWorkdays(rs.getInt(7));
					e.setNameOfHead(rs.getString(8));
					e.setContactNo(rs.getLong(9));
					e.setBankName(rs.getString(10));
					e.setIFSC(rs.getString(11));
					e.setAccountNo(rs.getLong(12));
					e.setStatus(rs.getString(13));
					addr.setAddr(rs.getString(15));
					addr.setState(rs.getString(16));
					addr.setCity(rs.getString(17));
					addr.setPincode(rs.getString(18));
					e.setAddr(addr);
					lst.add(e);
				}

				return lst;
			}

		});	
		return uelst;
	}
}
