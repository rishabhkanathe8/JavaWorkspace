package com.java;

import java.util.HashMap;

public class HashMapUse {

	public static void print(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				char ch = str.toLowerCase().charAt(i);
				if (map.containsKey(ch)) {
					map.put(ch, map.getOrDefault(ch, 0) + 1);
				} else {
					map.put(ch, 1);
				}
			}
		}
		System.out.println(map);
		map.entrySet().forEach(System.out::println);
		
		
	}

	public static void main(String[] args) {
		print("       aaaaaa bbbbbb cccccccc ddddddddd eeeee gggg aaaaaa AAAAAAa         ");
	}

}
