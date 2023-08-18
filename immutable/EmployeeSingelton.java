package com.immutable;

public class EmployeeSingelton {
	
	private EmployeeSingelton() {
		// TODO Auto-generated constructor stub
	}
	
	private  static  final EmployeeSingelton a = new EmployeeSingelton();
	
	public static EmployeeSingelton  getInstance() {
		
		//EmployeeSingelton = new EmployeeSingelton();
		return a;
		
	}

}
