package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCustomSorting {

	public static void main(String[] args) {
		
		SortingOnobjectComparator s1=new SortingOnobjectComparator(12, "om");
		SortingOnobjectComparator s2=new SortingOnobjectComparator(18, "ram");
		SortingOnobjectComparator s3=new SortingOnobjectComparator(1, "sham");

		List<SortingOnobjectComparator> list=new ArrayList<SortingOnobjectComparator>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		System.out.println(list);
		
		Collections.sort(list,(a,b)->b.id-a.id);
		System.out.println("sortedList:"+list);
		 
	}
}
