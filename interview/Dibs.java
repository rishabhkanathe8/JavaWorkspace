package com.interview;

public class Dibs {
	
	public static void main(String[] args) {
		int num =5;
		for(int i=1; i <= num; i++) {
			int j=1;
			for(j=1; j<i; j++ ) {
				System.out.print(j+" ");
			}
			for(int k=j;k>0;k--) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
