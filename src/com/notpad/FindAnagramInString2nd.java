package com.notpad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAnagramInString2nd {

	public static List<Integer> findAnagram(String s, String p) {
		List<Integer> list = new ArrayList<Integer>();
		Map<Character, Integer> patternMap = new HashMap<Character, Integer>();
		Map<Character, Integer> sourceMap = new HashMap<Character, Integer>();

		for (int i = 0; i < p.length(); i++) {
			char ch = p.charAt(i);
			patternMap.put(ch, patternMap.getOrDefault(ch, 0) + 1);
		}
		for (int i = 0; i < p.length(); i++) {
			char ch = s.charAt(i);
			sourceMap.put(ch, sourceMap.getOrDefault(ch, 0) + 1);
		}

		int length = p.length();
		while (length < s.length()) {

			if (sourceMap.equals(patternMap)) {
				list.add(length - p.length());
			}

			char ch = s.charAt(length);
			sourceMap.put(ch, sourceMap.getOrDefault(ch, 0) + 1);

			char rcha = s.charAt(length - p.length());
			if (sourceMap.get(rcha) == 1) {
				sourceMap.remove(rcha);
			} else {
				sourceMap.put(rcha, sourceMap.get(rcha) - 1);
			}
			length++;
		}

		if (sourceMap.equals(patternMap)) {
			list.add(length - p.length());
		}
		return list;

	}

	public static void main(String[] args) {
		List<Integer> list = findAnagram("abcdefabcdef", "abc");
		list.forEach(System.out::println);

	}
}
