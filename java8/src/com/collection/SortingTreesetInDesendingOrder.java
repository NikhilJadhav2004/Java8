package com.collection;

import java.util.Set;
import java.util.TreeSet;

public class SortingTreesetInDesendingOrder {

	public static void main(String[] args) {
		
		TreeSet<Integer> t=new TreeSet<Integer>();
         t.add(90);
         t.add(60);
         t.add(100);
         
         System.out.println("default:"+t);
         
         TreeSet<Integer> t1=new TreeSet<Integer>((a,b)->b-a);
         t1.add(90);
         t1.add(60);
         t1.add(100);
         System.out.println("customSorting:"+t1);
	}
}
