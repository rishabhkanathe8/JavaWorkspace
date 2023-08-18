package com.mergesortedarray;

class Solution {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int array[] = new int[nums1.length + nums2.length];
		int i = 0;
		int k = 0;
		int count = 0;
		while (i < nums1.length && k < nums2.length) {
			if (nums1[i] > nums2[k]) {
				array[count] = nums2[k];
				k++;
				count++;
			} else {
				array[count] = nums1[i];
				i++;
				count++;
			}
		}
		while (i < m) {
			array[count] = nums1[i];
			i++;
			count++;
		}
		while (k < n) {
			array[count] = nums2[k];
			k++;
			count++;
		}
		System.out.println(array.length);
		for(int h =0 ; h < array.length-1; h++) {
			System.out.println(array[h]);
		}
		for(int h =0 ; h < array.length-1; h++) {
			nums1[h] = array[h];
		}

	}

	public static void main(String[] args) {
		int nums1[] = { 5, 6, 7, 10, 12,0,0,0 };
		int nums2[] = { 3, 4, 7 };
		merge(nums1, nums1.length - 1, nums2, nums2.length - 1);
	}
}
