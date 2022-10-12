package com.simplilearn.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HasMapAll {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> a= new HashMap<>();
		
		a.put(1, "Chennai");
		a.put(2, "Coimbatore");
		a.put(3, "Trichy");
		a.put(4, "Madurai");
		a.put(5, "salem");
		System.out.println(a);
		
		System.out.println("Iterate using for each loop");
		for(Map.Entry<Integer, String> entry:a.entrySet()) {
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
		System.out.println("Iterate using iterator");
		Iterator<Map.Entry<Integer, String>> z=a.entrySet().iterator();
		while(z.hasNext()) {
			Map.Entry<Integer, String> entry= z.next();
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
		System.out.println("The Size of the treeset is: "+a.size());
		
		
		

	}

}
