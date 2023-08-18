package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StreamJava {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(27);
		list.add(36);
		list.add(45);
		list.add(60);

		list.add(50);
		System.out.println(list);
		System.out.println("here");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("here");
		// List<Integer>
		// list2=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);
		// System.out.println(list2);
		// when you want add like i want add for every object
		List<Integer> list3 = list.stream().map(i -> i + 5).collect(Collectors.toList());
		System.out.println(list3);
		System.out.println(list);
		int noOfFailedStudent = (int) list.stream().filter(p -> p > 36).count();
		System.out.println(noOfFailedStudent);
		List<Integer> l = list.stream().sorted().filter(p -> p > 35).collect(Collectors.toList());
		System.out.println(l);
		List<String> sList = new ArrayList<String>();
		sList.add("Rishabh kanathe");
		sList.add("Gaurav Kumar");
		sList.add("Abhijeet Tambe");
		sList.add("Shubham Sarak");
		List<String> s = sList.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(s);
	}
}