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
	
	private int letter_no;  //primary key Auto generated
	private int canRegNo;
	//private Date dob;
	private int estRegNo;
	private String estName;
	private int courseId;
	private float stipend;
	//private Date startId;
	//private Date endDate;
	private String status;
	//private String contractPath;
	
	
	
	public int getLetter_no() {
		return letter_no;
	}
	public void setLetter_no(int letter_no) {
		this.letter_no = letter_no;
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
}
