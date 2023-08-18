package com.wolterskluwer;

import java.util.HashMap;

public class NightCompany {
//LeetCode 974 problem
//	public static int syubarray(int array[],int k) {
//		int count=0;
//		for(int i =0; i <array.length; i++) {
//			int sum =0;
//			for(int j =i;j < array.length; j++) {
//				sum += array[j];
//			if(array[j]%k==0) {
//				count++;
//			}
//			}
//			
//		}
//		return count;
//	}

	public static int subArray(int array[], int k) {
		// with time complexity

		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		int count = 0;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			int remainder = sum % k;
			if (remainder < 0) {
				remainder += k;
			}
			if (map.containsKey(remainder)) {
				count += map.get(remainder);
			}
			map.put(remainder, map.getOrDefault(remainder, 0) + 1);
		}
		return count;
	}

	public static void main(String[] args) {
		int array[] = { 5, 1, 2, 3, 4, 1 };
		int count = subArray(array, 3);
		System.out.println(count);
	}
}

//Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.
//
//A subarray is a contiguous part of an array.
//
// 
//
//Example 1:
//
//Input: nums = [4,5,0,-2,-3,1], k = 5
//Output: 7
//Explanation: There are 7 subarrays with a sum divisible by k = 5:
//[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
//Example 2:
//
//Input: nums = [5], k = 9
//Output: 0
