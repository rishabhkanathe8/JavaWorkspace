package com;

import java.util.Arrays;
import java.util.List;

public class CountTheLengthOfStringHavingFive {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("risha","kiran","abc","def");
		long count =list.stream().filter(i->i.length()==5).count();
		System.out.println(count);

	}

}
