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
	private String Name;
	private String trainerName;
	private String trainerContact;
	private int estRegno;		//Foreign key
	private String estName;     
	
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getTrainerContact() {
		return trainerContact;
	}
	public void setTrainerContact(String trainerContact) {
		this.trainerContact = trainerContact;
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

}
