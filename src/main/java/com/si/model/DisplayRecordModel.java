package com.si.model;

public class DisplayRecordModel {

	private int estRegno;	//primary key of establishment
	private int letterNo;   //primary key of contract
	private int canRegNo;   // Primary key of candidate
	private String name;
	private String gender;
	private String dob;
	private long contactNo;
	private String qualification;
	private float marks;
	//private Address addr;
	private int courseId;		//Primary key of course
	private String courseName;
	private float stipend;
	private String startId;
	private String endDate;
	private String status;
	
	
	public DisplayRecordModel() {}
	
	//setter-getter
	public int getCanRegNo() {
		return canRegNo;
	}
	public void setCanRegNo(int canRegNo) {
		this.canRegNo = canRegNo;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
/*	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}*/
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getEstRegno() {
		return estRegno;
	}
	public void setEstRegno(int estRegno) {
		this.estRegno = estRegno;
	}
	public int getLetterNo() {
		return letterNo;
	}
	public void setLetterNo(int letterNo) {
		this.letterNo = letterNo;
	}
	public float getStipend() {
		return stipend;
	}
	public void setStipend(float stipend) {
		this.stipend = stipend;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}  
	
}
