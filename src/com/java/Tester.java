package com.java;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Tester {

	public static void main(String[] args) {

		LinkedList<Employee> list = new LinkedList<Employee>();
		Employee e1 = new Employee("TCS", "Pune", 1, "Rk", "DEV");
		Employee e2 = new Employee("Digital", "Pune", 8, "Tambe", "DEV");
		Employee e3 = new Employee("Tech", "Hinjewadi", 3, "Gau", "DEVOPS");
		Employee e4 = new Employee("Cum", "Baner", 5, "Sarak", "TEST");
		Employee e5 = new Employee("Dassault", "Hinje", 6, "Vaibhav", "DEVOPS");
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
//		System.out.println("Size is  "+list.size());
//		// System.out.println(list);
//
//		list.forEach(System.out::println);
//		Collections.sort(list);
//		System.out.println();
//		list.forEach(System.out::println);
//		System.out.println();
//		// list.sort(Comparator.comparing(Employee::getEmpName));
//		//list.stream().sorted(Comparator.comparing(Employee::getEmpName)).forEach(System.out::println);
		list.stream().sorted(Comparator.comparing(Employee::getEmpName)).collect(Collectors.toList()).forEach(System.out::println);
//		list.get(0).calculateSalary(50000);
//		list.get(1).calculateSalary(40000);
//		list.get(2).calculateSalary(30000);
//		list.get(3).calculateSalary(40000);
//		list.get(4).calculateSalary(45000);
//		System.out.println("  hello          ");
//		Employee.getSorted(list);
////		list.stream().sorted(Comparator.comparing(Employee::getLocation).thenComparing(Employee::getCompanyName))
////				.forEach(System.out::println);
////		System.out.println();
////		list.stream().sorted(Comparator.comparing(Employee::getEmpName).reversed()).forEach(System.out::println);
//		//list.stream().sorted(Comparator.comparing(Employee::getCompanyName)).

	}

}
