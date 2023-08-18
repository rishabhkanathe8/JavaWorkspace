package com.leetCode;

import java.util.Objects;

public class Employee {
	
	private int id;
	private String name;
	public  Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"rk");
		Employee e2  = new Employee(1, "rk");
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

}
