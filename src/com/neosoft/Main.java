package com.neosoft;

import java.util.HashSet;

public class Main {

	public static String TreeConstructor(String[] strArr) {
		HashSet<Integer> parents = new HashSet<>();
		HashSet<Integer> children = new HashSet<>();

		for (String pair : strArr) {
			String sep = pair.replace("(", "").replace(")", "");
			String[] nodes = sep.split(","); 

			int child = Integer.parseInt(nodes[0].trim());
			int parent = Integer.parseInt(nodes[1].trim());
			// Check if the child node already has a parent
			if (children.contains(child)) {
				return "false";
			}
			children.add(child);
			parents.add(parent);

			// Check if a parent has more than two children
			// Check if a parent has already two children
			if (parents.contains(parent) && children.stream().filter(c -> c == parent).count() == 2) {
			    return "false";
			}

		}

		return "true";
	}

	public static void main(String[] args) {
		String[] strArr = { "(1,2)", "(2,4)", "(7,2)" };
		System.out.println(TreeConstructor(strArr)); // Output: true
		
	}

}
