package com.defaultAndStaticMethodInintreface;

public class Test implements Welcome {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("override");
	}
	public static void main(String[] args) {
		
		Test t=new Test();
		t.m1();
		t.m2();
		
		Welcome.m3();
		
	}

}
