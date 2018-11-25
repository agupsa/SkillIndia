package com.si.model;

public class EducationalDetails {
	private String qualification;
	private String instituteName;
	
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	
	@Override
	public String toString() {
		return "EducationalDetails [qualification=" + qualification
				+ ", instituteName=" + instituteName + "]";
	}
}
