package com.LambdaAndFunctional;

public class Test {

	public static void main(String[] args) {
		
		Student s=()->System.out.println("om");
		s.getStudent();
		Student s1=()-> System.out.println("ram");
		s1.getStudent();
	}
}
