package com.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfacePredicate {

	//predicate is an functional interface it can hold the condition 
	public static void main(String[] args) {

		Predicate<Integer> p1 = x -> x > 10;
		//System.out.println(p1.test(11));
		
		List<Integer> list=Arrays.asList(1,4,5,3,12,4);
		
		Predicate<Integer> iseven=x-> x%2==0;
		
		for(Integer i:list) {
			if(iseven.test(i)) {
				System.out.println(i);
			}
		}

	}
}
