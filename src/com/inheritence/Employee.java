package com.inheritence;

public class Employee extends Company  implements Test1,Test2{

	private String empName;

	private int empNo;

	public Employee(String companyName,int registration,String empName, int empNo) {
		super(companyName, registration);
		this.empName = empName;
		this.empNo = empNo;
	}

	public String getEmpName() {
		String str=companyName;
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empNo=" + empNo + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void m1() {
		
	}

	
	
}
