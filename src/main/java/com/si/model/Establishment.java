package com.si.model;

/**
 * 
 * @author Group5 Model Class for Establishment table
 *
 */

// Entity Object for gr5_establishment table
public class Establishment {

	private int estRegNo; // Primary key Auto generated
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
	private long tin;
	
	private Address addr;
	
	private String filePath;

	

	public int getEstRegNo() {
		return estRegNo;
	}

	public void setEstRegNo(int estRegNo) {
		this.estRegNo = estRegNo;
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
		this.pass = MD5.getMd5(pass);
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

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public long getTin() {
		return tin;
	}

	public void setTin(long tin) {
		this.tin = tin;
	}
	
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
}
