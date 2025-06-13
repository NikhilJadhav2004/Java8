package com.defaultAndStaticMethodInintreface;

public class Test2 implements A,B {

	public static void main(String[] args) {
		
		Test2 a=new Test2();
		a.add(10, 29);
		A.m1();
		B.m1();
		
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		A.super.add(a, b);
	}
	
}
