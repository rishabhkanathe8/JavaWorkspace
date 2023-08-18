package com.notpad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findAnagramInString {

	public static List<Integer> findAnagram(String s, String p) {

		Map<Character, Integer> patternMap = new HashMap<Character, Integer>();
		Map<Character, Integer> sourceMap = new HashMap<Character, Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < p.length(); i++) {
			char ch = p.charAt(i);
			patternMap.put(ch, patternMap.getOrDefault(ch, 0) + 1);
		}

		for (int i = 0; i < p.length(); i++) {
			char ch = s.charAt(i);
			sourceMap.put(ch, sourceMap.getOrDefault(ch, 0) + 1);
		}

		int i = p.length();
		while (i < s.length()) {
			if (patternMap.equals(sourceMap)) {
				list.add(i - p.length());
			}

			char cha = s.charAt(i);
			sourceMap.put(cha, sourceMap.getOrDefault(cha, 0) + 1);

			char rcha = s.charAt(i - p.length());
			if (sourceMap.get(rcha) == 1) {
				sourceMap.remove(rcha);
			} else {
				sourceMap.put(rcha, sourceMap.get(rcha) - 1);
			}
			i++;
		}
		if (patternMap.equals(sourceMap)) {
			list.add(i - p.length());
		}
		return list;
	}

	public static void main(String[] args) {
		List<Integer> list = findAnagram("abcdabcdcba", "abc");
		list.forEach(System.out::println);
	}

}
