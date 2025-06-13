package com.threadcreation;

public class UsingLambda {

	public static void main(String[] args) {
		
		Runnable runable=()->{
			for(int i=0;i<5;i++) {
				System.out.println("hellow");
			}
		};
		
		Thread t=new Thread(runable);
		t.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("by");
		}
		
		
	}
}
