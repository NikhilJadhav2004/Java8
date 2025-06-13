package com.InheritanceInFunctionalInterface;

@FunctionalInterface
public interface Parent {

	void m1();
	
	default void m2() {
		System.out.println("m2");
	}
	static int m3() {
		return 10;
	}
	
	
}
