package com.collection;

public class SortingOnobjectComparator {

	int id;
	
	String name;
	SortingOnobjectComparator(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+"------"+name;
	}
}
