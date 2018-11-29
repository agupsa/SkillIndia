package com.si.model;

/*import java.util.Collection;
import java.util.Date;*/

/**
 * 
 * @author Group5
 * Model Class for Candidate table
 *
 */
//Gr5_candidate table entity
public class Candidate {
	
	//TODO add address and education qualification


	private int canRegNo;   // Primary key auto generated
	private String name;
	private String gender;
	private String dob;
	private String username;
	private String pass;
	private long contactNo;
	private long aadharNo;
	private String fatherName;
	private String qualification;
	private String collegeName;
	private float marks;
	private String status;
	private Address addr;
	
	
	private String[] filePath;


	

	/* Column mappings
	gc_reg_no VARCHAR2(20) PRIMARY KEY,
	gc_name VARCHAR2(30),
	gc_gender VARCHAR2(30),
	gc_dob DATE(30),
	gc_username VARCHAR2(30) UNIQUE,
	gc_pass VARCHAR2(30),
	gc_contact_no NUMBER(10) UNIQUE,
	gc_aadhar_no NUMBER(12) UNIQUE,
	gc_father_name VARCHAR2(30),
	gc_qualification VARCHAR2(30),
	gc_college_name VARCHAR2(30),
	gc_marks NUMBER(30),
	gc_photo VARCHAR2(100),
	gc_aadhar_card VARCHAR2(100),
	gc_edu_certi VARCHAR2(100),
	gc_status VARCHAR2(30)*/
	
	

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public int getCanRegNo() {
		return canRegNo;
	}

	public void setCanRegNo(int canRegNo) {
		this.canRegNo = canRegNo;
	}
	
	public int getRegNo() {
		return canRegNo;
	}

	public void setRegNo(int regNo) {
		this.canRegNo = regNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	//TODO Do something here

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String[] getFilePath() {
		return filePath;
	}

	public void setFilePath(String[] filePath) {
		this.filePath = filePath;
	}
	
	
	

	
}
