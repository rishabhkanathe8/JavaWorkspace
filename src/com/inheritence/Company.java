package com.inheritence;

public class Company {

	protected String companyName;

	private int registration;

	public Company(String name, int registration) {
		
		this.companyName = name;
		this.registration = registration;
	}

	public void setCompanyName(String name) {
		this.companyName = name;
	}

	public String getCompnayName() {

		return companyName;
	}

	public void setRegistration(int num) {

		this.registration = num;
	}

	public int getRegistration() {
		return registration;
	}

	@Override
	public String toString() {
		return "companyName " + companyName + " registration " + registration;
	}
}
