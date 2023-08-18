package com.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class NewTest {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedHashSet<Integer> lset = new LinkedHashSet<Integer>();
		TreeSet<Integer> tree = new TreeSet<Integer>();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		set.add(1);
		lset.add(1);
		tree.add(1);
		map.put(1, "rk");
		lmap.put(1, "Rk");
		tMap.put(1, "rk");

	}
}
