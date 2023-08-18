package com.mergesortedarray;

public class Merge {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		int array[] = new int[nums1.length + nums2.length];
		int count = 0;
		int first = 0;
		int second = 0;
		System.out.println(array.length + "is");

		for (int i = 0; i < array.length; i++) {
			//System.out.println("here");

			if (nums1[first] > nums2[second]) {
				System.out.println(" 1 here");
				array[count] = nums2[second];
				second++;
				count++;
			} else {
				System.out.println(" 2 here");
				array[count] = nums1[first];
				first++;
				count++;
			}
		}

		while (first < nums1.length) {
			array[count] = nums1[first];
			count++;
			first++;

		}
		while (second < nums2.length) {
			array[count] = nums2[second];
			count++;
			second++;

		}

		for (int k = 0; k < array.length; k++) {
			System.out.println(array[k]);
		}
	}

	public static void main(String[] args) {
		int nums1[] = { 5, 6, 7, 8, 9 };
		int nums2[] = { 3, 4, 7 };
		merge(nums1, nums1.length - 1, nums2, nums2.length - 1);
	}
}
