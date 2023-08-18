package com.java;

public abstract class Company implements Bank,Insurance {
	
	//private static int companyId = 101;
	private String companyName;
	private String location;
	public Company(String companyName, String location) {
		
		this.companyName = companyName;
		this.location = location;
		
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", location=" + location + "]";
	}
	
	
	

}
