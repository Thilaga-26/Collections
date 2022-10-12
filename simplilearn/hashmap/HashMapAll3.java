package com.simplilearn.hashmap;

import java.util.HashMap;
import java.util.Set;

public class HashMapAll3 {
	
	public static void main(String[] args) {
       HashMap<Integer, String> a= new HashMap<>();
		
		a.put(1, "Chennai");
		a.put(2, "Coimbatore");
		a.put(3, "Trichy");
		a.put(4, "Madurai");
		a.put(5, "salem");
		System.out.println(a);
		if(a.containsValue("Trichy")) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		Set set=a.entrySet();
		System.out.println(set);
		
		Set keyset= a.keySet();
		System.out.println(keyset);
		
		System.out.println(a.get(3));
		
		System.out.println(a.values());

			}

}
