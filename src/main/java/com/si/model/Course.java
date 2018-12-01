package com.si.model;

/**
 * 
 * @author gr5
 * Model class for Course Table
 *
 */

//entity object for gr5_course table
public class Course {
	
	private int courseId;		//Primary key auto generated
	private String courseName;
	private String trainerName;
	private long trainerContact;
	private String domainName;
	private int estRegno;		
	private String estName;     
	
	
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
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	
	public long getTrainerContact() {
		return trainerContact;
	}
	public void setTrainerContact(long trainerContact) {
		this.trainerContact = trainerContact;
	}
	public String getDomainName() {
		return domainName;
	}
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	public int getEstRegno() {
		return estRegno;
	}
	public void setEstRegno(int estRegno) {
		this.estRegno = estRegno;
	}
	public String getEstName() {
		return estName;
	}
	public void setEstName(String estName) {
		this.estName = estName;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", trainerName=" + trainerName
				+ ", trainerContact=" + trainerContact + ", domainName=" + domainName + ", estRegno=" + estRegno
				+ ", estName=" + estName + "]";
	}
	
	

}
