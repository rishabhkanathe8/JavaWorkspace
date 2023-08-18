package com;

import java.util.Arrays;
import java.util.List;

public class AverageOfDouble {
	
	public static void main(String[] args) {
		
		
		List<Double> list = Arrays.asList(22.3,22.3,14.3,22.1,44.4);
		double avg = list.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
		System.out.println(avg);
	}

}
