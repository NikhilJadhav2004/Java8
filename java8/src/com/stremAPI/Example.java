package com.stremAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {

	
	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

	        List<Integer> evenList = list.stream()
	                                     .filter(x -> x % 2 == 0)
	                                     .collect(Collectors.toList());

	        System.out.println(evenList); // Output: [2, 4, 6]
}
}
