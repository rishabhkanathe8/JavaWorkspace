package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListInUpperCase {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("rishabh", "kiran", "kanathe");
		List<String> modifiedList = list.stream()
									.map(i -> i.toUpperCase())
									.collect(Collectors.toList());
		System.out.println(modifiedList);

	}
}
