package com.immutable;

public class EmployeeLazy {
	
	private EmployeeLazy() {
		// TODO Auto-generated constructor stub
	}
	
	private static  EmployeeLazy instance;
	
	public static EmployeeLazy getInstance() {
		if(instance == null) {
			instance = new EmployeeLazy();
		}
		return instance;
	}

}
