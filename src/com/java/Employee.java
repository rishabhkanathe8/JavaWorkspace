package com.java;

import java.util.ArrayList;
import java.util.Comparator;

public class Employee extends Company implements Comparable<Employee> {

	private Integer empNo;
	private String empName;
	private String designation;

	public Employee(String companyName, String location, Integer empNo, String empName, String designation) {
		super(companyName, location);
		this.empNo = empNo;
		this.empName = empName;
		this.designation = designation;
	}

	@Override
	public int calculateSalary(int basicPay) {
		int salary = (int) ((int) basicPay + (basicPay * 0.5));
		return salary;
	}

	@Override
	public int calculateInsurance(int pay) {
		int payble = pay / 10;
		return payble;
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", designation=" + designation + ", CompanyName="
				+ super.getCompanyName() + "Location= " + super.getLocation() + "]";
	}

	public static void getSorted(ArrayList<Employee> list) {
		list.stream().sorted(Comparator.comparing(Employee::getEmpName)).forEach(System.out::println);
	}

	@Override
	public int compareTo(Employee o) {

		return this.empNo.compareTo(o.empNo);
	}

}
