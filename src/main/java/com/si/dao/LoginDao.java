package com.si.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.si.model.Candidate;
import com.si.model.Contract;
import com.si.model.Course;
import com.si.model.DisplayRecordModel;
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

	// Validates Candidates and returns only required data
	public Object userLoginValidation(Login login) {
		List<Map<String, Object>> lst;
		lst = jdbcTemplate.queryForList("select * from gr5_candidate where gc_username='" + login.getUsername() + "'");
		if (lst.size() > 0) {
			for (Map<String, Object> canMap : lst) {
				String pass = (String) canMap.get("gc_pass");
				if (login.getPass().equals(pass)) {
					Candidate c = new Candidate();
					c.setStatus((String) canMap.get("gc_status"));
					c.setName((String) canMap.get("gc_name"));
					c.setUsername((String) canMap.get("gc_username"));
					String[] str = { "gc_photo", "gc_aadhar_card", "gc_edu_certi" };
					String[] paths = new String[3];
					for (int i = 0; i < 3; ++i) {
						paths[i] = canMap.get(str[i]).toString();
					}
					c.setFilePath(paths);
					if (!(c.getStatus().equalsIgnoreCase("awaiting verification")
							|| c.getStatus().equalsIgnoreCase("rejected"))) {

						// objects return big decimal, need to get string from to string method
						// instead of type casting directly to string or int or INTEGER
						c.setCanRegNo(Integer.parseInt(canMap.get("gc_reg_no").toString()));

					}

					return c;
				}

			}

		}

		return null;
	}

	// Validates Establishment login and sets only required data

	@Override
	public Object estLoginValidation(Login login) {
		List<Map<String, Object>> lst;
		lst = jdbcTemplate.queryForList("select * from gr5_establishment where ge_email='" + login.getUsername() + "'");
		if (lst.size() > 0) {
			for (Map<String, Object> estMap : lst) {
				Establishment e = new Establishment();
				String pass = (String) estMap.get("ge_pass");
				if (login.getPass().equals(pass)) {
					e.setStatus((String) estMap.get("ge_status"));
					e.setName((String) estMap.get("ge_est_name"));
					e.setEmail((String) estMap.get("ge_email"));
					e.setIndtype((String) estMap.get("ge_industry_type"));
					e.setNoOfEmp(Integer.parseInt(estMap.get("ge_no_of_emp").toString()));
					e.setNameOfHead((String) estMap.get("ge_name_of_head"));
					e.setContactNo(Long.parseLong(estMap.get("ge_contact_no").toString()));
					if (!(e.getStatus().equalsIgnoreCase("awaiting verification")
							|| e.getStatus().equalsIgnoreCase("rejected"))) {
						e.setEstRegNo(Integer.parseInt(estMap.get("ge_regno").toString()));
						e.setBankName((String) estMap.get("ge_bank_name"));
						e.setIFSC((String) estMap.get("ge_IFSC_code"));
						e.setAccountNo(Long.parseLong(estMap.get("ge_account_no").toString()));

					}
					return e;
				}

			}

		}
		return null;
	}

	// display all records of contract and candidate and courses
	public List<DisplayRecordModel> getDrm(Establishment est) {

		String sql = "select * from gr5_contract inner join gr5_candidate on gr5_contract.GOF_GC_REG_NO= gr5_candidate.GC_REG_NO inner join gr5_courses ON gr5_contract.GOF_GCO_COURSE_ID=gr5_courses.GCO_COURSE_ID where \r\n"
				+ "gr5_contract.GOF_GE_REGNO = '" + est.getEstRegNo() + "'";


		return jdbcTemplate.query(sql, new RowMapper<DisplayRecordModel>() {

			public DisplayRecordModel mapRow(ResultSet rs, int rowNum) throws SQLException {

				DisplayRecordModel drm = new DisplayRecordModel();
				Contract contract = new Contract();
				Candidate candidate = new Candidate();
				Course course = new Course();

				contract.setLetterNo(rs.getInt(1));
				course.setCourseId(rs.getInt(27));
				course.setCourseName(rs.getString(28));
				contract.setCanRegNo(rs.getInt(2));
				candidate.setName(rs.getString(12));
				candidate.setGender(rs.getString(13));
				candidate.setDob(rs.getString(14));
				candidate.setContactNo(rs.getLong(17));
				candidate.setQualification(rs.getString(20));
				candidate.setMarks(rs.getFloat(22));
				contract.setStipend(rs.getFloat(6));
				contract.setStartDate(rs.getString(7));
				contract.setEndDate(rs.getString(8));
				contract.setStatus(rs.getString(9));

				drm.setContract(contract);
				drm.setCourse(course);
				drm.setCandidate(candidate);

				return drm;
			}
		});
	}

	// display all records of contract
	public List<DisplayRecordModel> getDrmForCan(Candidate can) {

		String sql = "select * from gr5_contract inner join gr5_candidate on gr5_contract.GOF_GC_REG_NO= gr5_candidate.GC_REG_NO inner join gr5_courses ON gr5_contract.GOF_GCO_COURSE_ID=gr5_courses.GCO_COURSE_ID where \r\n"
				+ "gr5_contract.GOF_GC_REG_NO = '" + can.getCanRegNo() + "'";
		return jdbcTemplate.query(sql, new RowMapper<DisplayRecordModel>() {

			public DisplayRecordModel mapRow(ResultSet rs, int rowNum) throws SQLException {

				DisplayRecordModel drm = new DisplayRecordModel();

				Contract contract = new Contract();
				Course course = new Course();

				contract.setLetterNo(rs.getInt(1));
				contract.setCourseId(rs.getInt(27));
				course.setCourseName(rs.getString(28));
				contract.setEstRegNo(rs.getInt(3));
				contract.setEstName(rs.getString(4));
				contract.setStipend(rs.getFloat(6));
				contract.setStartDate(rs.getString(7));
				contract.setEndDate(rs.getString(8));
				contract.setStatus(rs.getString(9));

				drm.setContract(contract);
				drm.setCourse(course);

				return drm;
			}

		});

	}

}
