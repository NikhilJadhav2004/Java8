package com.AnanomousClassInjava;

public class AnanomousClass {

	Employee e=new Employee() {
		
		int z=9;//it is instance variable
		//extra annanomous class cretae to provied implementation of interface 
		//without cretaing the extra class it is similar to lambda
		@Override
		public void getSalay() {
			
			System.out.println("90");
		}
		
		@Override
		public void getEmp() {
			// TODO Auto- method stub
			System.out.println("pm");
			
		}
	};
}
