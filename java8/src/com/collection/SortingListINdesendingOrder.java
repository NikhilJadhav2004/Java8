package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingListINdesendingOrder {

	
public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
      list.add(10);
      list.add(5);
      list.add(38);
      System.out.println("orignallist:"+list);
      Collections.sort(list);
      System.out.println("SortingInBydefault:"+list);
      
      //we can implement the comparator interface using the lambda expretions
      
      Collections.sort(list, (a,b)->b-a);
      System.out.println("desending:"+list);
}	
}
