package com.si.model;


/**
 * 
 * @author Group5
 * Model Class for Establishment table
 *
 */

//Entity Object for gr5_establishment table
public class Establishment {
	
	private int estRegNo; 			//Primary key Auto generated
	private String name;
	private String email;
	private String pass;
	private String indtype;
	private int noOfEmp;
	private int workdays;
	private String nameOfHead;
	private long contactNo;
	private String bankName;
	private String IFSC;
	private long accountNo;
	private String status;
	
	
	/*
	 * 
	ge_est_regno VARCHAR2(30) PRIMARY KEY, 
	ge_est_name VARCHAR2(30) UNIQUE, 
	ge_email VARCHAR2(30) UNIQUE,
	ge_pass VARCHAR2(30),
	ge_industry_type VARCHAR2(30),
	ge_no_of_emp NUMBER(50),
	ge_workdays NUMBER,
	ge_name_of_head VARCHAR2(30),
	ge_contact_no NUMBER(10) UNIQUE,
	ge_bank_name VARCHAR2(30),
	ge_IFSC_code VARCHAR2(30),
	ge_account_no NUMBER(30)
	ge_status VARCHAR2(30)
	 * 
	 */
	
	
	
	public int getRegNo() {
		return estRegNo;
	}
	public void setRegNo(int regNo) {
		this.estRegNo = regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getIndtype() {
		return indtype;
	}
	public void setIndtype(String indtype) {
		this.indtype = indtype;
	}
	public int getNoOfEmp() {
		return noOfEmp;
	}
	public void setNoOfEmp(int noOfEmp) {
		this.noOfEmp = noOfEmp;
	}
	public int getWorkdays() {
		return workdays;
	}
	public void setWorkdays(int workdays) {
		this.workdays = workdays;
	}
	public String getNameOfHead() {
		return nameOfHead;
	}
	public void setNameOfHead(String nameOfHead) {
		this.nameOfHead = nameOfHead;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIFSC() {
		return IFSC;
	}
	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
