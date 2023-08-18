package com;

import java.util.HashMap;
import java.util.Map;

public class CountingWordsInString {
	
	public static void counting(String str) {
		HashMap<Character,Integer> hashMap = new HashMap<>();
		for(int i =0; i < str.length(); i++) {
			char ch = str.charAt(i);
			hashMap.merge(ch, 1, Integer::sum);
		}
		hashMap.forEach((k,v)-> System.out.println(k+" "+v));		
		System.out.println(hashMap);
		
		for(Map.Entry<Character, Integer> values : hashMap.entrySet()) {
			char c = values.getKey();
			int  v = values.getValue();
			System.out.println(c+" "+v);
		}
		
		for(Character key : hashMap.keySet()) {
			System.out.println(key);
		}
		
		for(Integer i : hashMap.values()) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		counting("ziiabcdefabiiiicdefgggii789000");
	}

}
