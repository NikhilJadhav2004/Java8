package com.InbuildFuctionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) {
		
		Predicate<Integer> condn=(x)->x%2==0;//it hold the condition and check it
		
		Function<Integer, Integer> fun=(x)->x*x;//function perform the operation
		
		Consumer<Integer> con=(x)->System.out.println(x);//return void
		
		Supplier<Integer> sup=()->100;//supply the something
		
		if(condn.test(sup.get())) {
             con.accept(fun.apply(sup.get()));
	
		}
		
		
		
	}
}
