package com.defaultAndStaticMethodInintreface;

public interface B {


	default void add(int a,int b) {
		System.out.println("add:"+a+b);
	}

	static void m1() {
		System.out.println("static 2");
	}
	//we can write main method in interface use java8
	public static void main(String[] args) {
		
		B.m1();
		
		B b=new B() {};//anonymous class that can provide quick implementation of interface or abstract methods
		b.add(2, 22);
		
	}
}
