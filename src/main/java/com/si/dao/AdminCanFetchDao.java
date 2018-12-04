package com.si.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.si.model.Address;
import com.si.model.Candidate;

/**
 * 
 * @author GR5 LTI
 * Fetches Candidate data on Request of Admin
 *
 */
public class AdminCanFetchDao implements AdminCanFetchDaoInterface {
	private JdbcTemplate jdbcTemplate;

	@Override
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Override
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public AdminCanFetchDao() {
		super();
	}

	// Returns list of candidates that have status set as 'Awaiting Verification' for verification by admin
	@Override
	public List<Candidate> getUnverifiedCan() {
		String queryuCan = "select * from gr5_candidate left join gr5_address on gr5_candidate.gc_reg_no=gr5_address.ga_gc_reg_no  where gr5_candidate.gc_status='Awaiting Verification'";
		List<Candidate> uclst = jdbcTemplate.query(queryuCan, new ResultSetExtractor<List<Candidate>>() {

			public List<Candidate> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Candidate> lst = new ArrayList<Candidate>();
				while (rs.next()) {
					Candidate c = new Candidate();
					Address addr = new Address();
					String[] paths = new String[3];

					c.setCanRegNo(rs.getInt(1));
					c.setName(rs.getString(2));
					c.setGender(rs.getString(3));
					c.setDob(rs.getString(4));
					c.setUsername(rs.getString(5));
					c.setContactNo(rs.getLong(7));
					c.setAadharNo(rs.getLong(8));
					c.setFatherName(rs.getString(9));
					c.setQualification(rs.getString(10));
					c.setCollegeName(rs.getString(11));
					c.setMarks(rs.getFloat(12));
					paths[0] = rs.getString(13);
					paths[1] = rs.getString(14);
					paths[2] = rs.getString(15);
					c.setStatus(rs.getString(16));
					c.setFilePath(paths);
					addr.setAddr(rs.getString(18));
					addr.setState(rs.getString(19));
					addr.setCity(rs.getString(20));
					addr.setPincode(rs.getString(21));
					c.setAddr(addr);
					lst.add(c);
				}

				return lst;
			}

		});
		return uclst;
	}

	// Return File path of Candidate document on bases of what file was clicked on the Jsp page
	@Override
	public String getFilePath(int canRegNo, int fileId) {
		String colName = null;
		switch (fileId) {
		case 1:
			colName = "gc_photo";
			break;
		case 2:
			colName = "gc_aadhar_card";
			break;
		case 3:
			colName = "gc_edu_certi";
			break;
		default:
			return "Error Something is Wrong";
		}
		
		String query = "Select " + colName + " from gr5_candidate where gc_reg_no=" + canRegNo;

		String filePath = jdbcTemplate.queryForObject(query, String.class);

		return filePath;
	}

}
