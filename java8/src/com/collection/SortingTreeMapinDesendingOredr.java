package com.collection;

import java.util.Map;
import java.util.TreeMap;

public class SortingTreeMapinDesendingOredr {

	
    public static void main(String[] args) {
    	Map<Integer, String> map=new TreeMap<Integer, String>();
    	map.put(1, "om");
    	map.put(6, "ram");
    	map.put(5, "sham");
    	System.out.println(map);
    	System.out.println("--------------------------------");
    	Map<Integer, String> map1=new TreeMap<Integer, String>((a,b)->b-a);
    	map1.put(1, "om");
    	map1.put(6, "ram");
    	map1.put(5, "sham");
    	System.out.println(map1);
    	
	}	
}
