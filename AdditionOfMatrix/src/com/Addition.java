package com;

public class Addition {

	public static void main(String[] args) {

		int[][] one = new int[][] { { 1, 2, 3 }, { 4, 5, 6 },{7,8,9} };
		int[][] two = new int[][] { { 10, 11, 12 }, { 13, 14, 15 } ,{16,17,18}};
		int[][] sum = new int[3][3];

		if (one.length == two.length && one[0].length == two[0].length) {

			for (int i = 0; i < one.length; i++) {
				for (int j = 0; j < one[i].length; j++) {
					sum[i][j] = one[i][j] + two[i][j];
				}
			}
		}
		
		for(int i=0;i<one.length;i++) {
			for(int j=0; j<one[i].length;j++) {
				System.out.print(one[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		for(int i=0;i<two.length;i++) {
			for(int j=0; j<two[i].length;j++) {
				System.out.print(two[i][j]  + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i < sum.length; i++) {
			for(int j=0; j < sum[i].length;j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}

}
