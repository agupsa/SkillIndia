package com.si.model;

/**
 * 
 * @author Group5
 * Model Class for Address table
 *
 */
//Entity object for GR5_ADDRESS table
public class Address {
	
	private int addId; 		//Primary key Auto generated
	private String addr;
	private String city;
	private String state;
	private String pincode;
	private int canRegNo;		//Foreign key references to Candidate
	private int estRegNo;		//Foreign key references to Establishment
	
	
	public Address() {
		super();
	}


	public int getAddId() {
		return addId;
	}


	public void setAddId(int addId) {
		this.addId = addId;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	public int getCanRegNo() {
		return canRegNo;
	}


	public void setCanRegNo(int canRegNo) {
		this.canRegNo = canRegNo;
	}


	public int getEstRegNo() {
		return estRegNo;
	}


	public void setEstRegNo(int estRegNo) {
		this.estRegNo = estRegNo;
	}



}
