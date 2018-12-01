package com.si.model;
/**
 * 
 * @author gr5
 * Model class for Contract Table
 *
 */

//import java.sql.Date;

//Entity object for gr5_contract
public class Contract {
	
	private int letterNo;  //primary key Auto generated
	private int canRegNo;
	//private Date dob;
	private int estRegNo;
	private String estName;
	private int courseId;
	private float stipend;
	private String startId;
	private String endDate;
	private String status;
	//private String contractPath;
	public Contract() {}
	
	
	public int getLetterNo() {
		return letterNo;
	}
	public void setLetterNo(int letterNo) {
		this.letterNo = letterNo;
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
	public String getEstName() {
		return estName;
	}
	public void setEstName(String estName) {
		this.estName = estName;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public float getStipend() {
		return stipend;
	}
	public void setStipend(float stipend) {
		this.stipend = stipend;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStartId() {
		return startId;
	}

	public void setStartId(String startId) {
		this.startId = startId;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	
}
