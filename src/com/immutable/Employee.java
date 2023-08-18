package com.immutable;

public final class Employee {

	private final int id;
	private final String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		Employee e = new Employee(1, "rk");
		Employee e2 = new Employee(12, "rk");
		
		System.out.println(e);
		System.out.println(e2);
		
	}
}
