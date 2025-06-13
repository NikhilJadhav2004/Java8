package com.defaultAndStaticMethodInintreface;

public interface Welcome {

	public void m1();
	
	default void m2() {
		System.out.println("m2");
	}
	static void m3() {
		System.out.println("static");
	}
}


