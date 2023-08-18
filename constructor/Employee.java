package com.constructor;

public class Employee {
	private int id;
	private String name;
	private String post;

	public Employee() {

	}

	public Employee(int id) {
		this.id = id;

	}
	public Employee(String name) {
		this(5);
		this.name=name;
	}
	public Employee(int id,String post) {
		this("Rk");
		this.post=post;
		this.post=post;
		
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", post=" + post + "]";
	}

	public static void main(String[] args) {
		Employee e = new Employee(1, "Dev");
		System.out.println(e);
	}
	

}
