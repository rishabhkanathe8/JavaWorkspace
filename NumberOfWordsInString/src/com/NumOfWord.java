package com;

public class NumOfWord {

	public static void main(String[] args) {
		
		System.out.println(word("Hello moto from cdac acts hi kash   "));
	}
	public static int word(String str) {
		int count =1;
		if(str.trim().length()==0) {
			return 0;
		}
		for(int i =0; i < str.length()-1;i++) {
			
			if(str.charAt(i)==' '&& str.charAt(i+1) !=' ') {
				count++;
			}
		}
		
		return count;
	}

}
