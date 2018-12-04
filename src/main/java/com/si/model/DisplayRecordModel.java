package com.si.model;


//Model Class for join table of candidate apprenticeship data
public class DisplayRecordModel {

	private Contract contract;
	private Candidate candidate;
	private Course course;

	public DisplayRecordModel() {
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}
