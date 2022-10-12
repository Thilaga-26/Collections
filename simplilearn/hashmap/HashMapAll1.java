package com.simplilearn.hashmap;

import java.util.HashMap;

public class HashMapAll1 {
	
	public static void main(String[] args) {
		
     HashMap<Integer, String> a= new HashMap<>();
		
		a.put(1, "Chennai");
		a.put(2, "Coimbatore");
		a.put(3, "Trichy");
		a.put(4, "Madurai");
		a.put(5, "salem");
		System.out.println(a);
		
	 HashMap<Integer, String> a1= new HashMap<>();
	    a1.put(6, "vellore");
		a1.put(7, "karur");
		a1.put(8, "dindugal");
		a1.put(9, "hosur");
		a1.put(10, "tirupur");
		System.out.println(a1);
     HashMap<Integer, String> a2= new HashMap<>();
        a2=(HashMap)a.clone();
        System.out.println(a2);

		
		
		a.putAll(a1);
		System.out.println(a);
		
		a.clear();
		System.out.println(a);
		
		System.out.println("Whether the map contains key-value mappings empty or not: "+a.isEmpty());
		
		
	}

}
