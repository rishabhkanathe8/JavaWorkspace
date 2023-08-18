package com;

public class IndexNum {
	
	public static void main(String[] args) {
		
		int array[] = {50005,10,22,33,11,3,555,3,44,111111};
		System.out.println(index(array));
	}
	
	public static int index(int array[]) {
		int max =0;
		int index =0;
		for(int i =0; i < array.length; i ++) {
			if(array[i]> max) {
				index = i;
				max = array[i];
				
			}
		}
		System.out.println(max);
		return index ;
	}

}
