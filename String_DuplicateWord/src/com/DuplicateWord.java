package com;

public class DuplicateWord {

	public static void main(String[] args) {

		String str ="Hello Moto What is Going on Moto is no no is a hello";
		str = str.toLowerCase();
		String str1[] = str.split(" ");
		int count;
		for(int i=0; i< str1.length; i++) {
			count =1;
			for(int j=i+1; j < str1.length; j++) {
				if(str1[i].equals(str1[j]) ) {
					count++;
					str1[j]="0";
				}
			}
			if(count > 1 && str1[i] != "0") {
				System.out.println(str1[i] +" " + count);
			}
		}
	}

}
