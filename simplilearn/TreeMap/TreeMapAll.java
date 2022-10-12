package com.simplilearn.TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapAll {
	public static void main(String[] args) {
		TreeMap<Integer, String> z= new TreeMap<Integer, String>();
		
		z.put(5, "Berlin");
		z.put(8, "Cumcum");
		z.put(15, "Theribaby");
		z.put(28, "Loveyou");
		z.put(44, "Sachin");
		System.out.println(z);
        TreeMap<Integer, String> z1= new TreeMap<Integer, String>();
		
		z1.put(78, "Ram");
		z1.put(19, "Laksman");
		z1.put(24, "Sita");
		z1.put(39, "Barathan");
		z1.put(84, "Chathurukan");
		System.out.println(z1);
		
		z.putAll(z1);
		System.out.println(z);
		
		if(z.containsKey(10)) {
			System.out.println("This is contains the key");
		}
		else {
			System.out.println("This does not contain the Key");
		}
		
		if(z.containsValue("Dos")) {
			System.out.println("This is contains the value");
		}
		else {
			System.out.println("This does not contain the Value");
		}
		
		System.out.println("The values are:");
		Set<Integer> Keys= z.keySet();
		for(Integer s:Keys) {
		System.out.println(s);
		}
		
		System.out.println("Iterate using for each loop");
		for(Map.Entry<Integer, String> dog: z.entrySet()) {
			System.out.println(dog.getKey()+"  "+dog.getValue());
		}

		
		
	}

}
