package com.defaultAndStaticMethodInintreface;

public interface A {

	default void add(int a,int b) {
		System.out.println("add:"+a+b);
	}
	static void m1() {
		System.out.println("static 1");
	}
}
