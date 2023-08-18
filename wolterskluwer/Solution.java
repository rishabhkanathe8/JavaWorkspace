package com.wolterskluwer;

import java.util.ArrayList;

public class Solution {
	public static int minSum(ArrayList<ArrayList<Integer>> arr) {
		int sum = 0;
		int index = Integer.MAX_VALUE;
		for (int i = 0; i < arr.size(); i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < arr.get(i).size(); j++) {
				
				int value = arr.get(i).get(j);
				if (arr.get(i).get(j) < min && j != index) {
					min = value;
					index = j;
				}
			}//arr.size()>1
//			if ( i<arr.size()-1) {
//				arr.get(i + 1).set(index, Integer.MAX_VALUE);
//			}
			sum = sum + min;
		}
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

		list.add(new ArrayList<Integer>());
		list.add(new ArrayList<Integer>());
		//list.add(new ArrayList<Integer>());
		System.out.println(list.size());
		list.get(0).add(1);
		list.get(0).add(2);
		list.get(0).add(3);
		list.get(1).add(4);
		list.get(1).add(5);
		list.get(1).add(6);
//		list.get(2).add(7);
//		list.get(2).add(8);
//		list.get(2).add(9);
		System.out.println(minSum(list));
	}
	// 4
//	2 
//	1 2 3
//	4 5 6
//	1
//	3 5 6
//	3 
//	1 2 3
//	4 5 6
//	7 8 9
//	2
//	4 8 9
//	6 10 12

//	6
//	3
//	13
//	14
}